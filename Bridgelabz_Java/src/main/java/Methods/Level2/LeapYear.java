/*
 * Program to check whether a given year is a leap year or not.
 * The program takes a year as input from the user and checks
 * whether the year satisfies the leap year conditions.
 */

package Methods.Level2;

import java.util.Scanner;

// Class containing the method to check whether the year is a leap year
class operation{

    // Method to check whether the given year is a leap year
    public boolean check(int year){

        // According to the Gregorian calendar, leap year calculation
        // is considered for years from 1582 onwards
        if(year>=1582){

            // Check whether the year is divisible by 4 and not by 100,
            // or divisible by both 100 and 400
            if( (year%4==0 && year%100!=0) || (year%100==0 && year%400==0)){

                // Return true when the year is a leap year
                return true;

            }else{

                // Return false when the year is not a leap year
                return false;
            }
        }

        // Return false for years before 1582
        return false;
    }
}

// Main class of the program
public class LeapYear {

    // Main method where program execution starts
    public static void main(String[] args){

        // Creating the reference for Scanner Object
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the year
        System.out.print("Enter the year");

        // Take the year as input from the user
        int year = sc.nextInt();

        // Create an object of the operation class
        operation obj = new operation();

        // Call the check method to determine whether the year is a leap year
        obj.check(year);
    }
}