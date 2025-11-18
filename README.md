# 🎓 CampusTracker – Student Management System

CampusTracker is a Spring Boot–based Student Management System that provides seamless CRUD operations for managing student records. It follows a clean layered architecture using Controller, Service, and Repository layers.

---

## 🚀 Features
- Add new student records  
- Update existing student details  
- Fetch all students or specific student by ID  
- Delete student using ID  
- Follows MVC architecture with Service Layer  
- Uses Spring Data JPA for database operations  

---

## 🛠️ Technologies Used
- Java  
- Spring Boot  
- Spring Web  
- Spring Data JPA  
- MySQL  
- Hibernate  

---

## 📂 Project Structure
src/main/java/com/sms/main<br>
│<br>
├── controllers/ # REST APIs<br>
├── entity/ # JPA Entity Class<br>
├── repository/ # JPA Repository Interface<br>
└── services/ # Service Layer Logic

---

## ⚙️ API Endpoints

GET /api/students  
GET /api/students/{id}  
POST /api/students/add  
PUT /api/students/{id}  
DELETE /api/students/{id}  

---
## 🗄️ Database Configuration (application.properties)

spring.application.name=CampusTracker  
spring.datasource.url=jdbc:mysql://localhost:3306/studentDB  
spring.datasource.username=root  
spring.datasource.password=Admin@1234  

spring.jpa.hibernate.ddl-auto=update  
spring.jpa.show-sql=true  

---

## ▶️ How to Run the Project

1. Clone the repository
2. Open in IntelliJ/Eclipse
3. Create MySQL DB
4. Update credentials
5. Run Spring Boot App
6. Test APIs

---

## 📌 Future Enhancements

- Pagination & sorting  
- Hibernate validation  
- Swagger API docs  
- React/Angular frontend 
