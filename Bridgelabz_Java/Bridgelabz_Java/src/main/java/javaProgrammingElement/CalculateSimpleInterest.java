package javaProgrammingElement;

/*
This program calculates the simple interest for a given amount.
It takes the principal amount, rate of interest, and time
as input from the user and uses the simple interest formula
to calculate and display the interest.
*/

import java.util.Scanner;

public class CalculateSimpleInterest {

    // Main method - execution of the program starts here
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // creates an object of Scanner class to take input from the user

        System.out.print("Enter Principal: ");

        double principal = scanner.nextDouble();
        // takes the principal amount as input from the user

        System.out.print("Enter Rate: ");

        double rate = scanner.nextDouble();
        // takes the rate of interest as input from the user

        System.out.print("Enter Time: ");

        double time = scanner.nextDouble();
        // takes the time period as input from the user

        double interest = (principal * rate * time) / 100;
        // calculates the simple interest using the formula (P × R × T) / 100

        System.out.println("Simple Interest: " + interest);
        // prints the calculated simple interest

        scanner.close();
        // closes the Scanner object
    }
}