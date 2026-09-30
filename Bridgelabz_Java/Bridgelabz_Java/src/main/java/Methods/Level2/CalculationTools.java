/*
 * Program to perform different unit conversions.
 * The program takes temperature, weight, and volume values as input
 * and converts them into the required units.
 */

package Methods.Level2;

import java.util.Scanner;

// Class containing methods for different unit conversions
class PhysicalCalculation {

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsiusValue(double inputFahrenheit) {
        return (inputFahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheitValue(double inputCelsius) {
        return (inputCelsius * 9 / 5) + 32;
    }

    // Method to convert pounds to kilograms
    public static double poundsToKilogramsValue(double inputPounds) {
        return inputPounds * 0.453592;
    }

    // Method to convert kilograms to pounds
    public static double kilogramsToPoundsValue(double inputKilograms) {
        return inputKilograms * 2.20462;
    }

    // Method to convert gallons to liters
    public static double gallonsToLitersValue(double inputGallons) {
        return inputGallons * 3.78541;
    }

    // Method to convert liters to gallons
    public static double litersToGallonsValue(double inputLiters) {
        return inputLiters * 0.264172;
    }
}

// Main class of the program
public class CalculationTools {

    // Main method where program execution starts
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner inputReader = new Scanner(System.in);

        // Take Fahrenheit value from the user
        System.out.println("Enter Fahrenheit to convert to Celsius");
        double fahrenheitInput = inputReader.nextDouble();

        // Take Celsius value from the user
        System.out.println("Enter Celsius to convert to Fahrenheit");
        double celsiusInput = inputReader.nextDouble();

        // Take pounds value from the user
        System.out.println("Enter Pounds to convert to Kilograms");
        double poundInput = inputReader.nextDouble();

        // Take kilograms value from the user
        System.out.println("Enter Kilograms to convert to Pounds");
        double kilogramInput = inputReader.nextDouble();

        // Take gallons value from the user
        System.out.println("Enter Gallons to convert to Liters");
        double gallonInput = inputReader.nextDouble();

        // Take liters value from the user
        System.out.println("Enter Liters to convert to Gallons");
        double literInput = inputReader.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsiusResult = PhysicalCalculation.fahrenheitToCelsiusValue(fahrenheitInput);

        // Convert Celsius to Fahrenheit
        double fahrenheitResult = PhysicalCalculation.celsiusToFahrenheitValue(celsiusInput);

        // Convert pounds to kilograms
        double kilogramResult = PhysicalCalculation.poundsToKilogramsValue(poundInput);

        // Convert kilograms to pounds
        double poundResult = PhysicalCalculation.kilogramsToPoundsValue(kilogramInput);

        // Convert gallons to liters
        double literResult = PhysicalCalculation.gallonsToLitersValue(gallonInput);

        // Convert liters to gallons
        double gallonResult = PhysicalCalculation.litersToGallonsValue(literInput);

        // Display all converted values
        System.out.println("Celsius result: " + celsiusResult);
        System.out.println("Fahrenheit result: " + fahrenheitResult);
        System.out.println("Kilograms result: " + kilogramResult);
        System.out.println("Pounds result: " + poundResult);
        System.out.println("Liters result: " + literResult);
        System.out.println("Gallons result: " + gallonResult);
    }
}