/*
 * Program to find the factors of a given number.
 * The program calculates and displays the factors, the sum of the factors,
 * the sum of squares of the factors, and the product of the factors.
 */

package Methods.Level2;

import java.util.Scanner;

// Class containing methods to perform operations on the factors
class operations{

    // Method to find all the factors of a given number
    public static int[] factors(int number){

        // Array to store the factors
        int[] factors = new int[10];

        int j=0;

        // Loop through numbers from 1 up to the given number
        for(int i=1;i<number;i++){

            // Check whether the current number is a factor
            if(number%i==0){

                // Store the factor in the array
                factors[j] = i;
                j++;
            }
        }

        // Return the array containing the factors
        return factors;
    }

    // Method to calculate the sum of all factors
    public static int sum(int[] factors){

        int sum = 0;

        // Loop through the factors array
        for(int i=0;i<factors.length;i++){

            // Add each factor to the sum
            sum = sum+factors[i];
        }

        // Return the sum of factors
        return sum;
    }

    // Method to calculate the sum of squares of all factors
    public static int square(int[] factors){

        // Array to store the squares of the factors
        int[] squares = new int[10];

        int sum = 0;

        // Loop through the factors array
        for(int i=0;i<factors.length;i++){

            // Calculate the square of each factor
            squares[i] = (int) Math.pow(factors[i],2);

            // Add the square to the total
            sum = sum + squares[i];
        }

        // Return the sum of squares
        return sum;
    }

    // Method to calculate the product of all factors
    public static int products(int[] factors){

        int product = 1;

        // Loop through the factors array
        for(int i=0;i<factors.length;i++){

            // Multiply only non-zero factors
            if(factors[i]!=0) {
                product = product * factors[i];
            }else{
                continue;
            }
        }

        // Return the product of factors
        return product;
    }

}

// Main class of the program
public class FactorsSumSquare {

    // Main method where program execution starts
    public static void main(String[] args){

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        // Find the factors of the given number
        int[] factors = operations.factors(number);

        // Calculate the sum of the factors
        int sum = operations.sum(factors);

        // Calculate the sum of squares of the factors
        int square_sum = operations.square(factors);

        // Calculate the product of the factors
        int product_sum = operations.products(factors);

        // Display the factors of the number
        System.out.println("****Factors of the Number****");

        // Loop through the factors array and display each factor
        for(int i=0;i<factors.length;i++){
            System.out.print(" "+factors[i]);
        }

        System.out.println();

        // Display the sum of the factors
        System.out.println("Sum of the factors: "+sum);

        // Display the sum of squares of the factors
        System.out.println("Sum of Squares of Factors: "+square_sum);

        // Display the product of the factors
        System.out.println("Product of Factors: "+product_sum);
    }
}