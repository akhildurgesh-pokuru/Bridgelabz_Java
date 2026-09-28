package Arrays.Level1;

import java.util.Scanner;

/*
This program takes values from the user and stores them in a 3x3 2D array.
It then copies all the values from the 2D array into a 1D array
and finally displays all the values of the 1D array on the screen.
*/

public class Copy2DTo1D {

    // Main method - execution of the program starts here
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // creates an object of Scanner class to take input from the user

        int[][] twodarray = new int[3][3];
        // creates a 3x3 two-dimensional array to store the values

        int i, j;
        // declares variables used for row and column positions

        System.out.print("Enter the values to store in 2D array");

        for (i = 0; i < 3; i++) {
            // loops through the rows of the 2D array

            for (j = 0; j < 3; j++) {
                // loops through the columns of the 2D array

                twodarray[i][j] = sc.nextInt();
                // takes input from the user and stores it in the 2D array
            }
        }

        int a = 0;
        // keeps track of the position in the 1D array

        int[] singlearray = new int[3 * 3];
        // creates a 1D array with 9 positions to store all values from the 2D array

        for (i = 0; i < 3; i++) {
            // loops through the rows of the 2D array

            for (j = 0; j < 3; j++) {
                // loops through the columns of the 2D array

                singlearray[a] = twodarray[i][j];
                // copies each value from the 2D array into the 1D array

                a++;
                // moves to the next position in the 1D array
            }
        }

        for (a = 0; a < singlearray.length; a++) {
            // loops through all the elements of the 1D array

            System.out.print(" " + singlearray[a]);
            // prints each value stored in the 1D array
        }
    }
}