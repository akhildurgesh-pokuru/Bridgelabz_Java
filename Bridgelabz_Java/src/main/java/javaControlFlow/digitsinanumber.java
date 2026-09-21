package javaControlFlow;

/* The below implements to find out the
number of digits present in a number
 */

import java.util.Scanner;

public class digitsinanumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // creating the object for scanner
        System.out.print("Enter the number");    // Taking the input as Number from user
        int num = sc.nextInt();
        int count = 0;   //initialize the count variable initially to zero
        while(num!=0){    // add while loop with condition as number not equal to zero
            count++;         // incrementing the count as condition satisfies
            num = num/10;         // removing the last digit of a number
        }

        System.out.print("Number of digits present in the "+num+" is: "+count);   // print the result
    }
}
