package Strings.Extras;

/*
program to find the character with the highest frequency
in a given string
 */

import java.util.Scanner;

class freq {
    public char char_freq(String word) {   //method char_freq takes a string as parameter and returns the highest frequency
        int[] freq = new int[256];   //creates an array to store the frequency of each ASCII character

        for (int i = 0; i < word.length(); i++) {   //loop runs through each character of the string
            freq[word.charAt(i)]++;   //increases the frequency count of the current character
        }

        int max = 0;   //initially maximum frequency is zero

        for (int j = 0; j < 256; j++) {   //loop checks the frequency of all ASCII characters
            if (freq[j] > max) {   //checks if the current frequency is greater than the maximum frequency
                max = freq[j];   //updates the maximum frequency
            }
        }

        return (char) max;   //returns the maximum frequency as a character
    }
}

public class MostFrequencyCharacter {
    public static void main(String[] args) {   //main method
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");   //Taking string as input
        String word = sc.next();

        freq obj = new freq();   //creating object from freq class
        char res = obj.char_freq(word);   //calling the char_freq method

        System.out.println("The highest frequency character is: " + res);   //prints the highest frequency
    }
}