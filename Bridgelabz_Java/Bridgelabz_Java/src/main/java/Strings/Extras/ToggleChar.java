package Strings.Extras;

/*
program to toggle the case of each character
in a given string
 */

import java.util.Scanner;

class toggle {
    public String convert(String word) {   //method convert takes a string as parameter
        char[] arr = word.toCharArray();   //converts the string into a character array

        for (int i = 0; i < arr.length; i++) {   //loop runs through each character of the string
            char ch = arr[i];   //stores the current character

            if (ch >= 'A' && ch <= 'Z') {   //checks if the character is an uppercase letter
                arr[i] = (char) (ch + 32);   //converts the uppercase character into lowercase
            } else {
                arr[i] = (char) (ch - 32);   //converts the lowercase character into uppercase
            }
        }

        return String.valueOf(arr);   //converts the character array into a string and returns it
    }
}

public class ToggleChar {
    public static void main(String[] args) {   //main method
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");   //Taking string as input
        String word = sc.next();

        toggle obj = new toggle();   //creating object from toggle class
        String toggle_word = obj.convert(word);   //calling the convert method

        System.out.println("toggled word is: " + toggle_word);   //prints the toggled string
    }
}