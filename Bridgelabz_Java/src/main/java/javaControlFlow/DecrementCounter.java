package javaControlFlow;

import java.util.Scanner;

public class DecrementCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // creating object for scanner
        System.out.print("Enter the Counter");   // Taking input as counter from user
        int counter = sc.nextInt();
        for(int i=counter;i>1;i--){
            System.out.println("Counter is: "+i);
        }
    }
}
