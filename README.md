# Spring Security Project

## Overview

This project is a Spring Boot application that demonstrates how to implement common security features using Spring Security. The main focus is on providing authentication and authorization mechanisms, including:

- **User Registration & Login**
- **Password Hashing with Bcrypt**
- **JSON Web Token (JWT) Authentication**
- **Google OAuth2 Authentication**

This project can be used as a reference for securing your Spring Boot applications with a combination of standard login, JWT, and social login (Google OAuth2).

## Features

1. **User Registration & Login:**
   - Users can register by providing a username, email, and password.
   - Upon successful registration, a user can log in using their credentials.
   
2. **Password Hashing with Bcrypt:**
   - The password is securely hashed using the Bcrypt algorithm to ensure that sensitive information is not stored in plain text.
   
3. **JWT Authentication:**
   - After successful login, users receive a JWT token which can be used to authenticate future requests. 
   - JWT tokens provide a stateless way to authenticate users across requests without the need for session management.

4. **Google OAuth2 Authentication:**
   - The application supports authentication via Google OAuth2, allowing users to log in using their Google accounts.

## Technologies Used

- **Spring Boot:** The application is built with Spring Boot, providing a simple and efficient way to set up the backend.
- **Spring Security:** Used for securing the application, managing authentication, and authorization.
- **Spring Data JPA:** For interacting with the database to persist user information.
- **JWT (JSON Web Token):** Used for stateless authentication between the server and client.
- **Bcrypt:** A strong hashing algorithm for securely storing user passwords.
- **Google OAuth2:** For integrating third-party login with Google accounts.

## Setup

### Prerequisites

1. **JDK 11 or higher** installed.
2. **Maven** for dependency management.
3. An **IDE** (e.g., IntelliJ IDEA, Eclipse) to work with the project.
4. A **Postgres** or any relational database system for storing user data.

### Clone the repository

```bash
git clone https://github.com/sohaib-elouahhabi/SpringSecurityProject.git
cd spring-security-project
