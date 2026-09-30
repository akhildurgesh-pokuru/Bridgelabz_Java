package Strings.Extras;

/*
program to check whether a given string is a palindrome
by comparing characters from both ends
 */

import java.util.Scanner;

class palindrome_check {
    public boolean check(String word) {   //method check takes a string as parameter
        char[] arr = word.toCharArray();   //converts the string into a character array
        boolean result = true;   //initially result is true

        int i = 0;   //starts from the first character
        int j = arr.length - 1;   //starts from the last character

        while (i < j) {   //loop continues until both positions meet
            if (arr[i] != arr[j]) {   //checks if characters from both ends are different
                result = false;   //changes result to false if characters are not equal
                break;   //stops the loop
            }

            i++;   //moves to the next character from the beginning
            j--;   //moves to the previous character from the end
        }

        return result;   //returns the result
    }
}

public class Palindrome {
    public static void main(String[] args) {   //main method
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");   //Taking string as input
        String word = sc.next();

        palindrome_check obj = new palindrome_check();   //creating object from palindrome_check class
        boolean result = obj.check(word);   //calling the check method

        if (result) {   //checks if the result is true
            System.out.println("String is palindrome");   //prints if the string is palindrome
        } else {
            System.out.println("String is not palindrome");   //prints if the string is not palindrome
        }
    }
}