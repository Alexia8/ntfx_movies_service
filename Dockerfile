FROM openjdk:8
FROM maven:latest

WORKDIR /app

COPY . /app

RUN mvn -v
RUN mvn clean install -DskipTests
EXPOSE 8090
ADD ./target/ntfx-movies-service-0.0.1-SNAPSHOT.jar ntfx-movies-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-Dspring.profiles.active=container", "-jar", "ntfx-movies-service-0.0.1-SNAPSHOT.jar"]