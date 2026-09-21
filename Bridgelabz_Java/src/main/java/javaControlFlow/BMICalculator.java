package javaControlFlow;

/*
 * Program to calculate BMI of a person
 * and determine the weight status.
 */

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double heightCm = sc.nextDouble();

        // Convert height from cm to meters
        double height = heightCm / 100;

        // Calculate BMI
        double bmi = weight / (height * height);

        System.out.println("BMI: " + bmi);

        // Determine BMI status
        if (bmi <= 18.4) {
            System.out.println("Status: Underweight");
        } else if (bmi <= 24.9) {
            System.out.println("Status: Normal");
        } else if (bmi <= 39.9) {
            System.out.println("Status: Overweight");
        } else {
            System.out.println("Status: Obese");
        }

        sc.close();
    }
}