# ♻️ Automated Waste Management System

## 📌 Project Overview

The **Automated Waste Management System** is a Java-based application that demonstrates the **Chain of Responsibility Design Pattern** in waste disposal automation.

Municipalities face challenges in efficient waste collection, such as delayed pickup schedules, improper segregation, and high operational costs. This system helps automate waste disposal by assigning waste containers to the correct waste collector based on waste type and container capacity.

---

## 🎯 Objective

- Implement automated waste collection using Chain of Responsibility pattern  
- Handle different types of waste containers  
- Trigger disposal when containers are full  
- Ensure correct waste collector processes the waste  
- Maintain scalable and clean system architecture  

---

## 🏗 Design Pattern Used

### Chain of Responsibility Pattern

This pattern allows a request to be passed along a chain of handlers. Each handler decides whether to process the request or pass it to the next handler.

In this project:

- Each waste collector acts as a handler  
- Waste containers are the request objects  
- The system dynamically routes waste disposal tasks  

---

## 📂 Project Structure


AutomatedWasteManagementSystem/
│
├── WasteContainer.java
├── WasteCollector.java
├── OrganicCollector.java
├── RecyclableCollector.java
├── HazardousCollector.java
├── Main.java


---

## 💡 Features

- Waste container simulation with capacity tracking  
- Support for multiple waste types:
  - Organic Waste
  - Recyclable Waste
  - Hazardous Waste  

- Automated waste disposal triggering  
- Validation to ensure correct collector handling  

---

## ⚙️ How to Run the Project

### 1. Compile the Java files

Open terminal or command prompt inside the project folder and run:

javac *.java

### 2.  Run the program

java Main

## ✅ Expected Output

Organic container filled: 100/100
Recyclable container filled: 150/150
Hazardous container filled: 50/50
Organic Waste Collector disposing waste.
Recyclable Waste Collector processing recyclable materials.
Hazardous Waste Collector safely disposing hazardous waste.

## 👨‍💻 Author

- RODRIGO, JULIA T.
- BS COMPUTER SCIENCE / 3BSCS-1
- 25/02/26

## 📌 Notes

This project is created for educational purposes.

You may extend the system by adding more waste types or integrating database support.
