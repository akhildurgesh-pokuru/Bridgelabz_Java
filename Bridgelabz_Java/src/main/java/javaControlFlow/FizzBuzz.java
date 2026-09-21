package javaControlFlow;

/*
 * Program to print FizzBuzz from 0 to
 * the given positive number using for loop.
 */

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        // Check if the number is positive
        if (number > 0) {

            // Loop from 0 to the given number
            for (int i = 0; i <= number; i++) {

                // Check multiples of both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Please enter a positive number.");
        }

        sc.close();
    }
}
