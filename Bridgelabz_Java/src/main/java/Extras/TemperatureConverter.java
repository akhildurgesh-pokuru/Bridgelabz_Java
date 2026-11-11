package Extras;


/*
 * This program converts temperature between Celsius and Fahrenheit.
 * It uses separate functions for both conversion operations.
 */

import java.util.Scanner;

public class TemperatureConverter {

    // Convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Display conversion choices
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        // Perform the selected conversion
        if (choice == 1) {

            System.out.print("Enter temperature in Fahrenheit: ");
            double f = sc.nextDouble();

            System.out.println("Temperature in Celsius: " +
                    fahrenheitToCelsius(f));

        }
        else if (choice == 2) {

            System.out.print("Enter temperature in Celsius: ");
            double c = sc.nextDouble();

            System.out.println("Temperature in Fahrenheit: " +
                    celsiusToFahrenheit(c));

        }
        else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }
}

