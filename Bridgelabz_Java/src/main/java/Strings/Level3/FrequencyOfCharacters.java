package Strings.Level3;

import java.util.Scanner;

/*
Finding the frequency of each character in a string
1) storing the frequency of each ASCII character
2) checking which characters are present
3) displaying the character and its frequency
*/

class frequency{
    public int[] freq(String value){ //taking string as parameter
        int[] frq_arr = new int[257]; //array to store frequency of ASCII characters

        for(int i=0;i<value.length();i++){ //looping through the string
            char ch = value.charAt(i); //getting each character
            int index = ch; //taking ASCII value as index
            frq_arr[index]++; //increasing the frequency
        }

        return frq_arr; //returning frequency array
    }
}

public class FrequencyOfCharacters {
    public static void main(String[] args){ //main method
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String"); //taking string input
        String value = sc.next();

        frequency obj = new frequency(); //creating object
        int[] freq = obj.freq(value); //finding frequency of characters

        char[][] details = new char[freq.length][2]; //2D array to store character details

        int k=0,l=0;

        for(int i=0;i<freq.length;i++){ //looping through ASCII values
            if(freq[i]>0){ //checking whether character is present
                char ch = (char) i; //converting ASCII value to character
                System.out.println("Character: "+ch+" "+freq[i]); //printing character and frequency
            }
        }
    }
}