/*
 * Program to generate random four-digit numbers.
 * The program takes the number of random values from the user,
 * generates the required random numbers, and finds their
 * average, minimum, and maximum values.
 */

package Methods.Level2;

import java.util.Scanner;

// Class containing methods to generate random numbers and calculate statistics
class RandomNumberCalculation {

    // Method to generate the required number of four-digit random values
    public static int[] generateRandomValues(int size) {

        // Create an array to store the random numbers
        int[] randomNumbers = new int[size];

        // Loop through the array to generate random numbers
        for (int index = 0; index < size; index++) {

            // Generate a random four-digit number from 1000 to 9999
            randomNumbers[index] = (int)(Math.random() * 9000) + 1000;
        }

        // Return the generated random numbers
        return randomNumbers;
    }

    // Method to calculate the average, minimum, and maximum values
    public static double[] calculateStatistics(int[] numbers) {

        // Variable to store the total of all numbers
        double total = 0;

        // Assume the first number is the minimum initially
        int minimum = numbers[0];

        // Assume the first number is the maximum initially
        int maximum = numbers[0];

        // Loop through all the generated numbers
        for (int index = 0; index < numbers.length; index++) {

            // Add the current number to the total
            total = total + numbers[index];

            // Find the minimum value using Math.min()
            minimum = Math.min(minimum, numbers[index]);

            // Find the maximum value using Math.max()
            maximum = Math.max(maximum, numbers[index]);
        }

        // Calculate the average of all the numbers
        double average = total / numbers.length;

        // Return average, minimum, and maximum values
        return new double[]{average, minimum, maximum};
    }
}

// Main class of the program
public class RandomNumbers {

    // Main method where program execution starts
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner inputReader = new Scanner(System.in);

        // Ask the user for the number of random values to generate
        System.out.println("Enter the number of random values");
        int numberOfValues = inputReader.nextInt();

        // Generate the required random numbers
        int[] generatedNumbers =
                RandomNumberCalculation.generateRandomValues(numberOfValues);

        // Calculate the average, minimum, and maximum values
        double[] statistics =
                RandomNumberCalculation.calculateStatistics(generatedNumbers);

        // Display the generated random numbers
        System.out.println("Generated random numbers:");

        // Loop through the generated numbers and display them
        for (int index = 0; index < generatedNumbers.length; index++) {
            System.out.println(generatedNumbers[index]);
        }

        // Display the average value
        System.out.println("Average: " + statistics[0]);

        // Display the minimum value
        System.out.println("Minimum: " + statistics[1]);

        // Display the maximum value
        System.out.println("Maximum: " + statistics[2]);
    }
}