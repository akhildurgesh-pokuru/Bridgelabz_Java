package Strings.Extras;

/*
program to check whether two strings are anagrams or not
 by counting the frequency of each character
 */

import java.util.Scanner;

class cheking {
    public boolean check(String s1, String s2) {   //method check takes 2 strings as parameters
        if (s1.length() != s2.length()) {   //checks if the lengths of both strings are different
            return false;   //returns false if the lengths are not equal
        }

        int[] charCount = new int[256];   //creates an array to store the count of each ASCII character

        for (int i = 0; i < s1.length(); i++) {   //loop runs through each character of both strings
            charCount[s1.charAt(i)]++;   //increases the count for the character in String 1
            charCount[s2.charAt(i)]--;   //decreases the count for the character in String 2
        }

        for (int count : charCount) {   //checks every character count in the array
            if (count != 0) {   //checks if any character count is not zero
                return false;   //returns false if the character counts are different
            }
        }

        return true;   //returns true if both strings have the same character counts
    }
}

public class AnagramCheck {   //main class
    public static void main(String[] args) {   //main method
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String - 1");   //Taking String 1 as input
        String s1 = sc.next();
        System.out.println("Enter the String - 2");   //Taking String 2 as input
        String s2 = sc.next();

        cheking obj = new cheking();   //creating object from checking class
        boolean result = obj.check(s1, s2);   //calling the check method

        System.out.println("The result is: " + result);   //prints the result
    }
}