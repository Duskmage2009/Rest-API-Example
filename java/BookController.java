package com.example.catalogueapi.controller;

import com.example.catalogueapi.model.Book;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/customer/book")
public class BookController {

    private Map<Long, Book> bookDatabase = new HashMap<>();
    private long idCounter = 1;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Book createBook(@RequestBody Book book) {
        book.setId(idCounter++);
        bookDatabase.put(book.getId(), book);
        return book;
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        Book book = bookDatabase.get(id);
        if (book == null) {
            throw new BookNotFoundException("Book not found with ID: " + id);
        }
        return book;
    }

    @PutMapping("/update/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
        Book existingBook = bookDatabase.get(id);
        if (existingBook == null) {
            throw new BookNotFoundException("Book not found with ID: " + id);
        }
        book.setId(id);
        bookDatabase.put(id, book);
        return book;
    }

    @DeleteMapping("/delete/{id}")
    public Book deleteBook(@PathVariable Long id) {
        Book book = bookDatabase.remove(id);
        if (book == null) {
            throw new BookNotFoundException("Book not found with ID: " + id);
        }
        return book;
    }
}