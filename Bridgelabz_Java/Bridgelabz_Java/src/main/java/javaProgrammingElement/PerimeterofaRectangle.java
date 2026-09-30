package javaProgrammingElement;

import java.util.Scanner;

/*
This program calculates the perimeter of a rectangle.
It takes the length and width of the rectangle as input from the user,
uses the perimeter formula to calculate the total distance around the rectangle,
and displays the calculated perimeter.
*/

public class PerimeterofaRectangle {

    // Main method - execution of the program starts here
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // creates an object of Scanner class to take input from the user

        System.out.print("Enter length: ");

        double length = scanner.nextDouble();
        // takes the length of the rectangle as input from the user

        System.out.print("Enter width: ");

        double width = scanner.nextDouble();
        // takes the width of the rectangle as input from the user

        double perimeter = 2 * (length + width);
        // calculates the perimeter using the formula 2 × (length + width)

        System.out.println("Perimeter: " + perimeter);
        // prints the calculated perimeter

        scanner.close();
        // closes the Scanner object
    }
}