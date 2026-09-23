/*
 * Program to find the Euclidean distance between two points
 * and find the equation of the line passing through those points.
 */

package Methods.Level3;

import java.util.Scanner;

// Class containing methods to calculate distance and line equation
class PointCalculation {

    // Method to find the Euclidean distance between two points
    public static double findDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to find the slope and y-intercept of the line
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1);
        double yIntercept = y1 - slope * x1;

        return new double[]{slope, yIntercept};
    }
}

// Main class of the program
public class Distances {

    // Main method where program execution starts
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Take the coordinates of the first point
        System.out.println("Enter x1: ");
        double x1 = sc.nextDouble();

        System.out.println("Enter y1: ");
        double y1 = sc.nextDouble();

        // Take the coordinates of the second point
        System.out.println("Enter x2: ");
        double x2 = sc.nextDouble();

        System.out.println("Enter y2: ");
        double y2 = sc.nextDouble();

        // Find the Euclidean distance between the two points
        double distance = PointCalculation.findDistance(x1, y1, x2, y2);

        // Find the slope and y-intercept of the line
        double[] equation = PointCalculation.findLineEquation(x1, y1, x2, y2);

        // Display the calculated distance
        System.out.println("Euclidean Distance: " + distance);

        // Display the slope and y-intercept
        System.out.println("Slope: " + equation[0]);
        System.out.println("Y-Intercept: " + equation[1]);

        // Display the equation of the line
        System.out.println("Equation of the line: y = "
                + equation[0] + "x + " + equation[1]);
    }
}