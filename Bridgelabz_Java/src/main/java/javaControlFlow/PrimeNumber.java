package javaControlFlow;

/*
 * Program to check whether a given number
 * is a prime number or not.
 */

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean isPrime = true;

        // Numbers less than or equal to 1 are not prime
        if (number <= 1) {
            isPrime = false;
        } else {
            // Check if the number is divisible by any number
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Display the result
        if (isPrime) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is not a Prime Number");
        }

        sc.close();
    }
}