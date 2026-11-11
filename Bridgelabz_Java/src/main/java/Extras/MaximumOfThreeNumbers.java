package Extras;


/*
 * This program accepts three integer values from the user.
 * It uses a separate function to calculate and display the maximum number.
 */

import java.util.Scanner;

public class MaximumOfThreeNumbers {

    // Function to find the maximum of three numbers
    public static int findMaximum(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take three integer inputs
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        // Calculate the maximum value
        int max = findMaximum(a, b, c);

        // Display the result
        System.out.println("Maximum number: " + max);

        sc.close();
    }
}
