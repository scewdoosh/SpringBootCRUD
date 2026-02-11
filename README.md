<h1 align="center">Spring Boot CRUD</h1>
A demo Spring Boot project implementing basic CRUD (Create, Read, Update, Delete) operations using MySQL.

Dependencies

- Spring Boot Starter Data JPA

- Spring Boot Starter Web MVC

- MySQL Connector/J

<h2 align="center">Database Configuration</h2>

Configure your application.properties with your MySQL database details.

### How to Run

Install Dependencies:

```mvn clean install```


Run the Application:

```mvn spring-boot:run```

<h2 align="center">API Endpoints</h2>

**exported json file for api endpoints is available in** ```postman_api_collection``` dir

Here are the available API endpoints for the Spring Boot CRUD application:

Test Endpoint

URL: ```http://localhost:3000/api/test```

Method: **GET**

Description: Checks if the API is running.

---

Create Cartoon

URL: ```http://localhost:3000/api/postcartoon```

Method: **POST**

Description: Creates a new cartoon entry in the database.

---
Get All Cartoons

URL: ```http://localhost:3000/api/all```

Method: **GET**

Description: Retrieves all cartoon entries from the database.

---
Update Cartoon

URL: ```http://localhost:3000/api/update/{id}```

Method: **PUT**

Description: Updates the cartoon entry with the specified ID.

---
Delete Cartoon

URL: ```http://localhost:3000/api/delete/{id}```

Method: **DELETE**

Description: Deletes the cartoon entry with the specified ID.
