package Extras;


/*
 * This program performs basic arithmetic operations using separate functions.
 * It allows the user to choose addition, subtraction, multiplication, or division.
 */

import java.util.Scanner;

public class BasicCalculator {

    // Function for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Function for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Function for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Function for division
    public static double divide(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Display calculator operations
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        // Get user's choice
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        // Get two numbers
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        // Perform the selected operation
        switch (choice) {

            case 1:
                System.out.println("Result: " + add(a, b));
                break;

            case 2:
                System.out.println("Result: " + subtract(a, b));
                break;

            case 3:
                System.out.println("Result: " + multiply(a, b));
                break;

            case 4:
                if (b == 0) {
                    System.out.println("Division by zero is not allowed.");
                }
                else {
                    System.out.println("Result: " + divide(a, b));
                }
                break;

            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}

