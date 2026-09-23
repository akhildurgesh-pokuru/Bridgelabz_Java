/*
 * Program to calculate the sum of the first N natural numbers.
 * The program takes a number as input from the user, calculates the sum
 * using a loop and also calculates the sum using the mathematical formula.
 * Finally, it compares both results and displays whether they are equal.
 */

package Methods.Level2;

import java.util.Scanner;

// Class containing the method to calculate the sum of natural numbers
class calculate{

    // Method to calculate the sum of natural numbers using a loop
    public int sum(int num){

        int i,sum=0;

        // Loop from 1 up to the given number
        for(i=1;i<=num;i++){

            // Add the current number to the sum
            sum=sum+i;
        }

        // Return the calculated sum
        return sum;
    }
}

// Main class of the program
public class SumOfNNaturalNumbers {

    // Main method where program execution starts
    public static void main(String[] args){

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.println("Enter the number: ");

        // Take the number as input from the user
        int num = sc.nextInt();

        // Create an object of the calculate class
        calculate obj = new calculate();

        // Calculate the sum using the sum method
        int result = obj.sum(num);

        // Calculate the sum using the mathematical formula
        int result_on_formula = (num*(num+1))/2;

        // Display the result calculated using the loop
        System.out.println("result: "+result);

        // Display the result calculated using the formula
        System.out.println("result on formulae: "+result_on_formula);

        // Compare both calculated results
        if(result==result_on_formula){

            // Display when both results are equal
            System.out.println("Both are equal");

        }else{

            // Display when both results are not equal
            System.out.println("Both are not equal");
        }
    }
}