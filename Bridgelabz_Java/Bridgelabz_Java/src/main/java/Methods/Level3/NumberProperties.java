/*
 * Program to check different properties of a given number.
 * The program finds the number of digits, stores the digits in an array,
 * checks whether the number is a duck number and Armstrong number,
 * and finds the largest, second largest, smallest, and second smallest digits.
 */

package Methods.Level3;

import java.util.Scanner;

class NumberChecker {

    // Finds the number of digits in the given number
    public static int countDigits(int number) {
        int count = 0;

        while (number != 0) {
            number = number / 10;
            count++;
        }

        return count;
    }

    // Stores each digit of the number in an array
    public static int[] storeDigits(int number, int count) {
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number = number / 10;
        }

        return digits;
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

    // Checks whether the number is an Armstrong number
    public static boolean checkArmstrongNumber(int number, int[] digits) {
        int sum = 0;

        for (int i = 0; i < digits.length; i++) {
            sum = sum + (int) Math.pow(digits[i], digits.length);
        }

        return sum == number;
    }

    // Finds the largest and second largest digits
    public static int[] findLargestValues(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        return new int[]{largest, secondLargest};
    }

    // Finds the smallest and second smallest digits
    public static int[] findSmallestValues(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < smallest) {
                secondSmallest = smallest;
                smallest = digits[i];
            } else if (digits[i] < secondSmallest && digits[i] != smallest) {
                secondSmallest = digits[i];
            }
        }

        return new int[]{smallest, secondSmallest};
    }
}

public class NumberProperties {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = sc.nextInt();

        // Find the number of digits
        int digitCount = NumberChecker.countDigits(number);

        // Store all digits in an array
        int[] digits = NumberChecker.storeDigits(number, digitCount);

        // Check whether the number is a duck number
        boolean duckResult = NumberChecker.checkDuckNumber(digits);

        // Check whether the number is an Armstrong number
        boolean armstrongResult = NumberChecker.checkArmstrongNumber(number, digits);

        // Find largest and second largest digits
        int[] largestValues = NumberChecker.findLargestValues(digits);

        // Find smallest and second smallest digits
        int[] smallestValues = NumberChecker.findSmallestValues(digits);

        System.out.println("Number of digits: " + digitCount);

        System.out.println("Digits of the number:");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println();

        System.out.println("Is Duck Number: " + duckResult);
        System.out.println("Is Armstrong Number: " + armstrongResult);
        System.out.println("Largest digit: " + largestValues[0]);
        System.out.println("Second largest digit: " + largestValues[1]);
        System.out.println("Smallest digit: " + smallestValues[0]);
        System.out.println("Second smallest digit: " + smallestValues[1]);
    }
}