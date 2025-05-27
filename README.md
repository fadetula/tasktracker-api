# Task Tracker API

A simple Task Tracker REST API built with Spring Boot.  
Supports full CRUD operations for tasks, ideal as a backend starting point for web and mobile apps.

## Features

- Spring Boot 3.x / Java 17
- RESTful API for task management
- In-memory storage (easy to extend to database)
- Complete OpenAPI/Swagger documentation

## Endpoints

| Method | Endpoint         | Description           |
|--------|------------------|----------------------|
| GET    | /api/tasks       | Get all tasks        |
| GET    | /api/tasks/{id}  | Get task by ID       |
| POST   | /api/tasks       | Create new task      |
| PUT    | /api/tasks/{id}  | Update task by ID    |
| DELETE | /api/tasks/{id}  | Delete task by ID    |

## Getting Started

1. **Clone the repository:**
    ```sh
    git clone https://github.com/fadetula/tasktracker-api.git
    cd tasktracker-api
    ```

2. **Build and run:**
    ```sh
    # Using Gradle wrapper (preferred)
    ./gradlew bootRun
    # Or in Eclipse: Run as > Spring Boot App
    ```

3. **Access Swagger UI:**
    - [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## Example Task JSON

```json
{
  "id": "123",
  "title": "Finish project",
  "description": "Wrap up demo and documentation",
  "dueDate": "2024-12-01",
  "status": "in progress"
}
```

## License
MIT (or specify your choice)
