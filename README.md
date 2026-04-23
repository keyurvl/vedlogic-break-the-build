# Vedlogic QA Automation Engineering Challenge - Starter Project


This repository is an intentionally imperfect starter framework for a Selenium + Java + Cucumber + Maven + ReqRes challenge.

The purpose of this assessment is not only to verify that the test cases run, but also to evaluate how the candidate designs, structures, and implements a maintainable automation framework.

Candidates are expected to demonstrate **senior-level SDET thinking**, including clean architecture, reusability, scalability, and adherence to automation best practices.

---

## Objective

The candidate must automate the scenarios defined in:

- `API-Test.feature` using https://reqres.in/
- `UI-Test.feature` using https://www.saucedemo.com/

The solution must be implemented as a **clean, reusable, and maintainable automation framework**.

---

## Applications Under Test

- **UI:** https://www.saucedemo.com/
- **API:** https://reqres.in/

---

## Tech Stack

- Java 11+
- Maven
- Selenium WebDriver
- Cucumber
- TestNG
- Rest Assured

---

## Core Expectations

The submitted solution must demonstrate:

- Proper **Page Object Model** for UI automation
- Reusable and maintainable code
- Clear separation of concerns
- Scalable driver and test design
- Meaningful assertions
- Good naming conventions and package structure
- Ability to identify and fix intentionally introduced issues

We are evaluating **both** whether the tests work and whether the framework is designed correctly.

---

## Required Framework Design Principles

### 1. Page Object Model is mandatory for UI tests

UI automation must follow a proper POM structure with clear separation between page classes, step definitions, hooks, and utilities.

Step definitions should only orchestrate actions — no Selenium interaction, locators, or browser logic inside steps.

---

### 2. Clean page abstraction

Locators must be declared inside page classes. Prefer `@FindBy` annotations. Page behavior should be encapsulated in meaningful methods.

---

### 3. No duplicated logic

Repeated methods that differ only by locator or element are considered poor design. Common actions should be abstracted into reusable helpers.

---

### 4. Driver lifecycle must be centralized

Driver setup and teardown must be managed in one place. Page objects should receive the driver — not create it.

---

### 5. Clear package structure is required

Code must be organized into logical packages. Mixing page code with steps, or coupling API and UI layers, will be treated as a structural weakness.

---

### 6. API automation expectations

A dedicated API client/service layer is expected. Steps should not contain request building, response parsing, or hardcoded endpoint strings.

---

### 7. Reusability and scalability

The framework should be easy to extend. Configuration must be externalized, waits centralized, and the design should show readiness for growth beyond the two feature files.

---

### 8. SOLID and clean code

Each class should have a single, clear responsibility. Code should be readable and extendable without explanation.

---

### 9. What we will consider poor implementation

- Driver initialized inside a page class or step definition
- Direct Selenium locators inside steps
- No Page Object Model
- Hardcoded waits, secrets, or brittle configuration
- Weak or missing assertions
- Unused or dead framework code

---

### 10. Debugging expectation

The starter code contains intentionally introduced issues. Candidates are expected to identify and fix them independently as part of the solution.

---

### 11. Submission expectation

Candidates should submit:

- A working automation framework
- Cleanly structured code
- Any required `pom.xml` updates
- Notes on design decisions or improvements made

The code must run using:

## How to Run
```bash
mvn clean test
```
