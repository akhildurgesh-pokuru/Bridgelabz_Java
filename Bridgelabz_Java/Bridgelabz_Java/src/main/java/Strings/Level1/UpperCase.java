package Strings.Level1;

/*
program to convert the complete text to uppercase and
compare the results
1) converting string to uppercase without using built-in function
2) converting string to upper case using built-in function
3) and comparing both the results
 */

import java.util.Scanner;

class upper{
    public String convert(String sen) {   //method to convert sentence to upper case
        char[] arr = sen.toCharArray();   // array to store characters of the sentence
        for(int i=0;i<arr.length;i++){
            if(arr[i]>='a' && arr[i]<='z'){  //checking weather the character are in between a and z
                arr[i] = (char) (arr[i]-32);  //convert the character to upper case by subtracting 32 and converting it to character
            }
        }
        return new String(arr); //return string by converting array to string
    }
}

class check{
    public boolean cheks(String ans,String sen){  //method to check two strings if they are equal
        boolean result = false;
        if(sen.toUpperCase().equals(ans)){   //converting sentnece to upper case using built-in function and comaparing with string which is normally converted to upper case
            result = true;
        }
        return result; //returning result
    }
}


public class UpperCase {
    public static void main(String[] args){   //main method
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence: ");  //taking sentence as an input from user
        String sen = sc.nextLine();
        upper obj = new upper();  //creating object for upper class
        String ans = obj.convert(sen);   //calling convert method by [assing sentence as parameter
        System.out.println(ans);
        check obj1 = new check();   //creating object for check method
        boolean result = obj1.cheks(ans,sen);  //calling cheks

        if(result){
            System.out.println("Both operations yeild correct answer");  //prints true if both operations yeilds correct answer
        }else{
            System.out.println("Both Operations yeild incorrect answers, check the logic code");  //prints false if both operations yeilds incorrect results
        }
    }
}
