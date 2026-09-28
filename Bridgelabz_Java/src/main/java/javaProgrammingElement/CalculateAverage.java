package javaProgrammingElement;

/*
This program calculates the average of three numbers.
It takes three numbers as input from the user,
adds them together, divides the total by 3,
and displays the calculated average.
*/

import java.util.Scanner;

public class CalculateAverage {

    // Main method - execution of the program starts here
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // creates an object of Scanner class to take input from the user

        System.out.print("Enter first number: ");

        double num1 = scanner.nextDouble();
        // takes the first number as input from the user

        System.out.print("Enter second number: ");

        double num2 = scanner.nextDouble();
        // takes the second number as input from the user

        System.out.print("Enter third number: ");

        double num3 = scanner.nextDouble();
        // takes the third number as input from the user

        double average = (num1 + num2 + num3) / 3;
        // adds the three numbers and divides the total by 3 to calculate the average

        System.out.println("Average: " + average);
        // prints the calculated average

        scanner.close();
        // closes the Scanner object
    }
}