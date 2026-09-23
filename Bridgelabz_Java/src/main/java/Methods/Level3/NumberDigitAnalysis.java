/*
 * Program to analyze the digits of a number.
 * The program finds the number of digits, stores the digits in an array,
 * calculates the sum and square sum of digits, checks for a Harshad number,
 * and finds the frequency of each digit.
 */

package Methods.Level3;

import java.util.Scanner;

class DigitAnalysis {

    // Finds the number of digits in the given number
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

    // Finds the sum of all digits
    public static int findDigitSum(int[] digits) {
        int sum = 0;

        for (int i = 0; i < digits.length; i++) {
            sum = sum + digits[i];
        }

        return sum;
    }

    // Finds the sum of squares of all digits
    public static double findSquareSum(int[] digits) {
        double sum = 0;

        for (int i = 0; i < digits.length; i++) {
            sum = sum + Math.pow(digits[i], 2);
        }

        return sum;
    }

    // Checks whether the number is a Harshad number
    public static boolean checkHarshad(int number, int[] digits) {
        int sum = findDigitSum(digits);

        return number % sum == 0;
    }

    // Finds the frequency of each digit
    public static int[][] findFrequency(int[] digits) {
        int[][] frequency = new int[10][2];

        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
            frequency[i][1] = 0;
        }

        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]][1]++;
        }

        return frequency;
    }
}

public class NumberDigitAnalysis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = sc.nextInt();

        // Find the number of digits and store them in an array
        int digitCount = DigitAnalysis.countDigits(number);
        int[] digits = DigitAnalysis.storeDigits(number, digitCount);

        int digitSum = DigitAnalysis.findDigitSum(digits);
        double squareSum = DigitAnalysis.findSquareSum(digits);
        boolean harshad = DigitAnalysis.checkHarshad(number, digits);
        int[][] frequency = DigitAnalysis.findFrequency(digits);

        System.out.println("Number of digits: " + digitCount);

        System.out.println("Digits:");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println();
        System.out.println("Sum of digits: " + digitSum);
        System.out.println("Sum of squares of digits: " + squareSum);
        System.out.println("Is Harshad Number: " + harshad);

        System.out.println("Digit Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println(frequency[i][0] + " : " + frequency[i][1]);
            }
        }
    }
}