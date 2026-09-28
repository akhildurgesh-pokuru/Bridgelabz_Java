package javaProgrammingElement;

/*
This program converts a temperature from Celsius to Fahrenheit.
It takes the temperature in Celsius as input from the user,
uses the Celsius to Fahrenheit conversion formula,
and displays the converted temperature.
*/

import java.util.Scanner;

public class CelsiustoFahrenheit {

    // Main method - execution of the program starts here
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // creates an object of Scanner class to take input from the user

        System.out.print("enter celsius");

        int Celsius = sc.nextInt();
        // takes the temperature in Celsius as input from the user

        int Fahrenheit = (Celsius * 9 / 5) + 32;
        // converts the temperature from Celsius to Fahrenheit

        System.out.print(Fahrenheit);
        // prints the temperature in Fahrenheit
    }
}