# 📌 Student Management System (Java + MySQL)

## 📖 Description
This is a console-based Student Management System developed using Java with MySQL database integration.

The application allows users to add and view student records through a menu-driven interface. It uses JDBC for database connectivity and follows the DAO (Data Access Object) design pattern to separate business logic from database operations.

---

## 🚀 Features
- Add new student (Name & Email)
- View all students
- Data stored in MySQL database
- Menu-driven console interface
- Clean separation using DAO pattern

---

## 🛠️ Technologies Used
- Java
- MySQL
- JDBC (Java Database Connectivity)
- OOP (Object-Oriented Programming)

---

## 🧠 Project Structure
- `Main.java` → Handles user input and menu logic
- `Student.java` → Model class representing student entity
- `StudentDAO.java` → Handles database operations (Insert, Fetch)
- `DBConnection.java` → Manages database connection

---

## ⚙️ Database Configuration

### 📌 Database Name: studentDB

### 📌 Table Structure:
```sql
CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    email VARCHAR(100)
);

▶️ How to Run

1. Install MySQL and create database:
2. Create table (see above)
3. Update DB credentials in:
4. Open project in Eclipse or any Java IDE
5. Run Main.java