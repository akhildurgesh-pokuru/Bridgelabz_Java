package Strings.Level1;

/*
Comparing the two strings between two operations
1) splitting the String into characters without using built in split method
2) splitting the string into characters with using split method
3) finally comparing both the strings weather they yeild same or not
 */

import java.util.Scanner;

class compare_using_array{
    public char[] split(String s1){  //taking parameter as string
        char[] characters = new char[s1.length()];   //character array to store characters
        for(int i=0;i<s1.length();i++) {   //looping through the string
            characters[i] = s1.charAt(i);   //storing the each character in the array;
        }
        return characters;
    }
}

public class ComapreStringUsingArrays {     //main class
    public static void main(String[] args) {   //main method
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String1: ");   //Taking string as input
        String s1 = sc.next();
        compare_using_array obj = new compare_using_array();  //creating object
        char[] characters = obj.split(s1);  //performing built-in method
        boolean result = true;
        int i=0;

        for(char ch : s1.toCharArray()){ //loop for checking both operations yeild correct output
            if(ch!=characters[i]){  //checking if one character is not equal
                result = false;
                break;
            }
            i++;
        }

        if(result){   //based on result variable checking weather they both yeild correct output
            System.out.println("Both Operations yeilds correct results");
        }else{
            System.out.println("Both Yeilds different results, check the logic");
        }
    }
}