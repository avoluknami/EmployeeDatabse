package org.example;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        EmployeeData employeeData = new EmployeeData();

        // Create a new employee
        Employee newEmployee = new Employee("John Alwin", "Software Engineer", 60000, new Date());
        employeeData.createEmployee(newEmployee);

        // Get employee by ID
        Employee retrievedEmployee = employeeData.getEmployeeById(1);
        if (retrievedEmployee != null) {
            System.out.println("Employee Retrieved: " + retrievedEmployee);
        }

        // Get all employees
        System.out.println("All Employees:");
        employeeData.getAllEmployees().forEach(System.out::println);

        // Update employee details
        newEmployee.setName("John Doe Jr.");
        newEmployee.setSalary(65000);
        employeeData.updateEmployee(newEmployee);

        // Delete an employee
//        employeeData.deleteEmployee(1);
    }
}
