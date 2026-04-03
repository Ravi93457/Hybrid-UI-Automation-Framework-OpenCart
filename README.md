![Build](https://img.shields.io/badge/build-passing-brightgreen)
![Java](https://img.shields.io/badge/Java-17-blue)
# Hybrid UI Automation Framework – OpenCart

## 📌 Project Overview

This project is a scalable Hybrid Automation Framework developed for the OpenCart E-Commerce application using Selenium WebDriver with Java.

The framework is designed following industry best practices to ensure maintainability, reusability, and scalability.

---

## 🛠 Tech Stack

- Java
- Selenium WebDriver
- TestNG
- Page Object Model (POM)
- Apache POI (Data Driven Testing)
- Maven
- Jenkins
- Extent Reports
- Docker
- Git

---

## 🏗 Framework Architecture

The framework follows a Hybrid design combining:

- Page Object Model (POM)
- Data-Driven Testing
- Modular test structure
- Utility & reusable components

### Key Components:

- Page Classes (Encapsulated locators & actions)
- Test Classes (TestNG-based execution)
- Utilities (Waits, Excel reader, Config reader)
- Base Class (Driver setup & initialization)
- Extent Report integration

---

## 🔄 Automated Test Scenarios

- User Registration
- Login & Logout
- Product Search
- Add to Cart
- Checkout Process
- Order Confirmation

 Automated 30+ end-to-end test scenarios covering critical business flows

---
---
## 📂 Project Structure

src
 ├── main/java
 │    ├── base            → Driver setup & initialization
 │    ├── pageObjects     → Page classes (POM)
 │    ├── utilities       → Reusable utilities
 │
 ├── test/java
 │    ├── testCases       → Test scripts
 │
 ├── resources
 │    ├── testData        → Excel files
 │    ├── config          → Configuration files

testng.xml
pom.xml
---
## ⚙️ Execution

## ▶️ How to Execute Tests

### Run via Maven:
mvn clean test

### Run specific TestNG suite:
testng.xml

### Run in Jenkins:
- Configure job with GitHub repo
- Trigger build to execute test suite

### Run using Docker:
docker build -t automation-framework .
docker run automation-framework

---

## 📊 Reporting

- Extent HTML Reports generated after execution
- Screenshots captured on failure
- Logs integrated for debugging

---

## 🔁 CI/CD Integration

- Configured Jenkins pipeline for automated execution
- Docker container support for headless execution

---

## 📸 Sample Report

![Extent Report](https://github.com/user-attachments/assets/b628d236-894f-424b-8f3f-bf8b62fdb746)
---
---
## 💡 Why This Framework?

- Designed for scalability in large test suites
- Reduces code duplication using reusable components
- Easy to integrate with CI/CD pipelines
- Supports parallel execution to reduce execution time
---

## 🎯 Key Highlights

- Reusable Page Objects
- Data-Driven architecture
- CI-integrated automation
- Scalable & maintainable framework design
