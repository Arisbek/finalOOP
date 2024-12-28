# Stage 1: Build the application
FROM openjdk:21-jdk-slim AS build
RUN apt-get update && apt-get install -y maven
COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Create the Docker image to run the application
FROM openjdk:21-jdk-slim
COPY --from=build /target/FinalOOP-0.0.1-SNAPSHOT.jar FinalOOP.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "FinalOOP.jar"]
