# Student Management System 🎓

A simple Spring Boot web application for managing student information.  
Built using Java, Spring Boot, Thymeleaf, and MySQL Database.

---

## 📌 Features

- Add, update, find, and delete student records
- Backend powered by Spring Boot
- Frontend: Thymeleaf for server-side rendering of dynamic HTML pages
- MySQL integration using Spring Data JPA

---

## 🛠️ Tech Stack

- **Backend:** Java 21, Spring Boot, Spring MVC, Spring Data JPA
- **Frontend:** Thymeleaf, HTML, CSS, JavaScript
- **Database:** MySQL

---

⛓️‍💥 Live Site: https://student-management-system-52v2.onrender.com/students

## 🚀 Getting Started

### 1️⃣ Clone the repository

```bash
git clone https://github.com/aaditya-kr5892/StudentManagementSystem
cd StudentManagementSystem
```

### 2️⃣ Configure application.properties
⚠️ This file is ignored from Git.
Create src/main/resources/application.properties and add your DB config:
```bash
properties

spring.datasource.url=jdbc:mysql://localhost:3306/your_db_name
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
server.port=8080
```
Replace placeholders with your actual DB credentials.

### 3️⃣ Run the Application
Option 1: Using IntelliJ
- Right-click StudentManagementSystemApplication.java
- Click Run

Option 2: Using Maven
```bash
./mvnw spring-boot:run
```

🔍 Access the App
- Web App: http://localhost:8080/students





