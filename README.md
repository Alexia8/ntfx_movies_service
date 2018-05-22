# ntfx_movies_service

ntfx_movies_service is a RESTFul API Service that handles operations for movies.

## Prerequisites

```
Java 8
```

```
Git 2.14.*
```

```
MySQL 5.7.*
```


```
Docker 18.*.*
```

```
Maven 3.5.*
```

## Installing & Local deployment

Clone the repository locally and access the project

```
git clone https://github.com/Alexia8/ntfx_movies_service.git
cd ntfx_movies_service
```

Install all dependencies

```
mvn clean install -DskipTests
```

Start the app

```
java -jar target/ntfx-movies-service-0.0.1-SNAPSHOT.jar
```

Access the service in the browser

```
http://localhost:8090
```

## Deployment instructions

The service is configured for a future CI environment using Docker Images and Docker Compose. The current implementation supports manual deployment on local and remote environments.
Together with all the necessary settings and specified dependencies, the image will be run with a container Spring Boot profile `java -Dspring.profiles.active=container -jar ntfx-movies-service-0.0.1-SNAPSHOT.jar` which defines the correct application configuration file. 

### Build the Docker image

Access the root directory
```
cd ntfx_movies_service
```

Build the application artifact with the latest code
```
mvn clean install -DskipTests
```

Build the Docker image
```
docker build -t movies-service .
```

### Tag and Push the Docker image

Tag the image with ':latest'
```
docker tag movies-service moonflare/movies-service:latest
```

Push the image to Docker Hub
```
docker push moonflare/movies-service:latest
```

### Further documentation
- The image of the service is used in a separate configured `docker-compose.yml` file
- For a better understanding of Docker deployment follow the [official guides](https://docs.docker.com/get-started/)
