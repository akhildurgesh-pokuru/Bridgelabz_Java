package Strings.Extras;

/*
program to replace all occurrences of the character "i"
with the word "you" in a given sentence
 */

import java.util.Scanner;

class replace_class {
    public String replace(String sen) {   //method replace takes a sentence as parameter
        sen = sen.replaceAll("i", "you");   //replaces all occurrences of "i" with "you"
        return sen;   //returns the updated sentence
    }
}

public class Replace {
    public static void main(String[] args) {   //main method
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sentence");   //Taking sentence as input
        String sen = sc.nextLine();

        replace_class obj = new replace_class();   //creating object from replace_class class
        String result = obj.replace(sen);   //calling the replace method

        System.out.println("The result String is: " + result);   //prints the updated sentence
    }
}