import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private String designation;
    private double basicSalary;

    Employee(int id, String name, String designation, double basicSalary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.basicSalary = basicSalary;
    }

    public int getId() {
        return id;
    }

    public void update(String name, String designation, double basicSalary) {
        this.name = name;
        this.designation = designation;
        this.basicSalary = basicSalary;
    }

    public double calculateAllowance() {
        return basicSalary * 0.20;
    }

    public double calculateDeduction() {
        return basicSalary * 0.10;
    }

    public double calculateGrossSalary() {
        return basicSalary + calculateAllowance();
    }

    public double calculateNetSalary() {
        return calculateGrossSalary() - calculateDeduction();
    }

    public void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Allowance: " + calculateAllowance());
        System.out.println("Deduction: " + calculateDeduction());
        System.out.println("Gross Salary: " + calculateGrossSalary());
        System.out.println("Net Salary: " + calculateNetSalary());
        System.out.println("----------------------------");
    }
}

public class EmployeePayrollSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Calculate Payroll");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    boolean exists = false;
                    for (Employee e : employees) {
                        if (e.getId() == id) {
                            exists = true;
                            break;
                        }
                    }

                    if (exists) {
                        System.out.println("Employee ID already exists.");
                        break;
                    }

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Designation: ");
                    String designation = sc.nextLine();

                    System.out.print("Enter Basic Salary: ");
                    double salary = sc.nextDouble();

                    employees.add(new Employee(id, name, designation, salary));
                    System.out.println("Employee added successfully.");
                    break;

                case 2:
                    if (employees.isEmpty()) {
                        System.out.println("No employee records found.");
                    } else {
                        for (Employee e : employees) {
                            e.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;
                    for (Employee e : employees) {
                        if (e.getId() == searchId) {
                            e.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Employee ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    Employee selected = null;
                    for (Employee e : employees) {
                        if (e.getId() == updateId) {
                            selected = e;
                            break;
                        }
                    }

                    if (selected == null) {
                        System.out.println("Employee not found.");
                    } else {
                        System.out.print("Enter New Name: ");
                        String newName = sc.nextLine();

                        System.out.print("Enter New Designation: ");
                        String newDesignation = sc.nextLine();

                        System.out.print("Enter New Basic Salary: ");
                        double newSalary = sc.nextDouble();

                        selected.update(newName, newDesignation, newSalary);
                        System.out.println("Employee updated successfully.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Employee ID: ");
                    int payrollId = sc.nextInt();

                    boolean payrollFound = false;
                    for (Employee e : employees) {
                        if (e.getId() == payrollId) {
                            e.display();
                            payrollFound = true;
                            break;
                        }
                    }

                    if (!payrollFound) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting Employee Payroll System.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}