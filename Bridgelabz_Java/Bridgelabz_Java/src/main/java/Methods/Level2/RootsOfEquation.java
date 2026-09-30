/*
 * Program to find the roots of a quadratic equation.
 * The program takes the values of a, b, and c from the user,
 * calculates the discriminant, finds the roots of the equation,
 * and displays the roots.
 */

package Methods.Level2;

import java.util.Scanner;

// Class containing the method to find the roots of the equation
class findingroots{

    // Method to calculate and return the roots of the quadratic equation
    public int[] roots(int a, int b,int c){

        // Calculate the discriminant of the quadratic equation
        int delta = (b*b)+ 4 * a * c;

        // Create an array to store the two roots
        int[] roots = new int[2];

        // Check if the equation has two different roots
        if(delta>0){

            // Calculate the first root
            roots[0] = (int) (-b + Math.sqrt(delta))/(2*a);

            // Calculate the second root
            roots[1] = (int) (-b - Math.sqrt(delta))/(2*a);

            // Check if the equation has one repeated root
        }else if(delta==0){

            // Calculate the repeated root
            roots[0] = -b/(2*a);
        }

        // Return the roots array
        return roots;
    }

}


// Main class of the program
public class RootsOfEquation {

    // Main method where program execution starts
    public static void main(String[] args){

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the value of a
        System.out.println("Enter the Values of a: ");
        int a = sc.nextInt();

        // Ask the user to enter the value of b
        System.out.println("Enter the Values of b: ");
        int b = sc.nextInt();

        // Ask the user to enter the value of c
        System.out.println("Enter the value of c: ");
        int c = sc.nextInt();

        // Create an object of the findingroots class
        findingroots obj = new findingroots();

        // Call the roots method to find the roots
        int[] roots = obj.roots(a,b,c);

        // Display a message before showing the roots
        System.out.println("View the roots below");

        // Loop through the roots array
        for(int i=0;i<roots.length;i++){

            // Display each root
            System.out.print(" "+roots[i]);
        }
    }
}