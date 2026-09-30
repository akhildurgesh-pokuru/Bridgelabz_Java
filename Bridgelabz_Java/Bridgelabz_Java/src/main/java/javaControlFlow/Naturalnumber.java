package javaControlFlow;

/*Checking weather the number is
Natural number and printing the summ of N natural numbers
 */

import java.util.Scanner;

public class Naturalnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // creating object for scanner
        System.out.print("Enter the number");   // Taking input from user
        int num = sc.nextInt();
        String result = (num<0)? "It is not a Natural number" : "It is Natural number"; //condition for checking weather number is Natural number or not
        System.out.print(result);
        System.out.print("Enter the Number to print the sum of Natural Numbers");  // Take input printing sum of N natural numbers (N is specified by user)
        int n = sc.nextInt();
        int sum = n*(n+1)/2;    // calculate the sum of N natural numbers
        System.out.print("the sum of: "+n+" Natural numbers is: "+sum);
    }
}
