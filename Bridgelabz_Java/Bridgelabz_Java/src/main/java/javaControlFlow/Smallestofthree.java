package javaControlFlow;

/* Finding weather the First number is
smallest among the other three numbers
 */

import java.util.Scanner;

public class Smallestofthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // creating object for scanner
        System.out.print("Enter the First number");   // Taking input1 from user
        int num1 = sc.nextInt();
        System.out.print("Enter the second number");  // Taking input2 from user
        int num2 = sc.nextInt();
        System.out.print("Enter the third Number");   // Taking input3 from user
        int num3 = sc.nextInt();
        if(num1 < num2 && num1 < num3){      // check weather first number is less than other three
            System.out.print("First number is smallest than other three");      // print true if conditon satifies
        }else{
            System.out.print("First number is not the smallest among the other three"); // print false if condition not satisfies
        }
    }
}
