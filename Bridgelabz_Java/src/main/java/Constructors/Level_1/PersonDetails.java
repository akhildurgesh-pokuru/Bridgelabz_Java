/*
 * This program demonstrates the use of a parameterized constructor
 * and a copy constructor in Java.
 * It takes the person's name, age, and salary from the user and
 * creates the first object using a parameterized constructor.
 * It then creates another person object by copying the details
 * of the first object using a copy constructor.
 */

package Constructors.Level_1;

import java.util.Scanner;

class person {
    String name;
    int age;
    int salary;

    // Constructor used to initialize the person's details with user input.
    person(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Copy constructor that creates a new person with the same details as another person.
    person(person obj) {
        this.name = obj.name;
        this.age = obj.age;
        this.salary = obj.salary;
    }

    // Displays the person's details.
    public void display_details() {
        System.out.println("name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

public class PersonDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking the person's details from the user.
        System.out.println("Enter the person name");
        String name = sc.next();

        System.out.println("Enter the person age");
        int age = sc.nextInt();

        System.out.println("Enter the person salary");
        int salary = sc.nextInt();

        // Creating the first person object using the parameterized constructor.
        person obj = new person(name, age, salary);
        System.out.println("Person details with parameterized constructor");
        obj.display_details();

        // Creating a second person object by copying the first object's details.
        person obj1 = new person(obj);
        System.out.println("Person details with copy constructor");
        obj1.display_details();
    }
}