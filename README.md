# 🎯 Quiz Competition System

<div align="center">

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge\&logo=java)
![JDBC](https://img.shields.io/badge/JDBC-Database-blue?style=for-the-badge)
![MySQL](https://img.shields.io/badge/MySQL-8.0-00758F?style=for-the-badge\&logo=mysql)
![Console App](https://img.shields.io/badge/Platform-Console_App-green?style=for-the-badge)

### 🧠 A Simple Java JDBC Based Quiz Competition Application

</div>

---

## 📌 Overview

**Quiz Competition System** is a console-based Java application developed using **JDBC** and **MySQL**. The project allows:

* 👨‍🏫 Admins to add quiz questions
* 👨‍🎓 Users to participate in quizzes
* 🏆 Score tracking and leaderboard management
* 🎲 Randomized question generation

This project is perfect for beginners learning:

* Core Java
* JDBC Connectivity
* MySQL Database Operations
* CRUD Operations
* Console-based Application Development

---

# ✨ Features

## 👨‍💼 Admin Panel

* Add new quiz questions
* Store questions directly into the database
* Define correct answers

## 👨‍🎓 User Quiz Module

* Enter username before starting quiz
* Randomly fetches 5 questions from database
* Multiple choice question format
* Automatic score calculation

## 🏆 Score Card

* Displays all participant scores
* Leaderboard sorted by highest score

---

# 🛠️ Technologies Used

| Technology  | Purpose                 |
| ----------- | ----------------------- |
| Java        | Core Programming        |
| JDBC        | Database Connectivity   |
| MySQL       | Database Management     |
| Eclipse IDE | Development Environment |

---

# 📂 Project Structure

```bash
QuizCompetition/
│
├── Admin.java            # Handles admin operations
├── Quiz.java             # Quiz logic and score handling
├── MainApp.java          # Main entry point
├── DBConnection.java     # Database connection setup
│
└── Database Tables
    ├── question
    └── result
```

---

# 🗄️ Database Setup

## Step 1: Create Database

```sql
CREATE DATABASE quizcompetition;
```

## Step 2: Use Database

```sql
USE quizcompetition;
```

## Step 3: Create Question Table

```sql
CREATE TABLE question (
    id INT PRIMARY KEY AUTO_INCREMENT,
    question VARCHAR(255),
    option1 VARCHAR(255),
    option2 VARCHAR(255),
    option3 VARCHAR(255),
    option4 VARCHAR(255),
    correct_option INT
);
```

## Step 4: Create Result Table

```sql
CREATE TABLE result (
    id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(100),
    score INT
);
```

---

# ⚙️ JDBC Configuration

Update your database credentials inside:

```java
DBConnection.java
```

Example:

```java
String url = "jdbc:mysql://localhost:3306/quizcompetition";
String username = "root";
String password = "your_password";
```

---

# ▶️ How to Run the Project

## 1️⃣ Clone the Repository

```bash
git clone https://github.com/your-username/QuizCompetition.git
```

## 2️⃣ Open in Eclipse / IntelliJ

Import the project into your Java IDE.

## 3️⃣ Add MySQL JDBC Driver

Download and add:

```bash
mysql-connector-j.jar
```

## 4️⃣ Run MainApp.java

```bash
MainApp.java
```

---

# 🖥️ Application Flow

```text
Quiz Competition

1. Admin
2. User
3. Score
```

### Admin

* Add quiz questions into database

### User

* Enter name
* Attend quiz
* Get final score

### Score

* View leaderboard

---

# 📸 Sample Console Output

```text
Quiz Competition
Enter your choice:
1. Admin
2. User
3. Score

Enter your name: Rahul

What is Java?
1. Programming Language
2. Operating System
3. Browser
4. Database

Your Answer: 1

Final Score: 5/5
```

---

# 🚀 Future Enhancements

* ✅ GUI Version using Java Swing / JavaFX
* ✅ Timer Based Quiz
* ✅ Difficulty Levels
* ✅ Admin Authentication
* ✅ Negative Marking
* ✅ Online Multiplayer Quiz
* ✅ Result Analytics Dashboard

---

# 📚 Learning Outcomes

This project helps you understand:

* JDBC CRUD Operations
* PreparedStatement Usage
* Database Integration in Java
* Console Input Handling
* SQL Query Execution
* Java Project Structure

---

# 🤝 Contributing

Contributions are welcome!

If you'd like to improve this project:

1. Fork the repository
2. Create a new branch
3. Commit your changes
4. Push to GitHub
5. Open a Pull Request

---

# ⭐ Support

If you found this project useful:

🌟 Star the repository
🍴 Fork the project
📢 Share with others

---

# 👨‍💻 Author

**Developed with ❤️ using Java & JDBC**

---

<div align="center">

## 🎉 Thank You for Visiting!

</div>
