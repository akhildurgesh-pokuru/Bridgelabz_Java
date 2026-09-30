package javaProgrammingElement;

/*
This program calculates the area of a circle.
It takes the radius of the circle as input from the user
and uses the formula π × radius × radius to calculate
and display the area of the circle.
*/

import java.util.Scanner;

public class AreaofaCircle {

    // Main method - execution of the program starts here
    public static void main(String[] args) {

        final double pie = 3.14;
        // stores the value of pi as a constant

        Scanner sc = new Scanner(System.in);
        // creates an object of Scanner class to take input from the user

        System.out.print("enter radius");

        int radius = sc.nextInt();
        // takes the radius of the circle as input from the user

        System.out.println(pie * (radius * radius));
        // calculates the area of the circle and prints the result
    }
}