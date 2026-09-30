/*
 * Program to perform different unit conversions.
 * The program takes values for kilometers, miles, meters, and feet
 * from the user and converts them into the required units.
 */

package Methods.Level2;

import java.util.Scanner;

// Class containing methods for different unit conversions
class converter_operations{

    // Method to convert kilometers into miles
    public static double kilometerConverter(double kilometer){
        return kilometer*0.621371;
    }

    // Method to convert miles into kilometers
    public static double milesConverter(double miles){
        return miles*1.60934;
    }

    // Method to convert meters into feet
    public static double meterConverter(double meters){
        return meters*3.28084;
    }

    // Method to convert feet into meters
    public static double feetConverter(double feet){
        return feet*0.3048;
    }


}

// Main class of the program
public class UnitConverter {

    // Main method where program execution starts
    public static void main(String[] args){

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter kilometers
        System.out.println("Enter the Kilometers to convert it to miles");
        double kilometers = sc.nextInt();

        // Ask the user to enter miles
        System.out.println("Enter the Miles to convert to Kilometers");
        double miles = sc.nextInt();

        // Ask the user to enter meters
        System.out.println("Enter the Meters to convert it to feet");
        double meters =sc.nextInt();

        // Ask the user to enter feet
        System.out.println("Enter the feet to convert it to meters");
        double feet = sc.nextInt();

        // Convert kilometers into miles
        double con_miles = converter_operations.kilometerConverter(kilometers);

        // Convert miles into kilometers
        double con_kilo = converter_operations.milesConverter(miles);

        // Convert meters into feet
        double con_feet = converter_operations.meterConverter(meters);

        // Convert feet into meters
        double con_meters = converter_operations.feetConverter(feet);

        // Display the converted miles
        System.out.println("converted miles: "+con_miles);

        // Display the converted kilometers
        System.out.println("converted kilo: "+con_kilo);

        // Display the converted feet
        System.out.println("converted feet: "+con_feet);

        // Display the converted meters
        System.out.println("converted meters: "+con_meters);
    }
}