package javaProgrammingElement;

import java.util.Scanner;

/*
This program calculates the volume of a cylinder.
It takes the radius and height of the cylinder as input from the user,
uses the volume formula along with the value of PI,
and displays the calculated volume on the screen.
*/

public class VolumeofaCylinder {

    // Main method - execution of the program starts here
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // creates an object of Scanner class to take input from the user

        System.out.print("Enter radius: ");

        double radius = scanner.nextDouble();
        // takes the radius of the cylinder as input from the user

        System.out.print("Enter height: ");

        double height = scanner.nextDouble();
        // takes the height of the cylinder as input from the user

        double volume = Math.PI * Math.pow(radius, 2) * height;
        // calculates the volume of the cylinder using the formula π × r² × h

        System.out.println("Volume: " + volume);
        // prints the calculated volume

        scanner.close();
        // closes the Scanner object
    }
}