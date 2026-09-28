package Strings.Extras;

/*
program to remove duplicate characters from a given string
and return the string with only unique characters
 */

import java.util.Scanner;

class remove_duplicate {
    public String remove(String word) {   //method remove takes a string as parameter
        int k = 0;   //keeps track of the position for the next unique character
        char ch;   //stores the current character
        boolean isduplicate = false;   //initially checks whether the character is duplicate or not

        char[] unique = new char[word.length()];   //creates an array to store unique characters

        for (int i = 0; i < word.length(); i++) {   //loop runs through each character of the string
            ch = word.charAt(i);   //gets the current character from the string

            for (int j = 0; j < k; j++) {   //loop checks the current character with previously stored unique characters
                if (ch == unique[j]) {   //checks if the current character already exists in the unique array
                    isduplicate = true;   //sets duplicate as true if the character already exists
                    break;   //stops the loop when duplicate character is found
                }
            }

            if (!isduplicate) {   //checks if the current character is not a duplicate
                unique[k] = ch;   //stores the character in the unique array
                k++;   //moves to the next position in the unique array
            }
        }

        return String.valueOf(unique);   //converts the unique character array into a string and returns it
    }
}

public class RemoveDuplicates {
    public static void main(String[] args) {   //main method
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");   //Taking string as input
        String word = sc.next();

        remove_duplicate obj = new remove_duplicate();   //creating object from remove_duplicate class
        String result = obj.remove(word);   //calling the remove method

        System.out.println("String with no duplicates is: " + result);   //prints the string without duplicates
    }
}