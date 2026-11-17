# Employee Payroll Management System

## Project Overview
The Employee Payroll Management System is a menu-driven Java application used to manage employee records and calculate their salaries. It allows users to add, display, search, and update employee information, as well as calculate gross and net salaries.

## Technologies Used
- **Programming Language:** Java
- **Data Structure:** ArrayList
- **Input Handling:** Scanner
- **Concepts:** OOP, Encapsulation, Constructors, Methods, Loops, Switch-Case

## Features
1. **Add Employee:** Add a new employee with ID, name, designation, and basic salary.
2. **Display All Employees:** View the details of all registered employees.
3. **Search Employee:** Search for an employee using their ID.
4. **Update Employee:** Modify an employee's name, designation, and basic salary.
5. **Calculate Payroll:** Calculate and display employee salary details.
6. **Exit:** Exit the application.

## Payroll Calculation

The system calculates salary using the following formulas:

- Allowance = Basic Salary × 20%
- Deduction = Basic Salary × 10%
- Gross Salary = Basic Salary + Allowance
- Net Salary = Gross Salary − Deduction

### Example

If the basic salary is ₹20,000:

| Component | Amount |
|---|---:|
| Basic Salary | ₹20,000 |
| Allowance (20%) | ₹4,000 |
| Deduction (10%) | ₹2,000 |
| Gross Salary | ₹24,000 |
| Net Salary | ₹22,000 |

## How to Run the Project

### Prerequisites
- Java Development Kit (JDK) installed.
- Command Prompt, Terminal, or any Java IDE.

### Compilation
Open the terminal in the project directory and execute:

```bash
javac EmployeePayrollSystem.java
```

### Execution

```bash
java EmployeePayrollSystem
```

## Project Structure

```text
EmployeePayrollSystem/
│
├── EmployeePayrollSystem.java
└── README.md
```

## Java Concepts Demonstrated
- Classes and Objects
- Encapsulation using private variables
- Constructors
- ArrayList for storing employee records
- Methods for salary calculations
- Searching and updating records
- Loops and conditional statements
- Switch-case menu-driven programming

## Limitations
- Employee records are stored in memory using ArrayList.
- Data is lost when the application terminates.
- The application does not use a database or file storage.

## Future Enhancements
- Database integration for permanent employee storage.
- Generate monthly salary slips.
- Add tax calculations.
- Implement employee login and authentication.
- Export payroll reports.

## Conclusion
The Employee Payroll Management System demonstrates the practical implementation of Java Object-Oriented Programming concepts. It provides basic employee record management and automated salary calculations through a simple menu-driven interface.
