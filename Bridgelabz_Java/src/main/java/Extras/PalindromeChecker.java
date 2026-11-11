package Extras;


/*
 * This program checks whether the given string is a palindrome.
 * It uses separate functions for checking and displaying the result.
 */

import java.util.Scanner;

public class PalindromeChecker {

    // Function to check whether a string is a palindrome
    public static boolean isPalindrome(String str) {

        // Remove spaces and convert to lowercase
        str = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        // Compare characters from both ends
        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    // Function to display the result
    public static void displayResult(String str) {

        if (isPalindrome(str)) {
            System.out.println("The given string is a palindrome.");
        }
        else {
            System.out.println("The given string is not a palindrome.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get string input
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Display the palindrome result
        displayResult(str);

        sc.close();
    }
}

