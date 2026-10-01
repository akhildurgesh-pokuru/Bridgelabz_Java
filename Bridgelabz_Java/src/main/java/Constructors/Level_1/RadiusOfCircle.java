/*
 * This program demonstrates constructor chaining in Java.
 * The default constructor calls the parameterized constructor using this()
 * and assigns a predefined value to the radius.
 * The program then takes another radius value from the user and creates
 * a second circle object using the parameterized constructor.
 * Finally, it displays both the default and user-provided radius values.
 */

package Constructors.Level_1;

import java.util.Scanner;

class circle {
    double radius;

    // Default constructor that calls the parameterized constructor
    // with a predefined radius value.
    circle() {
        this(56.3);
    }

    // Parameterized constructor used to assign the given radius.
    circle(double radius) {
        this.radius = radius;
    }
}

public class RadiusOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating a circle object using the default constructor.
        circle obj = new circle();

        // Taking the radius value from the user.
        System.out.println("Enter the radius");
        double radius = sc.nextDouble();

        // Creating another circle object using the user-provided radius.
        circle obj1 = new circle(radius);

        // Displaying the radius values from both objects.
        System.out.println("Default value assigned to radius: " + obj.radius);
        System.out.println("User defined value assigned to radius: " + obj1.radius);
    }
}