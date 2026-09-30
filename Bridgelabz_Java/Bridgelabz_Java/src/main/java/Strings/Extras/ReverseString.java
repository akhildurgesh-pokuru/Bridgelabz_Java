package Strings.Extras;

/*
program to reverse a given string
by swapping characters from both ends
 */

import java.util.Scanner;

class reverse {
    public String string_reverse(String word) {   //method string_reverse takes a string as parameter
        char[] characters = word.toCharArray();   //converts the string into a character array

        int i = 0;   //starts from the first character
        int j = characters.length - 1;   //starts from the last character

        while (i < j) {   //loop continues until both positions meet
            char temp = characters[i];   //stores the first character temporarily
            characters[i] = characters[j];   //places the last character at the first position
            characters[j] = temp;   //places the first character at the last position

            i++;   //moves to the next position from the beginning
            j--;   //moves to the previous position from the end
        }

        String result = String.valueOf(characters);   //converts the character array into a string
        return result;   //returns the reversed string
    }
}

public class ReverseString {
    public static void main(String[] args) {   //main method
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");   //Taking string as input
        String word = sc.next();

        reverse obj = new reverse();   //creating object from reverse class
        String result = obj.string_reverse(word);   //calling the string_reverse method

        System.out.println("reversed string is: " + result);   //prints the reversed string
    }
}