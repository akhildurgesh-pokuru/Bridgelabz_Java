package Strings.Extras;

/*
program to compare two strings in lexicographical order
using the charAt() method without using compareTo()
 */

import java.util.Scanner;

public class LexicolGraph {
    public static void main(String[] args) {   //main method
        Scanner sc = new Scanner(System.in);

        System.out.print("String 1: ");   //Taking String 1 as input
        String s1 = sc.nextLine();

        System.out.print("String 2: ");   //Taking String 2 as input
        String s2 = sc.nextLine();

        int min = Math.min(s1.length(), s2.length());   //finds the length of the shorter string
        int result = 0;   //initially result is zero

        for (int i = 0; i < min; i++) {   //loop compares characters until the shorter string ends
            if (s1.charAt(i) != s2.charAt(i)) {   //checks if the characters at the same position are different
                result = s1.charAt(i) - s2.charAt(i);   //calculates the difference between the characters
                break;   //stops the loop after finding the first different character
            }
        }

        if (result == 0) {   //checks if all compared characters are equal
            result = s1.length() - s2.length();   //compares the lengths of both strings
        }

        if (result < 0) {   //checks if String 1 comes before String 2
            System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order");
        } else if (result > 0) {   //checks if String 1 comes after String 2
            System.out.println("\"" + s1 + "\" comes after \"" + s2 + "\" in lexicographical order");
        } else {
            System.out.println("\"" + s1 + "\" and \"" + s2 + "\" are equal");   //prints if both strings are equal
        }
    }
}