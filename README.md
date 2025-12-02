#  University Management System  
**A Java-based academic administration system built with clean OOP architecture**

The *University Management System* is a console-based application developed in Java, designed to demonstrate strong understanding of Object-Oriented Programming, data modeling, and modular software design.  
It simulates core university operations, allowing users to manage departments, professors, students, academic analytics, and personalized searches through an intuitive menu-driven interface.

This project was developed with **Eclipse IDE (JavaSE-17)** and structured to follow professional standards for readability, maintainability, and clean source control.



##  Key Features

###  **Department & Personnel Management**
- Create academic departments
- Add professors, employees, undergraduate, and postgraduate students
- Automatically associate individuals with departments

###  **Search & Query Operations**
- Search students by **ID number**
- Search any person by **last name**
- List all people in a department with structured output

###  **Real Data Analytics**
- Compute **average student grades** per admission year
- Compute **average professor publications** per department

###  **Interactive Menu System**
A clean, text-based navigation menu guides users through all operations:
- Add data
- View structured information
- Run analytics
- Perform targeted searches
- Exit gracefully


##  Technical Concepts Demonstrated

###  Object-Oriented Programming  
The system implements inheritance, encapsulation, abstraction, and polymorphism through classes such as:
- `Person`
- `Student` (Undergraduate), `Graduate`
- `Employee`, `Professor`
- `Department`
- `University` (controller)

###  Clean Modular Architecture  
- Single responsibility per class  
- Logical package organization  
- Separation of concerns (input handling, data modeling, analytics, and output)

###  Console Interaction & Data Processing  
- Robust menu system  
- Dynamic lists of personnel and departments  
- Iterative algorithms for grade and publication statistics  

###  Professional SCM Practices  
- `.gitignore` used to maintain a clean repo  
- No compiled binaries or IDE trash  
- Readable commit structure  
- Compatible with all major Java IDEs

src/
└── universitysystem/
├── Main.java
├── University.java
├── Department.java
├── Person.java
├── Student.java
├── Graduate.java
├── Professor.java
└── Employee.java


##  Running the Application

### **1. Compile**
```bash
javac src/universitysystem/*.java
2. Run
java -cp src universitysystem.Main (Again, in bash)
Requires Java 17+.


The project was developed using Java SE 17 within the Eclipse IDE and managed through Git and GitHub, following an object-oriented programming paradigm and implemented as a console-based application. Its structure allows for significant future expansion, including potential migration to a full Spring Boot backend, integration with relational databases such as MySQL or PostgreSQL, the addition of a JavaFX graphical interface, and support for data persistence through CSV or JSON formats. The architecture is also suitable for exposing REST endpoints for departments, students, and professors, as well as incorporating comprehensive unit testing with JUnit.

Created as part of academic coursework and portfolio development, the system models real-world entities in Java, applies clean and scalable architecture principles, and designs multi-class software using core OOP concepts. It reflects disciplined use of professional development tools, including version control with Git and project organization techniques aligned with industry standards. The project is intended for evaluation by employers, instructors, and fellow developers as evidence of competency in Java and foundational backend development practices.

**The software is distributed under the MIT License**

Author

Dimitrios Dalaklidis is an aspiring backend developer with a strong academic foundation in Informatics and hands-on experience in systems programming, data structures, and software architecture. His work reflects a methodical approach to problem solving, supported by practical exposure to multi-language development environments and structured programming disciplines. He has completed a range of projects involving low-level system operations in C, object-oriented application design in Java, browser-based scripting, and networked communication models.

His technical interests center on backend system design, algorithmic efficiency, and the construction of reliable, maintainable software. He actively pursues opportunities to expand his expertise through academically driven projects and independent research, with an emphasis on building robust systems that adhere to professional development practices and modern software engineering principles.

For professional communication, he can be reached at: dalaklidesdemetres@gmail.com




## 📂 Project Structure

