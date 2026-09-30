/*
 * Program to check different special properties of a number.
 * The program checks whether the given number is prime, neon, spy,
 * automorphic, or buzz.
 */

package Methods.Level3;

import java.util.Scanner;

class SpecialNumberAnalysis {

    // Checks whether the number is a prime number
    public static boolean checkPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Checks whether the number is a neon number
    public static boolean checkNeon(int number) {
        int square = number * number;
        int sum = 0;

        while (square != 0) {
            sum = sum + square % 10;
            square = square / 10;
        }

        return sum == number;
    }

    // Checks whether the number is a spy number
    public static boolean checkSpy(int number) {
        int sum = 0;
        int product = 1;

        while (number != 0) {
            int digit = number % 10;
            sum = sum + digit;
            product = product * digit;
            number = number / 10;
        }

        return sum == product;
    }

    // Checks whether the number is an automorphic number
    public static boolean checkAutomorphic(int number) {
        int square = number * number;
        int original = number;

        while (number != 0) {
            if (square % 10 != number % 10) {
                return false;
            }

            square = square / 10;
            number = number / 10;
        }

        return square >= 0 && original >= 0;
    }

    // Checks whether the number is a buzz number
    public static boolean checkBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }
}

public class SpecialNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = sc.nextInt();

        boolean prime = SpecialNumberAnalysis.checkPrime(number);
        boolean neon = SpecialNumberAnalysis.checkNeon(number);
        boolean spy = SpecialNumberAnalysis.checkSpy(number);
        boolean automorphic = SpecialNumberAnalysis.checkAutomorphic(number);
        boolean buzz = SpecialNumberAnalysis.checkBuzz(number);

        System.out.println("Is Prime Number: " + prime);
        System.out.println("Is Neon Number: " + neon);
        System.out.println("Is Spy Number: " + spy);
        System.out.println("Is Automorphic Number: " + automorphic);
        System.out.println("Is Buzz Number: " + buzz);
    }
}