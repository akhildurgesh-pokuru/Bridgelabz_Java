package Extras;


/*
 * This program calculates the GCD and LCM of two given numbers.
 * It uses separate functions for GCD and LCM calculations.
 */

import java.util.Scanner;

public class GCDLCMCalculator {

    // Function to calculate GCD using the Euclidean algorithm
    public static int calculateGCD(int a, int b) {

        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {

            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    // Function to calculate LCM
    public static long calculateLCM(int a, int b) {

        if (a == 0 || b == 0) {
            return 0;
        }

        // LCM = (a * b) / GCD
        return Math.abs((long) a / calculateGCD(a, b) * b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get two numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Calculate GCD and LCM
        int gcd = calculateGCD(a, b);
        long lcm = calculateLCM(a, b);

        // Display results
        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);

        sc.close();
    }
}

