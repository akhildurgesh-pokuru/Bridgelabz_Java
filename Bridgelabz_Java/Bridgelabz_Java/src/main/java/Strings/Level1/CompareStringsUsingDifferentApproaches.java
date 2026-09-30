package Strings.Level1;

/*
program to create a substring from a String using the charAt() method.
Also, use the String built-in method substring() to find the substring of the text.
Finally Compare the two strings and display the results

 */

import java.util.Scanner;

class compare{
    public String check(String s1, int start, int end){
        String result = "";    //assign empty string
        for(int i=start;i<end;i++){  //traverse the for loop from start to end
            result = result+s1.charAt(i);    //add the characters to result variable
        }
        return result;   //return result
    }
}



public class CompareStringsUsingDifferentApproaches { // main class
        public static void main(String[] args) {   //main method
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the String1: ");   //Taking string as input
            String s1 = sc.next();
            System.out.println("Enter the start Index: ");  //Taking starting index from user
            int start = sc.nextInt();
            System.out.println("Enter hte End Index: ");  //Taking ending index from user
            int end = sc.nextInt();

            compare obj = new compare();  //creating object from string check class
            String result = obj.check(s1, start, end);   //calling the method

            if(s1.substring(start,end).equals(result)){   //check if both operations yeilds correct results
                System.out.println("Both Operations results correct Values");
            }else{
                System.out.println("Both Operations results incorrect results, check the logic code");
            }

        }
    }
