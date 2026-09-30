package javaControlFlow;

/*Implemeting the program for Finding bonus
and adding bonus to salary of a particular Employee
 */

import java.util.Scanner;

public class Bonussalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // creating object for scanner
        System.out.print("Enter the salary: ");   // Taking input as salary from user
        int salary = sc.nextInt();
        int bonus = (5*salary)/100;  //finding the bonus of an employee
        int finalsal = salary+bonus;
        System.out.println("Salary of an Employee is after adding bonus is: "+ finalsal); //printing the salary after adding bonus
    }
}
