package Extras;


/*
 * This program checks whether a given number is a prime number.
 * It uses a separate function to check divisibility and return the result.
 */

import java.util.Scanner;

public class PrimeNumberChecker {

    // Function to check whether a number is prime
    public static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        // Check divisibility up to the square root of the number
        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get number input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check and display the result
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        }
        else {
            System.out.println(num + " is not a prime number.");
        }

        sc.close();
    }
}
