# Selenium-SkillBuilder

A production-grade UI test automation framework built with **Selenium WebDriver** and **Java**, demonstrating real-world implementation of the **Page Object Model (POM)** design pattern, reusable utilities, and data-driven testing.

---

## Tech Stack

| Tool | Purpose |
|------|---------|
| Java | Core programming language |
| Selenium WebDriver | Browser automation |
| TestNG | Test execution and management |
| Maven | Build and dependency management |
| Page Object Model | Design pattern for maintainability |

---

## Project Structure

```
Selenium-SkillBuilder/
├── src/
│   ├── main/java/
│   │   ├── pages/          # Page Object classes
│   │   └── utils/          # Reusable utility methods (driver setup, waits, etc.)
│   └── test/java/
│       ├── tests/          # Test classes
│       └── data/           # Test data files
├── reports/                # ExtentReports HTML output
├── testng.xml              # TestNG suite configuration
└── pom.xml                 # Maven dependencies
```

---

## Key Features

- **Page Object Model (POM)** - Separation of test logic from UI locators for easy maintenance
- **Reusable Utilities** - Common methods like browser setup, teardown, explicit waits, and screenshot capture
- **Cross-browser Ready** - Configurable to run on Chrome, Firefox, and Edge

---

## How to Run

### Prerequisites
- Java JDK 11+
- Maven 3.6+
- Chrome browser + ChromeDriver (or use WebDriverManager)

### Steps

```bash
# Clone the repository
git clone https://github.com/Ranjini-V/Selenium-SkillBuilder.git
cd Selenium-SkillBuilder

# Run all tests
mvn test

# Run a specific TestNG suite
mvn test -DsuiteXmlFile=testng.xml
```

## Concepts Demonstrated

- Explicit and implicit waits
- TestNG annotations (`@BeforeMethod`, `@AfterMethod`, `@DataProvider`)


---

## Author

**Ranjini V** - QA Automation Engineer  
[GitHub](https://github.com/Ranjini-V)
