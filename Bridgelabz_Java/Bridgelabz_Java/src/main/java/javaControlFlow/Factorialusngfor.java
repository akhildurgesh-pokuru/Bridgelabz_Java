package javaControlFlow;

/*Program for Finding the Factorial of a number
using For Loop
 */

import java.util.Scanner;

public class Factorialusngfor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // creating object for scanner
        System.out.print("Enter the number");   // Taking input from user
        int num = sc.nextInt();
        int sum = 1;
        for(int i=num;i>1;i--){   //implementing for loop for running until number decrements to 1
            sum = sum*i;   // multiplying the number with previous sum at each iteration
        }

        System.out.print("Factorial of "+num+" is: "+sum);    //printing the final sum
    }
}
