[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title
---
Student Attendance Management System
## Problem Statement (max 150 words)

---
Manual attendance tracking in educational institutions is often inefficient, human error and lacks real-time accessibility. Educators frequently struggle with maintaining physical registers or static spreadsheets that do not provide instant analytics on student participation. The proposed system addresses these issues by utilizing a structured object-oriented hierarchy to model students and attendance records. By automating the calculation of attendance percentages and providing instant report generation, the system ensures data integrity, reduces administrative workload, and offers clear visibility into student performance trends.
## Target User
---
To add students to the database and perform a daily "roll call" through the console. To view comprehensive attendance reports and identify students with low participation.
## Core Features

- Student Record Management: Add, update, and delete student profiles with unique identifiers.
-  Real-Time Analytics: Automatic calculation of attendance percentages for every student.
- Robust Exception Handling: Validation for user inputs and data processing errors.
- Persistent Data Storage: Ability to save and load student records for long-term tracking.
---

## OOP Concepts Used

- Abstraction:Abstract Person class defining shared behaviors and attributes like id and name.
- Inheritance:Specialized Student subclass extending the Person class to include attendance-specific data.
- Polymorphism:displayInfo() is overridden in Student.
- Exception Handling:try-catch handles invalid input and errors.
- Collections / Threads:ArrayList stores students; threads not used.

---

## Proposed Architecture Description

---
The system follows a layered architecture with clear separation of concerns. The Person abstract class represents the base entity, extended by Student to handle attendance logic. AttendanceManager acts as the service layer, managing student data and operations using an ArrayList. The Main class serves as the presentation layer, handling user interaction through a menu-driven interface. Data flows from user input to business logic and back as output, ensuring modularity, maintainability, and scalability.
## How to Run

---
Open project in Vscode
Mark src as Sources Root
Run Main.java
## Git Discipline Notes
Minimum 10 meaningful commits required.
