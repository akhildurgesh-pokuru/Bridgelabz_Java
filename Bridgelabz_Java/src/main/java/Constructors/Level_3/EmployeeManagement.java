/*
 * This program demonstrates access modifiers, inheritance, and the use of super
 * in Java.
 * The employee class stores employee details using public, protected, and private
 * variables. The salary can be changed using a method, while employee details
 * can be displayed using employee_details().
 * The manager class inherits from employee and shows how inherited members
 * can be accessed. It also uses super to call the employee class method.
 */

package Constructors.Level_3;

class employee {
    public int emp_id;
    protected String department;
    private double salary;

    // Default constructor that allows an employee object to be created without values.
    employee() {
    }

    // Constructor used to initialize the employee details.
    employee(int emp_id, String department, double salary) {
        this.emp_id = emp_id;
        this.department = department;
        this.salary = salary;
    }

    // Updates the employee's private salary value.
    public void modify_salary(double salary) {
        this.salary = salary;
    }

    // Displays the complete details of the employee.
    public void employee_details() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Department: " + department);
        System.out.println("Employee Salary: " + salary);
    }
}

class manager extends employee {

    //Accessing employee details by manager
    manager(employee obj){
        System.out.println("Emp Id: "+obj.emp_id);
        System.out.println("Department: "+obj.department);
    }
}


public class EmployeeManagement {
    public static void main(String[] args) {

        // Creating two employee objects with their details.
        employee obj = new employee(10169, "Backend", 95000);
        employee obj1 = new employee(10180, "AI", 150000);

        // Displaying the details of both employees.
        obj.employee_details();
        System.out.println();

        obj1.employee_details();
        System.out.println();

        System.out.println("Manager Accessing Employee Details");

        // Creating a manager object using the default constructor.
        manager obj2 = new manager(obj);

    }
}