/*
 * Program to check different properties of a number.
 * The program stores the digits of a number, reverses the digits,
 * compares the original and reversed arrays, checks for a palindrome,
 * and checks whether the number is a duck number.
 */

package Methods.Level3;

import java.util.Scanner;

class NumberPatternAnalysis {

    // Finds the number of digits
    public static int countDigits(int number) {
        int count = 0;

        while (number != 0) {
            number = number / 10;
            count++;
        }

        return count;
    }

    // Stores the digits of the number in an array
    public static int[] storeDigits(int number, int count) {
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number = number / 10;
        }

        return digits;
    }

    // Reverses the digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];

        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }

        return reversed;
    }

    // Compares two arrays
    public static boolean compareArrays(int[] firstArray, int[] secondArray) {
        if (firstArray.length != secondArray.length) {
            return false;
        }

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] != secondArray[i]) {
                return false;
            }
        }

        return true;
    }

    // Checks whether the number is a palindrome
    public static boolean checkPalindrome(int[] digits) {
        int[] reversed = reverseDigits(digits);

        return compareArrays(digits, reversed);
    }

    // Checks whether the number is a duck number
    public static boolean checkDuckNumber(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }

        return false;
    }
}

public class NumberPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = sc.nextInt();

        // Find and store the digits
        int digitCount = NumberPatternAnalysis.countDigits(number);
        int[] digits = NumberPatternAnalysis.storeDigits(number, digitCount);

        int[] reversedDigits = NumberPatternAnalysis.reverseDigits(digits);
        boolean arraysEqual = NumberPatternAnalysis.compareArrays(digits, reversedDigits);
        boolean palindrome = NumberPatternAnalysis.checkPalindrome(digits);
        boolean duck = NumberPatternAnalysis.checkDuckNumber(digits);

        System.out.println("Digits:");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println();

        System.out.println("Reversed digits:");
        for (int i = 0; i < reversedDigits.length; i++) {
            System.out.print(reversedDigits[i] + " ");
        }

        System.out.println();
        System.out.println("Arrays are equal: " + arraysEqual);
        System.out.println("Is Palindrome Number: " + palindrome);
        System.out.println("Is Duck Number: " + duck);
    }
}