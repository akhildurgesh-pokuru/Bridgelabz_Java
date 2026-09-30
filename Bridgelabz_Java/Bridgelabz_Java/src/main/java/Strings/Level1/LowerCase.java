package Strings.Level1;

/*
program to convert the complete text to lowercase and
compare the results
 */

import java.util.Scanner;

class lower_convert{
    public String convert(String sen) {  //method to convert string to lower case
        char[] arr = sen.toCharArray();   //array to store characters of string
        for(int i=0;i<arr.length;i++){   //loop through the string to convert each character to lower case
            if(arr[i]>='A' && arr[i]<='Z'){  //check weather character is between A and Z
                arr[i] = (char) (arr[i]+32);  //adding 32 to each character and converting to character to store in array
            }
        }
        return new String(arr); //return array by converting array to string
    }
}

class lower_check{
    public boolean cheks(String ans,String sen){  //check method takes parameter of two strings (computed normally) and normal string to compute
        boolean result = false;   //initially result will be in the state of false
        if(sen.toLowerCase().equals(ans)){   //checks 2 strings , by converting the normal string to lower case and converted string (without built-in)
            result = true;  //if true result is in stage of true
        }
        return result;  //returns result
    }
}




public class LowerCase {  //main class
    public static void main(String[] args){  //main method
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence: ");  //taking the sentence as an input
        String sen = sc.nextLine();
        lower_convert obj = new lower_convert();   //creating object for lower_convert
        String ans = obj.convert(sen);   //calling the convert method
        System.out.println(ans);
        lower_check obj1 = new lower_check();   //creating method for lower check class
        boolean result = obj1.cheks(ans,sen);

        if(result){   //based on literal of result prints weather the operations yeild correct
            System.out.println("Both operations yeild correct answer");  //prints both operation yeild correct output
        }else{
            System.out.println("Both Operations yeild incorrect answers, check the logic code"); //prints both the operations yeilds different solutions
        }
    }
}
