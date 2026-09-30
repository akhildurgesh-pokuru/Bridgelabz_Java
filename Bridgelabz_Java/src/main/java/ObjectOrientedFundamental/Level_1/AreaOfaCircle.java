/*
 * Project: Area of a Circle
 *
 * Description:
 * This program calculates the area of a circle using the radius
 * entered by the user. The radius is passed to a Circle object,
 * which calculates and returns the area using the formula:
 *
 * Area = π × radius × radius
 *
 * The program demonstrates basic object-oriented concepts such as
 * classes, objects, constructors, private variables, and methods.
 */

package ObjectOrientedFundamental.Level_1;

import java.util.Scanner;

public class AreaOfaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the radius of the circle from the user
        System.out.println("Enter the radius of the circle");
        double radius = sc.nextDouble();

        // Create a circle object using the entered radius
        circle obj = new circle(radius);

        // Calculate the area using the circle object's method
        double area = obj.result();

        System.out.println(area);
    }
}

class circle {
    // Stores the radius of the circle and cannot be changed after initialization
    private final double radius;

    // Constructor to initialize the radius
    circle(double radius) {
        this.radius = radius;
    }

    // Calculates and returns the area of the circle
    public double result() {
        double area = 3.14 * radius * radius;
        return area;
    }
}