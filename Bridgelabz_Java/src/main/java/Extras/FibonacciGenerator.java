package Extras;


/*
 * This program generates the Fibonacci sequence for the given number of terms.
 * It uses a separate function to calculate and print the sequence.
 */

import java.util.Scanner;

public class FibonacciGenerator {

    // Function to generate the Fibonacci sequence
    public static void generateFibonacci(int n) {

        int first = 0;
        int second = 1;

        // Generate the sequence
        for (int i = 1; i <= n; i++) {

            System.out.print(first + " ");

            int next = first + second;

            first = second;
            second = next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get the number of terms
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        // Generate and display the sequence
        if (n <= 0) {
            System.out.println("Enter a positive number.");
        }
        else {
            generateFibonacci(n);
        }

        sc.close();
    }
}

