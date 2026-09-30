package Strings.Extras;

/*
program to count the number of vowels and consonants
in a given string
 */

import java.util.Scanner;

class count {
    public int[] countVowCons(String word) {   //method takes a string as parameter and returns vowel and consonant counts
        word = word.toLowerCase();   //converts the string into lowercase

        int vow_count = 0;   //initially vowel count is zero
        int con_count = 0;   //initially consonant count is zero

        char[] characters = word.toCharArray();   //converts the string into a character array

        for (int i = 0; i < characters.length; i++) {   //loop runs through each character of the string
            if (characters[i] == 'a' || characters[i] == 'e' || characters[i] == 'i'
                    || characters[i] == 'o' || characters[i] == 'u') {   //checks if the character is a vowel
                vow_count++;   //increases the vowel count
            } else {
                con_count++;   //increases the consonant count if the character is not a vowel
            }
        }

        int[] count = new int[2];   //creates an array to store vowel and consonant counts
        count[0] = vow_count;   //stores vowel count at index 0
        count[1] = con_count;   //stores consonant count at index 1

        return count;   //returns the array containing vowel and consonant counts
    }
}

public class CountVowelsConsonents {
    public static void main(String[] args) {   //main method
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");   //Taking string as input
        String word = sc.next();

        count obj = new count();   //creating object from count class
        int[] count = obj.countVowCons(word);   //calling the countVowCons method

        int j = 0;   //used to identify whether the current count is vowel or consonant

        System.out.println("below are the counts of vowels and consonents");   //prints the heading

        for (int i : count) {   //loop runs through the vowel and consonant counts
            if (j == 0) {   //checks if the current count is the vowel count
                System.out.println("vowels are: " + i);   //prints the number of vowels
                j++;   //changes the value to identify the next count as consonant
            } else {
                System.out.println("Consonents are: " + i);   //prints the number of consonants
            }
        }
    }
}