package javaControlFlow;

/*Program for Counter Decrement
 */

import java.util.Scanner;

public class Counterdecrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // creating object for scanner
        System.out.print("Enter the counter: ");   // Taking input as counter from user
        int count = sc.nextInt();
        while(count!=1){    //initializing while loop with condition count not equal to 1
            System.out.println("Counter is: "+count);  // printing the counter
            count--;   //Decrementing the Counter
        }
    }
}
