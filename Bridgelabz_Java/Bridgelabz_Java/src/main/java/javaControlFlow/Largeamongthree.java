package javaControlFlow;

/*Finding the largest number
among three numbers
 */

import java.util.Scanner;

public class Largeamongthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // creating object for scanner
        System.out.print("Enter the First number");   // Taking input1 from user
        int num1 = sc.nextInt();
        System.out.print("Enter the Second number");  // Taking input2 from user
        int num2 = sc.nextInt();
        System.out.print("Enter the third number");  // Taking input3 from user
        int num3 = sc.nextInt();
        int temp = Math.max(num1, num2);      // finding largest from first 2 numbers
        int largest = Math.max(temp,num3);    // finding the highest number among third number and temp
        System.out.println("Largest among three numbers is :"+largest);   // printing the highest number
    }
}
