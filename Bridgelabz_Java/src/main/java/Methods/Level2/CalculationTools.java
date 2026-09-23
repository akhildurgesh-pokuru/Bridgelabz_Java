package Methods.Level2;

import java.util.Scanner;

class PhysicalCalculation {

    public static double fahrenheitToCelsiusValue(double inputFahrenheit) {
        return (inputFahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheitValue(double inputCelsius) {
        return (inputCelsius * 9 / 5) + 32;
    }

    public static double poundsToKilogramsValue(double inputPounds) {
        return inputPounds * 0.453592;
    }

    public static double kilogramsToPoundsValue(double inputKilograms) {
        return inputKilograms * 2.20462;
    }

    public static double gallonsToLitersValue(double inputGallons) {
        return inputGallons * 3.78541;
    }

    public static double litersToGallonsValue(double inputLiters) {
        return inputLiters * 0.264172;
    }
}

public class CalculationTools {

    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Enter Fahrenheit to convert to Celsius");
        double fahrenheitInput = inputReader.nextDouble();

        System.out.println("Enter Celsius to convert to Fahrenheit");
        double celsiusInput = inputReader.nextDouble();

        System.out.println("Enter Pounds to convert to Kilograms");
        double poundInput = inputReader.nextDouble();

        System.out.println("Enter Kilograms to convert to Pounds");
        double kilogramInput = inputReader.nextDouble();

        System.out.println("Enter Gallons to convert to Liters");
        double gallonInput = inputReader.nextDouble();

        System.out.println("Enter Liters to convert to Gallons");
        double literInput = inputReader.nextDouble();

        double celsiusResult = PhysicalCalculation.fahrenheitToCelsiusValue(fahrenheitInput);
        double fahrenheitResult = PhysicalCalculation.celsiusToFahrenheitValue(celsiusInput);
        double kilogramResult = PhysicalCalculation.poundsToKilogramsValue(poundInput);
        double poundResult = PhysicalCalculation.kilogramsToPoundsValue(kilogramInput);
        double literResult = PhysicalCalculation.gallonsToLitersValue(gallonInput);
        double gallonResult = PhysicalCalculation.litersToGallonsValue(literInput);

        System.out.println("Celsius result: " + celsiusResult);
        System.out.println("Fahrenheit result: " + fahrenheitResult);
        System.out.println("Kilograms result: " + kilogramResult);
        System.out.println("Pounds result: " + poundResult);
        System.out.println("Liters result: " + literResult);
        System.out.println("Gallons result: " + gallonResult);
    }
}
