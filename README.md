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
