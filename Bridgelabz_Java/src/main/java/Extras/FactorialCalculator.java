package Extras;


/*
 * This program calculates the factorial of a given number using recursion.
 * It uses a recursive function that calls itself until the base condition is reached.
 */

import java.util.Scanner;

public class FactorialCalculator {

    // Recursive function to calculate factorial
    public static long factorial(int n) {

        // Base condition
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive calculation
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get number input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Calculate and display factorial
        if (n < 0 || n > 20) {
            System.out.println("Enter a number between 0 and 20.");
        }
        else {
            System.out.println("Factorial: " + factorial(n));
        }

        sc.close();
    }
}
