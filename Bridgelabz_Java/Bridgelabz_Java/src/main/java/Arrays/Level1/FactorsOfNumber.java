package Arrays.Level1;

/*
This program finds all the factors of a given number.
It takes a number as input from the user and checks which numbers
can divide it completely without leaving a remainder.
The factors found are stored in an array and then displayed on the screen.
*/

import java.util.Scanner;

public class FactorsOfNumber {

    // Main method - execution of the program starts here
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // creates an object of Scanner class to take input from the user

        System.out.print("Enter the number");

        int num = sc.nextInt();
        // takes the number as input from the user

        int j = 0;
        // keeps track of the position where the factor will be stored in the array

        int[] factors = new int[10];
        // creates an integer array to store the factors of the number

        for (int i = 1; i < num; i++) {
            // checks every number from 1 up to the given number

            if (num % i == 0) {
                // checks whether the number is completely divisible by i

                factors[j] = i;
                // stores the factor in the array

                j++;
                // moves to the next position in the array
            }
        }

        for (j = 0; j < factors.length; j++) {
            // loops through the factors array

            System.out.print(" " + factors[j]);
            // prints each element stored in the array
        }
    }
}