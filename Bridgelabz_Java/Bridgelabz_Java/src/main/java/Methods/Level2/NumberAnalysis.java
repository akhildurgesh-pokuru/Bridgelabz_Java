/*
 * Program to take five numbers as input from the user.
 * The program checks whether each number is positive or negative.
 * For positive numbers, it further checks whether the number is even or odd.
 * Finally, the program compares the first and last elements of the array
 * and displays whether the first element is greater, equal, or less.
 */

package Methods.Level2;

import java.util.Scanner;

// Class containing methods to check numbers and compare values
class NumberCalculation {

    // Method to check whether a number is positive or not
    public static boolean checkPositive(int numberValue) {
        return numberValue >= 0;
    }

    // Method to check whether a number is even or odd
    public static boolean checkEven(int numberValue) {
        return numberValue % 2 == 0;
    }

    // Method to compare two numbers
    // Returns 1 if the first number is greater
    // Returns 0 if both numbers are equal
    // Returns -1 if the first number is smaller
    public static int compareNumbers(int firstValue, int secondValue) {
        if (firstValue > secondValue) {
            return 1;
        } else if (firstValue == secondValue) {
            return 0;
        } else {
            return -1;
        }
    }
}

// Main class of the program
public class NumberAnalysis {

    // Main method where program execution starts
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner inputReader = new Scanner(System.in);

        // Create an array to store five numbers
        int[] numberList = new int[5];

        // Loop through the array to take five numbers as input
        for (int index = 0; index < numberList.length; index++) {

            // Ask the user to enter a number
            System.out.println("Enter number " + (index + 1));

            // Store the entered number in the array
            numberList[index] = inputReader.nextInt();
        }

        // Loop through the array to check each number
        for (int index = 0; index < numberList.length; index++) {

            // Check whether the current number is positive
            if (NumberCalculation.checkPositive(numberList[index])) {

                // Display that the number is positive
                System.out.println(numberList[index] + " is positive");

                // Check whether the positive number is even
                if (NumberCalculation.checkEven(numberList[index])) {

                    // Display that the number is even
                    System.out.println(numberList[index] + " is even");
                } else {

                    // Display that the number is odd
                    System.out.println(numberList[index] + " is odd");
                }

            } else {

                // Display that the number is negative
                System.out.println(numberList[index] + " is negative");
            }
        }

        // Compare the first and last elements of the array
        int comparisonResult = NumberCalculation.compareNumbers(
                numberList[0],
                numberList[numberList.length - 1]
        );

        // Check if the first element is greater than the last element
        if (comparisonResult == 1) {

            // Display the comparison result
            System.out.println("First element is greater than last element");

            // Check if the first and last elements are equal
        } else if (comparisonResult == 0) {

            // Display the comparison result
            System.out.println("First element is equal to last element");

        } else {

            // Display the comparison result
            System.out.println("First element is less than last element");
        }
    }
}