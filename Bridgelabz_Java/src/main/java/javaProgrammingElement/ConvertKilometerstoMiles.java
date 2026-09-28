package javaProgrammingElement;

import java.util.Scanner;

/*
This program converts a distance from kilometers to miles.
It takes the distance in kilometers as input from the user,
converts it into miles using the conversion value,
and displays the converted distance.
*/

public class ConvertKilometerstoMiles {

    // Main method - execution of the program starts here
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // creates an object of Scanner class to take input from the user

        System.out.print("Enter distance in kilometers: ");

        double kilometers = scanner.nextDouble();
        // takes the distance in kilometers as input from the user

        double miles = kilometers * 0.621371;
        // converts the distance from kilometers to miles

        System.out.println("Distance in miles: " + miles);
        // prints the converted distance in miles

        scanner.close();
        // closes the Scanner object
    }
}