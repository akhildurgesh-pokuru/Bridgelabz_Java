package javaControlFlow;

/*Program for printing the table of a number
from 6 to 9
 */

import java.util.Scanner;

public class Multiplicationtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // creating object for scanner
        System.out.print("Enter the Number: ");   // Taking input as number from user
        int number = sc.nextInt();
        for(int i=6;i<=9;i++){   //implementing for loop for values from 6 to 9
            System.out.println(number+" *"+i+" = "+number*i);  //printing the table
        }
    }
}
