package com.example.catalogueapi.controller;

import com.example.catalogueapi.model.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private Map<Long, Customer> customerDatabase = new HashMap<>();
    private long idCounter = 1;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Customer createCustomer(@RequestBody Customer customer) {
        if (customerDatabase.values().stream().anyMatch(c -> c.getEmail().equals(customer.getEmail()))) {
            throw new CustomerAlreadyExistsException("Email is already taken");
        }
        customer.setId(idCounter++);
        customerDatabase.put(customer.getId(), customer);
        return customer;
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        Customer customer = customerDatabase.get(id);
        if (customer == null) {
            throw new CustomerNotFoundException("Customer not found with ID: " + id);
        }
        return customer;
    }

    @GetMapping("/email/{email}")
    public Customer getCustomerByEmail(@PathVariable String email) {
        return customerDatabase.values().stream()
                .filter(customer -> customer.getEmail().equals(email))
                .findFirst()
                .orElseThrow(() -> new CustomerNotFoundException("Customer not found with email: " + email));
    }

    @PutMapping("/update/{id}")
    public Customer updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {
        Customer existingCustomer = customerDatabase.get(id);
        if (existingCustomer == null) {
            throw new CustomerNotFoundException("Customer not found with ID: " + id);
        }
        customer.setId(id);
        customerDatabase.put(id, customer);
        return customer;
    }

    @DeleteMapping("/delete/{id}")
    public Customer deleteCustomer(@PathVariable Long id) {
        Customer customer = customerDatabase.remove(id);
        if (customer == null) {
            throw new CustomerNotFoundException("Customer not found with ID: " + id);
        }
        return customer;
    }

    @PostMapping("/login")
    public Customer login(@RequestBody Customer loginRequest) {
        return customerDatabase.values().stream()
                .filter(customer -> customer.getEmail().equals(loginRequest.getEmail()) &&
                        customer.getPassword().equals(loginRequest.getPassword()))
                .findFirst()
                .orElseThrow(() -> new CustomerNotFoundException("Invalid credentials"));
    }
}
