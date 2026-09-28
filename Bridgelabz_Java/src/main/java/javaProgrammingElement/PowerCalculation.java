package javaProgrammingElement;

import java.util.Scanner;

/*
This program calculates the power of a number.
It takes the base and exponent as input from the user,
uses the Math.pow() method to calculate the power,
and displays the result on the screen.
*/

public class PowerCalculation {

    // Main method - execution of the program starts here
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // creates an object of Scanner class to take input from the user

        System.out.print("Enter base: ");

        double base = scanner.nextDouble();
        // takes the base value as input from the user

        System.out.print("Enter exponent: ");

        double exponent = scanner.nextDouble();
        // takes the exponent value as input from the user

        double result = Math.pow(base, exponent);
        // calculates the power of the base using the Math.pow() method

        System.out.println("Result: " + result);
        // prints the calculated result

        scanner.close();
        // closes the Scanner object
    }
}