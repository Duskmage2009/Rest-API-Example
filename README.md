## Customer

<span style="background: #209FEC; width: 10%; text-align: center; border-radius: 10%; padding: 3px 20px">POST</span> `customer/create` **_Create new account_**

> **_Request Class_**

```
{
   "email":"hhhh@gmail.com",
   "fist_name":"John",
   "last_name":"Smith",
   "password":"*****",
   "age": 22
}
```

> **_Response Class_**

```
{
   "id": 11,
   "email":"hhhh@gmail.com",
   "fist_name":"John",
   "last_name":"Smith",
   "password":"*****",
   "age": 22
}
```

> **_Response Messages_**

<p style="color:green;">Success 201 Created</p>
<p style="color:red;">Failure 409 Invalid credentials</p>
<hr/>

<br/>

<span style="background: green; max-width: 10%; text-align: center; border-radius: 10%; padding: 3px 20px">GET</span> `customer/{id}` **_Get customer by id_**

> **_Template Parameters_**

**{id} - valid int id**

> **_Response Class_**

```
{
   "id": 11,
   "email":"hhhh@gmail.com",
   "fist_name":"John",
   "last_name":"Smith",
   "password":"*****",
   "age": 22
}
```

> **_Response Messages_**

<p style="color:green;">Success 200 OK</p>
<p style="color:red;">Failure 404 Not Found</p>
<hr/>

<br/>

<span style="background: green; width: 10%; text-align: center; border-radius: 10%; padding: 3px 20px">GET</span> `customer/{email}` **_Get customer by email_**

> **_Template Parameters_**

**{email} - valid unique email address**

> **_Response Class_**

```
{
   "id": 11,
   "email":"hhhh@gmail.com",
   "fist_name":"John",
   "last_name":"Smith",
   "password":"*****",
   "age": 22
}
```

> **_Response Messages_**

<p style="color:green;">Success 200 OK</p>
<p style="color:red;">Failure 404 Not Found</p>
<hr/>

<br/>

<span style="background: #EC7A20; width: 10%; text-align: center; border-radius: 10%; padding: 3px 20px">PUT</span> `customer/update/{id}` **_Update customer's profile data_**

> **_Template Parameters_**

**{id} - valid int id**

> **_Request Class_**

```
{
   "email":"hhhh@gmail.com",
   "fist_name":"John",
   "last_name":"Thomas",
   "password":"*****",
   "age": 22
}
```

> **_Response Class_**

```
{
   "id": 11,
   "email":"hhhh@gmail.com",
   "fist_name":"John",
   "last_name":"Thomas",
   "password":"*****",
   "age": 22
}
```

> **_Response Messages_**

<p style="color:green;">Success 200 OK</p>
<p style="color:red;">Failure 404 Not Found</p>
<hr/>

<br/>

<span style="background: red; width: 10%; text-align: center; border-radius: 10%; padding: 3px 20px">DELETE</span> `customer/delete/{id}` **_Delete account_**

> **_Template Parameters_**

**{id} - valid int id**

> **_Response Class_**

```
{
   "id": 11,
   "email":"hhhh@gmail.com",
   "fist_name":"John",
   "last_name":"Smith",
   "password":"*****",
   "age": 22
}
```

> **_Response Messages_**

<p style="color:green;">Success 200 OK</p>
<p style="color:red;">Failure 404 Not Found</p>
<hr/>

<br/>

<span style="background: #209FEC; width: 10%; text-align: center; border-radius: 10%; padding: 3px 20px">POST</span> `customer/login` **_Login into system_**

> **_Request Class_**

```
{
   "email":"hhhh@gmail.com",
   "password":"*****"
}
```

> **_Response Class_**

```
{
   "id": 11,
   "email":"hhhh@gmail.com",
   "fist_name":"John",
   "last_name":"Thomas",
   "password":"*****",
   "age": 22,
   jwt: "HjajhkhHDk12hGIWJ"
}
```

> **_Response Messages_**

<p style="color:green;">Success 200 OK</p>
<p style="color:red;">Failure 404 Not Found</p>
<p style="color:red;">Failure 409 Conflict</p>
<hr/>

<br/>

<span style="background: #209FEC; width: 10%; text-align: center; border-radius: 10%; padding: 3px 20px">POST</span> `customer/book/create` **_Create new book_**

> **_Request Class_**

```
{
   "title":"Alice's Adventures in Wonderland",
   "author":"Lewis Carroll",
   "content":"https://books.com/books/aliceinwonderland",
}
```

> **_Response Class_**

```
{
   "id": 20,
   "title":"Alice's Adventures in Wonderland",
   "author":"Lewis Carroll",
   "content":"https://books.com/books/aliceinwonderland",
}
```

> **_Response Messages_**

<p style="color:green;">Success 200 OK</p>
<p style="color:red;">Failure 404 Not Found</p>
<p style="color:red;">Failure 409 Conflict</p>
<hr/>

<br/>

<span style="background: #EC7A20; width: 10%; text-align: center; border-radius: 10%; padding: 3px 20px">PUT</span> `customer/book/update/{id}` **_Update book's details and content_**

> **_Request Class_**

```
{
   "id":20,
   "title":"Alice's Adventures in Wonderland",
   "author":"Lewis Carroll",
   "genre":"Literature nonsense",
   "content":"https://books.com/books/aliceinwonderland"
}
```

> **_Response Class_**

```
{
   "id": 20,
   "title":"Alice's Adventures in Wonderland",
   "author":"Lewis Carroll",
   "genre":"Literature nonsense",
   "content":"https://books.com/books/aliceinwonderland"
}
```

> **_Response Messages_**

<p style="color:green;">Success 200 OK</p>
<p style="color:red;">Failure 404 Not Found</p>
<p style="color:red;">Failure 409 Conflict</p>
<hr/>

<br/>

<span style="background: green; max-width: 10%; text-align: center; border-radius: 10%; padding: 3px 20px">GET</span> `customer/book/{id}` **_Read a book_**

> **_Template Parameters_**

**{id} - valid int id**

> **_Response Class_**

```
{
   "id": 20,
   "title":"Alice's Adventures in Wonderland",
   "author":"Lewis Carroll",
   "content":"https://books.com/books/aliceinwonderland"
}
```

> **_Response Messages_**

<p style="color:green;">Success 200 OK</p>
<p style="color:red;">Failure 404 Not Found</p>
<hr/>

<br/>

<span style="background: red; width: 10%; text-align: center; border-radius: 10%; padding: 3px 20px">DELETE</span> `customer/book/delete/{id}` **_Delete book_**

> **_Template Parameters_**

**{id} - valid int id**

> **_Response Class_**

```
{
   "id": 20,
   "title":"Alice's Adventures in Wonderland",
   "author":"Lewis Carroll",
   "content":"https://books.com/books/aliceinwonderland"
}
```

> **_Response Messages_**

<p style="color:green;">Success 200 OK</p>
<p style="color:red;">Failure 404 Not Found</p>
<p style="color:red;">Failure 405 Method not Allowed</p>
<hr/>

<br/>

## Given RESTful API belongs to the 3rd level of Richardson Maturity Model as it contains:

- Multiple URIs
- Appropriate HTTP methods
- Uses response codes
- Uses Hypermedia
