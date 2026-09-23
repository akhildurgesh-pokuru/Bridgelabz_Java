package Methods.Level2;

import java.util.Scanner;

class LengthCalculation {

    public static double yardsToFeetValue(double inputYards) {
        return inputYards * 3;
    }

    public static double feetToYardsValue(double inputFeet) {
        return inputFeet * 0.333333;
    }

    public static double metersToInchesValue(double inputMeters) {
        return inputMeters * 39.3701;
    }

    public static double inchesToMetersValue(double inputInches) {
        return inputInches * 0.0254;
    }

    public static double inchesToCentimetersValue(double inputInches) {
        return inputInches * 2.54;
    }
}

public class YardFeetConverter {

    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Enter Yards to convert to Feet");
        double yardInput = inputReader.nextDouble();

        System.out.println("Enter Feet to convert to Yards");
        double footInput = inputReader.nextDouble();

        System.out.println("Enter Meters to convert to Inches");
        double meterInput = inputReader.nextDouble();

        System.out.println("Enter Inches to convert to Meters");
        double inchMeterInput = inputReader.nextDouble();

        System.out.println("Enter Inches to convert to Centimeters");
        double inchCmInput = inputReader.nextDouble();

        double feetResult = LengthCalculation.yardsToFeetValue(yardInput);
        double yardsResult = LengthCalculation.feetToYardsValue(footInput);
        double inchesResult = LengthCalculation.metersToInchesValue(meterInput);
        double metersResult = LengthCalculation.inchesToMetersValue(inchMeterInput);
        double centimetersResult = LengthCalculation.inchesToCentimetersValue(inchCmInput);

        System.out.println("Feet result: " + feetResult);
        System.out.println("Yards result: " + yardsResult);
        System.out.println("Inches result: " + inchesResult);
        System.out.println("Meters result: " + metersResult);
        System.out.println("Centimeters result: " + centimetersResult);
    }
}