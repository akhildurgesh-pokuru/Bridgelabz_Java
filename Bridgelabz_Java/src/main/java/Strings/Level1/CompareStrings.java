package Strings.Level1;

/*
program to compare two strings using the charAt() method and
 check the result with the built-in String equals() method
 */

import java.util.Scanner;
        public class CompareStrings {  // main class
            public static void main(String[] args) {   //main method
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the String1: ");   //Taking string1 as input 1
                String s1 = sc.next();
                System.out.println("Enter the String2: ");  //Taking String 2 as input2
                String s2 = sc.next();

                Stringcheck obj = new Stringcheck();  //creating object from string check class
                boolean result = obj.check(s1, s2);   //calling the method

                System.out.println("Below Result is Without using equals() function");
                if (result) {      //conditional check on result
                    System.out.println("Both String are equal");  //prints true if condition satisfies
                } else {
                    System.out.println("Both Strings are not equal");  //prints false if condition not satisfies
                }

                System.out.println("Below Result is With using equals() function");  //using equals() function
                if (s1.equals(s2)) {   //checks if 2 strings are equal or not
                    System.out.println("Both String are equal");
                } else {
                    System.out.println("Both Strings are not equal");
                }

            }
        }

class Stringcheck {
    public boolean check(String s1, String s2) {    //method check takes 2 parameters
        boolean result = true;    //initially result is true
        if (s1.length() == s2.length()) {     //checks if their lengths are equal or not
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {   //if one character is not equal then result states false and breaks
                    result = false;
                    break;
                }
            }
        }else{
            result = false;  // replaces result to false if length did not matches
        }
        return result; //returns result
    }
}