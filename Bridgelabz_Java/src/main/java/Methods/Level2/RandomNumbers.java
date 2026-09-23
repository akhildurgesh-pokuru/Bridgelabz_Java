package Methods.Level2;

import java.util.Scanner;

class RandomNumberCalculation {

    public static int[] generateRandomValues(int size) {
        int[] randomNumbers = new int[size];

        for (int index = 0; index < size; index++) {
            randomNumbers[index] = (int)(Math.random() * 9000) + 1000;
        }

        return randomNumbers;
    }

    public static double[] calculateStatistics(int[] numbers) {
        double total = 0;
        int minimum = numbers[0];
        int maximum = numbers[0];

        for (int index = 0; index < numbers.length; index++) {
            total = total + numbers[index];
            minimum = Math.min(minimum, numbers[index]);
            maximum = Math.max(maximum, numbers[index]);
        }

        double average = total / numbers.length;

        return new double[]{average, minimum, maximum};
    }
}

public class RandomNumbers {

    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Enter the number of random values");
        int numberOfValues = inputReader.nextInt();

        int[] generatedNumbers =
                RandomNumberCalculation.generateRandomValues(numberOfValues);

        double[] statistics =
                RandomNumberCalculation.calculateStatistics(generatedNumbers);

        System.out.println("Generated random numbers:");

        for (int index = 0; index < generatedNumbers.length; index++) {
            System.out.println(generatedNumbers[index]);
        }

        System.out.println("Average: " + statistics[0]);
        System.out.println("Minimum: " + statistics[1]);
        System.out.println("Maximum: " + statistics[2]);
    }
}