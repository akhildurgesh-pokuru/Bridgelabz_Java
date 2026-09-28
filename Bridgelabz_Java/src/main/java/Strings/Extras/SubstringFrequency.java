package Strings.Extras;

/*
program to find the frequency of each word
in a given sentence
 */

import java.util.Scanner;

class frequency {
    public void freq(String sen) {   //method freq takes a sentence as parameter
        String[] arr = sen.split(" ");   //splits the sentence into individual words

        String[] words = new String[arr.length];   //creates an array to store unique words
        int[] freq = new int[arr.length];   //creates an array to store the frequency of each word

        int k = 0;   //keeps track of the number of unique words
        boolean contain = false;   //checks whether the word already exists
        String s = "";   //stores the current word

        for (int i = 0; i < arr.length; i++) {   //loop runs through each word in the sentence
            s = arr[i];   //gets the current word
            contain = false;   //initially assumes the word is not present

            for (int j = 0; j < k; j++) {   //checks the current word with previously stored words
                if (s.equals(words[j])) {   //checks if the current word already exists
                    contain = true;   //sets contain as true if the word is already present
                    freq[j]++;   //increases the frequency of the existing word
                    break;   //stops the loop after finding the word
                }
            }

            if (!contain) {   //checks if the word is not already present
                words[k] = s;   //stores the new word in the words array
                freq[k] = 1;   //sets the frequency of the new word as one
                k++;   //moves to the next position
            }
        }

        for (int i = 0; i < freq.length; i++) {   //loop prints the words and their frequencies
            System.out.println("String is: " + words[i] + " frequency is: " + freq[i]);
        }
    }
}

public class SubstringFrequency {
    public static void main(String[] args) {   //main method
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Sentence");   //Taking sentence as input
        String s = sc.nextLine();

        frequency obj = new frequency();   //creating object from frequency class
        obj.freq(s);   //calling the freq method
    }
}