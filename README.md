# Spring Boot Login System

## Overview
This is a Spring Boot-based login system that provides authentication and user management features. It is built using Java and leverages Spring Security for secure login and session management.

## Features
- User authentication with Spring Security
- Role-based access control (RBAC)
- Secure password hashing with BCrypt
- RESTful API endpoints for login and user management
- Configurable user database with MySQL
- Session handling and logout functionality

## Technologies Used
- **Java 17+**
- **Spring Boot** (Spring Security, Spring Data JPA, Spring Web)
- **Maven** (Dependency Management)
- **MySQL** (Database)
- **Bootstrap** (For frontend)

## Setup Instructions

### Prerequisites
Ensure you have the following installed:
- JDK 17+
- Maven
- MySQL (or any preferred database)

### Installation & Running
1. Clone the repository:
   ```sh
   git clone https://github.com/your-username/spring-boot-login-jwt.git
   cd spring-boot-login-jwt
   ```

2. Configure the database in `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/your_database
   spring.datasource.username=root
   spring.datasource.password=your_password
   ```

3. Build and run the project:
   ```sh
   mvn clean install
   mvn spring-boot:run
   ```

4. Access the application at:
   ```
   http://localhost:8080/index.html
   ```

## API Endpoints
| Endpoint           | Method | Description |
|-------------------|--------|-------------|
| `api/login`         | POST   | User login |
| `api/register`      | POST   | User registration |
| `api/protected`     | GET    | Access protected resource after login |

### Accessing Protected APIs
To access protected API endpoints after logging in:
1. First, log in using the `/login` endpoint with valid credentials.
2. The server responds with a session or JWT token.
3. Use the token in the Authorization header to access protected routes:
   ```sh
   curl -H "Authorization: Bearer YOUR_ACCESS_TOKEN" http://localhost:8080/protected
   ```

## Security
- Passwords are securely stored using BCrypt hashing.
- JWT authentication can be added for token-based security.
- Role-based authorization ensures restricted access.

## Contributing
Feel free to fork the repository, make enhancements, and submit a pull request.

## License
This project is open-source and available under the [MIT License](LICENSE).

