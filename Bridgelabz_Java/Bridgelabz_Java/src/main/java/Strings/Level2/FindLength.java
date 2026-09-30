package Strings.Level2;

/*
Finding the length of string without using length() method
 */

import Strings.Level1.IndexOutOfBounds;

import java.util.Scanner;

class find_length{
    public int length(String word){  //method for finding length
        int count = 0,i=0;
        try{
            while(true){  //kept while loop running for infinite times
                word.charAt(i); //checking the character
                count++; //incrementing count
                i++;
            }
        }catch(IndexOutOfBoundsException e){

        }
        return count; //returning count
    }
}




public class FindLength {  //main class
    public static void main(String[] args){  //main method
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String"); //taking string input from user
        String word = sc.nextLine();
        find_length obj = new find_length(); // creating object to find length
        int len = obj.length(word);  //calling length method
        System.out.println("The length: "+len);  //printing the length
    }
}
