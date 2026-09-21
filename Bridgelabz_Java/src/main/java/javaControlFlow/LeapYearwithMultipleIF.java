package javaControlFlow;

/*The below Program depicts for finding the Year is a Leap Year
with multiple If conditions.
 */

import java.util.Scanner;

public class LeapYearwithMultipleIF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   // creating scanner object with reference variable
        System.out.print("Enter the year");    // Taking input as Year from user
        int year = sc.nextInt();

        if (year % 400 == 0) {    // if year is divisible by 400
            System.out.println(year + " is a Leap Year.");   // prints it is a leap year
        } else if (year % 100 == 0) {     // if year divisible by 100 it is not a leap year
            System.out.println(year + " is not a Leap Year.");  // prints it is not a leap year
        } else if (year % 4 == 0) {      // if year is divisible by 4 then it is leap year
            System.out.println(year + " is a Leap Year.");    // prints it is leap year
        } else {
            System.out.println(year + " is not a Leap Year.");   // on other cases it prints it is not a leap year
        }

    }
}
