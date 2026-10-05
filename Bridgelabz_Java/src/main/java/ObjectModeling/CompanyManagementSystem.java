/*
   This program demonstrates the composition relationship between Company, Department, and Employee classes.
   It shows how a company contains departments and each department contains employees.
 */

        package ObjectModeling;

import java.util.ArrayList;
import java.util.List;

class Employees {
    int emp_id;
    String emp_name;

    Employees(int emp_id, String name) {
        // Initialize employee details
        this.emp_id = emp_id;
        this.emp_name = name;
    }

    // Display the details of an employee
    public void displayEmployeedetails() {
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Employee id: " + emp_id);
        System.out.println();
    }
}

class Departments {
    String dept_name;
    List<Employees> employee;

    Departments(String dept_name) {
        // Initialize department name and create an employee list
        this.dept_name = dept_name;
        this.employee = new ArrayList<>();

        // Add employees to the department
        employee.add(new Employees(122, "Akhil"));
        employee.add(new Employees(311, "Charan"));
    }

    // Display department and its employees
    public void employeedetails() {
        System.out.println("Department : " + dept_name);

        // Display details of each employee in the department
        for (Employees employ : employee) {
            employ.displayEmployeedetails();
        }
    }
}

class Company {
    String company_name;
    List<Departments> department;

    Company(String company_name) {
        // Initialize the department list
        department = new ArrayList<>();

        // Create and add departments to the company
        department.add(new Departments("HR"));
        department.add(new Departments("Developing"));
        department.add(new Departments("Testing"));
    }

    // Display company details and all its departments
    void disCompany() {
        System.out.println("Company: " + company_name);

        // Display employee details for each department
        for (Departments department : department) {
            department.employeedetails();
        }
    }
}

public class CompanyManagementSystem {
    public static void main(String[] args) {

        // Create a company object
        Company company = new Company("Akhil Technology");

        // Display company, department, and employee details
        company.disCompany();
    }
}
