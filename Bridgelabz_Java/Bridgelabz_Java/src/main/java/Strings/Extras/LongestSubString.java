package Strings.Extras;

/*
program to find the length of the longest word
in a given sentence
 */

import java.util.Scanner;

class substring {
    public int find(String sen) {   //method find takes a sentence as parameter and returns the maximum word length
        String[] words = sen.split(" ");   //splits the sentence into individual words
        int max_length = 0;   //initially maximum length is zero

        for (String wor : words) {   //loop runs through each word in the sentence
            System.out.println(wor);   //prints each word
        }

        for (String word : words) {   //loop runs through each word to find the longest word
            max_length = Math.max(max_length, word.length());   //compares the current word length with maximum length
        }

        return max_length;   //returns the maximum length of the word
    }
}

public class LongestSubString {
    public static void main(String[] args) {   //main method
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Sentence");   //Taking sentence as input
        String sen = sc.nextLine();

        substring obj = new substring();   //creating object from substring class
        int length = obj.find(sen);   //calling the find method

        System.out.println("Max Length is: " + length);   //prints the maximum word length
    }
}