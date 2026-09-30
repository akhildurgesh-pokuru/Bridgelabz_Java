package Strings.Extras;

/*
program to remove a specific character from a given sentence
and return the sentence without that character
 */

import java.util.Arrays;
import java.util.Scanner;

class remove {
    public String char_rem(String sen, char ch) {   //method char_rem takes a sentence and character as parameters
        char[] arr = sen.toCharArray();   //converts the sentence into a character array

        for (int i = 0; i < arr.length; i++) {   //loop runs through each character of the sentence
            if (arr[i] == ch) {   //checks if the current character matches the character to be removed
                arr[i] = '0';   //replaces the matching character with '0'
            }
        }

        char[] result = new char[arr.length];   //creates a new character array to store the result
        int j = 0;   //initially result array index is zero

        for (char c : arr) {   //loop runs through each character of the modified array
            if (c != '0') {   //checks if the character is not '0'
                result[j] = c;   //stores the character in the result array
                j++;   //moves to the next position in the result array
            }
        }

        return String.valueOf(result);   //converts the result character array into a string and returns it
    }
}

public class RemoveCharacter {
    public static void main(String[] args) {   //main method
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sentence");   //Taking sentence as input
        String sen = sc.nextLine();

        System.out.println("Enter the character to remove");   //Taking character to remove as input
        char ch = sc.next().charAt(0);

        remove obj = new remove();   //creating object from remove class
        String result = obj.char_rem(sen, ch);   //calling the char_rem method

        System.out.println("Result is: " + result);   //prints the result
    }
}