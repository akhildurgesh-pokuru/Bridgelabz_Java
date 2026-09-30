/*
 * Program to perform different length unit conversions.
 * The program takes values for yards, feet, meters, and inches
 * from the user and converts them into the required units.
 */

package Methods.Level2;

import java.util.Scanner;

// Class containing methods for different length unit conversions
class LengthCalculation {

    // Method to convert yards into feet
    public static double yardsToFeetValue(double inputYards) {
        return inputYards * 3;
    }

    // Method to convert feet into yards
    public static double feetToYardsValue(double inputFeet) {
        return inputFeet * 0.333333;
    }

    // Method to convert meters into inches
    public static double metersToInchesValue(double inputMeters) {
        return inputMeters * 39.3701;
    }

    // Method to convert inches into meters
    public static double inchesToMetersValue(double inputInches) {
        return inputInches * 0.0254;
    }

    // Method to convert inches into centimeters
    public static double inchesToCentimetersValue(double inputInches) {
        return inputInches * 2.54;
    }
}

// Main class of the program
public class YardFeetConverter {

    // Main method where program execution starts
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner inputReader = new Scanner(System.in);

        // Ask the user to enter yards
        System.out.println("Enter Yards to convert to Feet");
        double yardInput = inputReader.nextDouble();

        // Ask the user to enter feet
        System.out.println("Enter Feet to convert to Yards");
        double footInput = inputReader.nextDouble();

        // Ask the user to enter meters
        System.out.println("Enter Meters to convert to Inches");
        double meterInput = inputReader.nextDouble();

        // Ask the user to enter inches for meter conversion
        System.out.println("Enter Inches to convert to Meters");
        double inchMeterInput = inputReader.nextDouble();

        // Ask the user to enter inches for centimeter conversion
        System.out.println("Enter Inches to convert to Centimeters");
        double inchCmInput = inputReader.nextDouble();

        // Convert yards into feet
        double feetResult = LengthCalculation.yardsToFeetValue(yardInput);

        // Convert feet into yards
        double yardsResult = LengthCalculation.feetToYardsValue(footInput);

        // Convert meters into inches
        double inchesResult = LengthCalculation.metersToInchesValue(meterInput);

        // Convert inches into meters
        double metersResult = LengthCalculation.inchesToMetersValue(inchMeterInput);

        // Convert inches into centimeters
        double centimetersResult = LengthCalculation.inchesToCentimetersValue(inchCmInput);

        // Display the converted feet value
        System.out.println("Feet result: " + feetResult);

        // Display the converted yards value
        System.out.println("Yards result: " + yardsResult);

        // Display the converted inches value
        System.out.println("Inches result: " + inchesResult);

        // Display the converted meters value
        System.out.println("Meters result: " + metersResult);

        // Display the converted centimeters value
        System.out.println("Centimeters result: " + centimetersResult);
    }
}