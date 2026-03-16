# Skeleton Selenium WebDriver

Automation testing project using **Selenium WebDriver**, **Java 11**, and **Cucumber BDD (Gherkin)**.

---

## 🛠 Tech Stack
- Java 11
- Selenium WebDriver
- Cucumber BDD (Gherkin)
- Maven
- JUnit / TestNG
- WebDriverManager

---

## 📁 Project 
`````
TakeHomeTest
├── .idea
├── .mvn
├── pom.xml
├── README.md
├── src
│ ├── main
│ │ └── java
│ │ └── org
│ │ └── example
│ │ ├── Hook # Hook to initiate driver
│ │ ├── Pages # Pages Object Model
│ │ └── Utility # Utility
│ └── test
│ ├── java
│ │ └── com
│ │ └── example
│ │ └── stepDefinitions # Step Definitions
│ │ └── cucumberRunner.java # Test Runner
│ └── resources
│ └── Features # Gherkin feature files
│ ├── InputPage
│ ├── LoadingPage
│ ├── OpenWebsite
│ └── UploadedFile
├── target
└── .gitignore

`````


---

## 🧪 Test Framework Design
- **BDD approach** using Cucumber & Gherkin
- **Page Object Model (POM)** for maintainability
- Explicit wait using `WebDriverWait`
- Tests are written in **Given / When / Then** format

---

## ▶️ How to Run Tests

### Run all tests
``` 
Go to file cucumberRunner and put tags = "@Regression"

or used this comand bash

mvn clean test
```

### Run specific tests
``` 
Go to file cucumberRunner and put specitags = "@{specificTag}"

or used this comand bash

mvn test -Dcucumber.options="--tags @{specificTag}"
