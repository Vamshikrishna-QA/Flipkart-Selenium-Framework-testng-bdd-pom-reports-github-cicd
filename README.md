# Flipkart Test Automation Framework (Selenium, TestNG, BDD)

![CI Build Status](https://github.com/Vamshikrishna-QA/Flipkart-Selenium-Framework-testng-bdd-pom-reports-github-cicd/actions/workflows/ci.yml/badge.svg)

## 🚀 Overview

This repository contains a robust, end-to-end test automation framework built to test the Flipkart e-commerce website. It leverages a powerful tech stack including **Selenium WebDriver, Java, TestNG, and Cucumber** to create a scalable and maintainable testing solution.

The framework is architected using the **Page Object Model (POM)** for clean code and reusability. It follows the **Behavior-Driven Development (BDD)** approach, allowing test cases to be written in a simple, human-readable language. The entire testing lifecycle is automated through a **CI/CD pipeline using GitHub Actions**.

---

## ✨ Key Features

* **BDD Scenarios:** Gherkin-based `.feature` files for writing test cases that are easily understood by technical and non-technical stakeholders.
* **Page Object Model (POM):** Ensures a clean separation of test logic from UI element locators, making the framework highly maintainable.
* **TestNG Framework:** Utilizes TestNG for powerful test management, including assertions, parallel execution, and test suite configuration (`testng.xml`).
* **Advanced Reporting:** Generates detailed and interactive HTML reports (e.g., Extent Reports) with test steps, statuses, and screenshots for failures.
* **CI/CD Integration:** Fully automated test execution on every push to the `main` branch via a pre-configured GitHub Actions workflow.
* **Configuration Management:** Externalizes test data and environment configurations (URLs, credentials) using properties files for easy management.
* **Cross-Browser Support:** Can be easily configured to run tests across different browsers like Chrome and Firefox.

---

## 🛠️ Tech Stack & Tools

| Component         | Technology / Tool                                 |
| ----------------- | ------------------------------------------------- |
| **Language** | Java 11                                           |
| **Automation Tool** | Selenium WebDriver                                |
| **BDD Framework** | Cucumber                                          |
| **Test Runner** | TestNG                                            |
| **Build Tool** | Apache Maven                                      |
| **CI/CD** | GitHub Actions                                    |
| **Reporting** | Extent Reports / Cucumber Reports                 |
| **Utilities** | Apache POI (for data-driven testing from Excel)   |

---

## ⚙️ Getting Started

### Prerequisites

* Java Development Kit (JDK) 11 or higher
* Apache Maven
* Google Chrome browser

### Installation & Setup

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/Vamshikrishna-QA/Flipkart-Selenium-Framework-testng-bdd-pom-reports-github-cicd.git](https://github.com/Vamshikrishna-QA/Flipkart-Selenium-Framework-testng-bdd-pom-reports-github-cicd.git)
    ```
2.  **Navigate to the project directory:**
    ```bash
    cd Flipkart-Selenium-Framework-testng-bdd-pom-reports-github-cicd
    ```
3.  **Install dependencies:** Maven will automatically download all the required project dependencies defined in `pom.xml`.
    ```bash
    mvn clean install
    ```

---

## ▶️ How to Run Tests

### 1. From the Command Line (All Tests)

Execute the entire test suite as defined in the `pom.xml`.
```bash
mvn test

Of course. Here is a complete, professional README.md file based on your project's name and the features we've set up.

Just copy the entire content below and paste it into the README.md file in your GitHub repository.

Markdown

# Flipkart Test Automation Framework (Selenium, TestNG, BDD)

![CI Build Status](https://github.com/Vamshikrishna-QA/Flipkart-Selenium-Framework-testng-bdd-pom-reports-github-cicd/actions/workflows/ci.yml/badge.svg)

## 🚀 Overview

This repository contains a robust, end-to-end test automation framework built to test the Flipkart e-commerce website. It leverages a powerful tech stack including **Selenium WebDriver, Java, TestNG, and Cucumber** to create a scalable and maintainable testing solution.

The framework is architected using the **Page Object Model (POM)** for clean code and reusability. It follows the **Behavior-Driven Development (BDD)** approach, allowing test cases to be written in a simple, human-readable language. The entire testing lifecycle is automated through a **CI/CD pipeline using GitHub Actions**.

---

## ✨ Key Features

* **BDD Scenarios:** Gherkin-based `.feature` files for writing test cases that are easily understood by technical and non-technical stakeholders.
* **Page Object Model (POM):** Ensures a clean separation of test logic from UI element locators, making the framework highly maintainable.
* **TestNG Framework:** Utilizes TestNG for powerful test management, including assertions, parallel execution, and test suite configuration (`testng.xml`).
* **Advanced Reporting:** Generates detailed and interactive HTML reports (e.g., Extent Reports) with test steps, statuses, and screenshots for failures.
* **CI/CD Integration:** Fully automated test execution on every push to the `main` branch via a pre-configured GitHub Actions workflow.
* **Configuration Management:** Externalizes test data and environment configurations (URLs, credentials) using properties files for easy management.
* **Cross-Browser Support:** Can be easily configured to run tests across different browsers like Chrome and Firefox.

---

## 🛠️ Tech Stack & Tools

| Component         | Technology / Tool                                 |
| ----------------- | ------------------------------------------------- |
| **Language** | Java 11                                           |
| **Automation Tool** | Selenium WebDriver                                |
| **BDD Framework** | Cucumber                                          |
| **Test Runner** | TestNG                                            |
| **Build Tool** | Apache Maven                                      |
| **CI/CD** | GitHub Actions                                    |
| **Reporting** | Extent Reports / Cucumber Reports                 |
| **Utilities** | Apache POI (for data-driven testing from Excel)   |

---

## ⚙️ Getting Started

### Prerequisites

* Java Development Kit (JDK) 11 or higher
* Apache Maven
* Google Chrome browser

### Installation & Setup

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/Vamshikrishna-QA/Flipkart-Selenium-Framework-testng-bdd-pom-reports-github-cicd.git](https://github.com/Vamshikrishna-QA/Flipkart-Selenium-Framework-testng-bdd-pom-reports-github-cicd.git)
    ```
2.  **Navigate to the project directory:**
    ```bash
    cd Flipkart-Selenium-Framework-testng-bdd-pom-reports-github-cicd
    ```
3.  **Install dependencies:** Maven will automatically download all the required project dependencies defined in `pom.xml`.
    ```bash
    mvn clean install
    ```

---

## ▶️ How to Run Tests

### 1. From the Command Line (All Tests)

Execute the entire test suite as defined in the `pom.xml`.
```bash
mvn test
2. Using TestNG Suite
To run a specific test suite (e.g., smoke tests, regression tests), you can specify the TestNG XML file.

Bash

mvn test -Dsurefire.suiteXmlFiles=src/test/resources/testsuites/testng.xml
3. Using Cucumber Tags
Run specific scenarios or features by providing Cucumber tags.

Bash

# Run only scenarios tagged with @SmokeTest
mvn test -Dcucumber.filter.tags="@SmokeTest"

# Run scenarios tagged with @Regression and not @SmokeTest
mvn test -Dcucumber.filter.tags="@Regression and not @SmokeTest"
📊 Reporting
The framework is configured to generate detailed HTML reports after a test run. The reports provide a comprehensive overview of the execution results, including passed/failed steps, execution time, and screenshots for failed tests.

You can find the report here after a run:
target/Spark/Spark.html

🔄 CI/CD Pipeline
This project uses GitHub Actions for Continuous Integration. The workflow is defined in the .github/workflows/ci.yml file.

The pipeline automatically triggers on every push to the main branch and performs the following steps:

Checks out the latest code.

Sets up the Java environment.

Downloads all Maven dependencies.

Executes the entire test suite in headless mode.

The build status and test results can be viewed in the "Actions" tab of this repository.

👨‍💻 Author
bodakunta VamshiKrishnavarma

LinkedIn: www.linkedin.com/in/bodakunta-vamshi-krishna-b70552369

GitHub: @Vamshikrishna-QA




