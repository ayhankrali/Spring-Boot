# Spring-Boot 
PROJECT DESCRIPTION

The Java Spring Boot project focuses on building a RESTful API for managing users and cars. It provides functionality for creating, retrieving, updating, and deleting users and cars through dedicated endpoints. The project utilizes the Spring framework and follows the principles of object-oriented programming.

TECHNOLOGIES USED
The project utilizes the following technologies:

Java

Spring Boot

Spring Data JPA

MySQL

Spring Validation

Lombok

Getting Started

To get started with the project, follow these steps:

Clone the repository to your local machine.

bash

Copy code

git clone https://github.com/your-username/java-spring-oop.git

Open the project in your preferred Java IDE (e.g., IntelliJ IDEA).

Set up the MySQL database:

Create a new database schema.

Configure the database connection properties in the application.properties file located in the src/main/resources directory.
Build and run the project.


The project should now be up and running, ready to accept API requests.

Project Structure

The project follows a standard Spring project structure, with the main components organized into separate packages. Here is an overview of the project structure:

com.example.demo

controller: Contains the API controllers for handling user and car requests.

dto: Contains Data Transfer Objects (DTOs) for user and car entities.

entity: Contains the user and car entity classes.

repository: Contains the Spring Data repositories for user and car entities.

service: Contains the service classes for user and car operations.

JavaSpringOopApplication.java: The main entry point of the application.

Usage
The project exposes several endpoints for managing users and cars. Here is a summary of the available endpoints:


User Endpoints
POST /users: Creates a new user.

GET /users/{id}: Retrieves a user by ID.

DELETE /users/{id}: Deletes a user by ID.

PUT /users/{id}: Updates a user by ID.

Car Endpoints

POST /cars: Creates a new car.

GET /cars/{id}: Retrieves a car by ID.

DELETE /cars/{id}: Deletes a car by ID.

PUT /cars/{id}: Updates a car by ID.

You can use tools like Postman to send requests to the API endpoints and perform the desired operations.


