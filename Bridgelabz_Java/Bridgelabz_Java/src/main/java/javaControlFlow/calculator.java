package javaControlFlow;

import java.util.Scanner;

/*
This program works as a simple calculator using a switch statement.
It takes two numbers and an operator from the user and performs
the selected arithmetic operation.
The program also takes a loop count and repeats the calculation
for the given number of iterations.
*/

public class calculator {

    // Main method - execution of the program starts here
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // creates an object of Scanner class to take input from the user

        // Get inputs for variables
        System.out.print("Enter first number: ");

        double first = scanner.nextDouble();
        // takes the first number as input from the user

        System.out.print("Enter second number: ");

        double second = scanner.nextDouble();
        // takes the second number as input from the user

        System.out.print("Enter operator (+, -, *, /): ");

        String op = scanner.next();
        // takes the arithmetic operator as input from the user

        System.out.print("Enter loop count limit (number): ");

        int number = scanner.nextInt();
        // takes the number of times the calculation should be repeated

        // Runs a for loop from 1 until it reaches the given limit
        for (int i = 1; i < number; i++) {

            System.out.print("Loop iteration " + i + " - ");
            // displays the current loop iteration

            // Performs the selected operation using switch-case
            switch (op) {

                case "+":      // performs addition
                    System.out.println("Result: " + (first + second));
                    break;
                // stops the current switch case

                case "-":      // performs subtraction
                    System.out.println("Result: " + (first - second));
                    break;
                // stops the current switch case

                case "*":      // performs multiplication
                    System.out.println("Result: " + (first * second));
                    break;
                // stops the current switch case

                case "/":      // performs division
                    if (second != 0) {
                        // checks that the second number is not zero

                        System.out.println("Result: " + (first / second));
                        // performs the division and prints the result

                    } else {
                        System.out.println("Error: Division by zero");
                        // displays an error message if the second number is zero
                    }
                    break;

                default:
                    System.out.println("Invalid Operator");
                    // displays an error message if the user enters an invalid operator

                    i = number;
                    // changes the loop value so that the loop ends
                    break;
            }
        }
    }
}