package javaControlFlow;

/*Finding the Factorial of a number
by multiplying values from number decrementing to 1
 */

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // creating object for scanner
        System.out.print("Enter the number: ");   // Taking input from user
        int num = sc.nextInt();
        int sum = 1;
        while (num != 1) {    //using while loop by placing condition number not equal to zero
            sum = sum*num;   // multiplying the values by decrementing number
            num--;  //decrementing the number
        }

        System.out.print("Factorial of "+num+ " is: "+sum);   //Printing the result
    }
}
