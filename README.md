# Datadog with Spring Boot

This project demonstrates the integration of Datadog with a Spring Boot application. It includes basic CRUD operations for managing `Cliente` entities and is configured to send metrics and traces to Datadog.

## Features

- **CRUD Operations**: Manage `Cliente` entities with endpoints to list, save, and delete.
- **Datadog Integration**: Sends application metrics and traces to Datadog.
- **H2 Database**: In-memory database for development and testing.
- **Dockerized Setup**: Includes `docker-compose` for running the application with Datadog Agent.

## Technologies Used

- **Java 17**
- **Spring Boot**
- **H2 Database**
- **Datadog Agent**
- **Docker & Docker Compose**

## Prerequisites

- Docker and Docker Compose installed
- Java 17 installed
- Maven installed

## Setup Instructions

### 1. Clone the Repository

```bash
git clone https://github.com/lucaspari/datadog-with-spring.git
cd datadog-with-spring