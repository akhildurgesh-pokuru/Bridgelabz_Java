package javaControlFlow;

/*
 * Program to find the greatest factor of a number
 * other than the number itself.
 */

import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int greatestFactor = 1;

        // Check factors from number - 1 down to 1
        for (int i = number - 1; i >= 1; i--) {

            // Check if i is a factor of the number
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        System.out.println("Greatest factor of " + number
                + " beside itself is: " + greatestFactor);

        sc.close();
    }
}