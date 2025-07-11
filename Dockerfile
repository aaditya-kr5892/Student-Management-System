FROM maven:3.9.4-eclipse-temurin-21 AS build

WORKDIR /app
COPY . .

RUN mvn clean package -DskipTests

# Final runtime image
FROM eclipse-temurin:21-jdk

WORKDIR /app
COPY --from=build /app/target/Student-Management-System-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
