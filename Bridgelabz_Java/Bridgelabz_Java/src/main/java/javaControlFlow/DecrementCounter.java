package javaControlFlow;

import java.util.Scanner;

/*
This program displays a counter in decreasing order.
It takes the starting counter value from the user
and uses a for loop to decrease the value by 1 in each iteration
until the counter reaches 1.
*/

public class DecrementCounter {

    // Main method - execution of the program starts here
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // creates an object of Scanner class to take input from the user

        System.out.print("Enter the Counter");

        int counter = sc.nextInt();
        // takes the starting counter value as input from the user

        for (int i = counter; i > 1; i--) {
            // starts from the given counter and decreases i by 1 in each iteration

            System.out.println("Counter is: " + i);
            // prints the current counter value
        }
    }
}