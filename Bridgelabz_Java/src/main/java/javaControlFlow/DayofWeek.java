package javaControlFlow;

/*Your program should take three command-line arguments: m (month), d (day), and y (year).
For m use 1 for January, 2 for February, and so forth.
 For output print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth.
 Use the following formulas, for the Gregorian calendar (where / denotes integer division)
 */

import java.util.Scanner;

public class DayofWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // creating the object for scanner
        System.out.print("Enter the Month");    // Taking the input as Month from user
        int month = sc.nextInt();
        System.out.print("Enter the day");    // Taking the input as day from user
        int day = sc.nextInt();
        System.out.print("Enter the Year");   // Taking the input as year from user
        int year = sc.nextInt();

        int y1 = year - (14-month) /12;     // Finding the YEAR
        int x = y1 + (y1/4) - (y1/100) + y1/400;  // Computing the value x with YEAR
        int m1 = month + 12 * ((14-month)/12) - 2;  // computing the value Month1
        int d1 = (day + x + (31*m1) /12)%7;  // finally finding the day on which it lies

        System.out.print("The Day falls is: "+d1);   // printing the Day falls it on
    }
}
