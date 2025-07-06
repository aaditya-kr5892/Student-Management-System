FROM maven:3.9.4-eclipse-temurin-17 as build

WORKDIR /app
COPY . .

RUN mvn clean package -DskipTests

# ---- Final image ----
FROM openjdk:17-jdk-slim

WORKDIR /app

COPY --from=build /app/target/Student-Management-System-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
