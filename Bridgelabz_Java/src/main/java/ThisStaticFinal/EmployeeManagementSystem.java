/*
 * Program to demonstrate an Employee Management System
 * using final, static, this, and instanceof concepts in Java.
 */

package ThisStaticFinal;

class employee {
    // final variable stores a unique employee ID that cannot be changed.
    final int employee_id;

    // static variable is shared by all employee objects.
    static String company_name = "Auto Agri Tractor";

    String name;
    String designation;

    // Keeps track of the total number of employees created.
    static int total_employees;

    employee(int employee_id, String name, String designation) {
        // Initialize the employee details using the current object.
        this.employee_id = employee_id;
        this.name = name;
        this.designation = designation;

        // Increase the employee count whenever a new object is created.
        total_employees++;
    }

    // Static method displays the total number of employees.
    public static void display_total_eemployees() {
        System.out.println("Total Employees: " + total_employees);
    }

    // Displays the details of a particular employee.
    public void display_employee() {
        System.out.println("Comapnay Name: " + company_name);
        System.out.println("Employee ID: " + employee_id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Designation: " + designation);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {

        // Create two employee objects with different employee details.
        employee obj = new employee(10169, "Akhil", "Developer");
        employee obj1 = new employee(10180, "Venkatesh", "Manager");

        // Display details of the first employee.
        obj.display_employee();
        System.out.println();

        // Display details of the second employee.
        obj1.display_employee();
        System.out.println();

        // Call the static method using the class name.
        employee.display_total_eemployees();
        System.out.println();

        // Check whether obj belongs to the employee class.
        if (obj instanceof employee) {
            System.out.println("Yes it is..");
        }
    }
}