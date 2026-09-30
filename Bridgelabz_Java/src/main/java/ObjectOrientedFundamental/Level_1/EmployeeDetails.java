/*
 * Project: Employee Details
 *
 * This program takes employee details from the user and
 * displays them using getters and setters.
 */

package ObjectOrientedFundamental.Level_1;

import java.util.Scanner;

public class EmployeeDetails {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Get employee details from the user
        System.out.println("Enter the name of employee");
        String name = sc.next();

        System.out.println("Enter the id of employee");
        int id = sc.nextInt();

        System.out.println("Enter the salary of employee");
        double salary = sc.nextDouble();

        // Create an employee object and set its details
        employee obj = new employee();
        obj.setId(id);
        obj.setName(name);
        obj.setSalary(salary);

        // Display the employee details
        System.out.println("Employee ID: "+obj.getId());
        System.out.println("Employee Name: "+obj.getName());
        System.out.println("Employee Salary: "+obj.getSalary());

    }
}

class employee{

    private int id;
    private String name;
    private double salary;

    // Set the employee ID
    public void setId(int id){
        this.id = id;
    }

    // Set the employee name
    public void setName(String name){
        this.name = name;
    }

    // Set the employee salary
    public void setSalary(double salary){
        this.salary = salary;
    }

    // Return the employee ID
    public int getId(){
        return this.id;
    }

    // Return the employee name
    public String getName(){
        return this.name;
    }

    // Return the employee salary
    public double getSalary(){
        return this.salary;
    }
}