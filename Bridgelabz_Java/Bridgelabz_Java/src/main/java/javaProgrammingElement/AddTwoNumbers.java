package javaProgrammingElement;

/*
This program takes two numbers as input from the user
and adds them together.
The result of the addition is then displayed on the screen.
*/

import java.util.Scanner;

public class AddTwoNumbers {

    // Main method - execution of the program starts here
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // creates an object of Scanner class to take input from the user

        System.out.print("enter the number1");

        int n1 = sc.nextInt();
        // takes the first number as input from the user

        System.out.print("enter the number2");

        int n2 = sc.nextInt();
        // takes the second number as input from the user

        System.out.print(n1 + n2);
        // adds the two numbers and prints the result
    }
}