# Compass Uol Race Challenge
Week 12 Challenge with Java 17, MongoDB, RabbitMQ, OpenFeign and Microservices.

# Cars, History, and Races Microservices

This project consists of three microservices: cars, history, and races, which interact with each other to manage and track information related to vehicles and races. The project utilizes Docker, RabbitMQ, OpenFeign, and MongoDB.

## Prerequisites

Before you begin, make sure you have the following tools and dependencies installed:

- Docker: [Install Docker](https://docs.docker.com/get-docker/)
- Docker Compose: [Install Docker Compose](https://docs.docker.com/compose/install/)
- RabbitMQ: You can run RabbitMQ using Docker. Ensure it's available on port `5672`.
- MongoDB: You can run MongoDB using Docker or install it locally.

## Getting Started

1. Clone this repository:

   ```shell
   git clone https://github.com/natanflima/CompassRaceChallenge.git

2. Start the Services:

    Use Docker Compose to start the microservices along with RabbitMQ and MongoDB:
  
  ```shell

    docker-compose up -d
