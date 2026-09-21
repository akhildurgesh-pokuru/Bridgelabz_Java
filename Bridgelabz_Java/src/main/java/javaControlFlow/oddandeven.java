package javaControlFlow;

/* Implementing Program for finding even and odd numbers between
one(1) and user entered number
 */

import java.util.Scanner;

/* Below Program states that Finding the numbers from
1 and number(entered by user) and identifying weather it is Even or Odd
 */

public class oddandeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // creating object for scanner
        System.out.print("Enter the number: ");   // Taking input from user
        int num = sc.nextInt();

        if (num >= 0) {
            for (int i = 1; i <= num; i++) {     //iterating For loop to the number entered by user
                if (i % 2 == 0) {   //checking weather number is Even or Odd
                    System.out.println(i + " is Even");  //prints Even if Condition satisfies
                } else {
                    System.out.println(i + " is Odd");   // prints Odd if condition Not Satisfies
                }
            }
        }else{
            System.out.print("Enter a Natural Number");  // Prints if user entered number is not Positive
        }
    }
}
