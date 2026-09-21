package javaControlFlow;

/*Performing Conditional Operation weather the number is
Positive or Negative or Zero
 */

import java.util.Scanner;

public class PosNegZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // creating object for scanner
        System.out.print("Enter the First number");   // Taking input from user
        int num1 = sc.nextInt();
        if(num1>0){     // If Number is Greater than 0
            System.out.print("Number is Positive");    //Prints Positive
        }else if(num1<0){   // If Number is less then Zero
            System.out.print("Number is Negative");    // prints Negative
        }else{
            System.out.print("Number is Zero"); // Else the Number is Zero so Printing Zero
        }
    }
}
