/*
 * Project: Palindrome Check
 *
 * This program checks whether a given string reads the same
 * from both the beginning and the end.
 */

package ObjectOrientedFundamental.Level_2;

import java.util.Scanner;

public class Palindrome {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the String");
        String word = sc.next();

        // Create an object to check the given string
        check obj = new check();
        boolean result = obj.palindrome_check(word);

        // Display the result of the palindrome check
        if(result) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not a palindrome");
        }
    }
}

class check {

    // Compare characters from both ends of the string
    public boolean palindrome_check(String word) {
        int i = 0;
        int j = word.length() - 1;
        boolean result = true;

        while(i < j) {
            if(word.charAt(i) != word.charAt(j)) {
                result = false;
                break;
            } else {
                i++;
                j--;
            }
        }

        return result;
    }
}