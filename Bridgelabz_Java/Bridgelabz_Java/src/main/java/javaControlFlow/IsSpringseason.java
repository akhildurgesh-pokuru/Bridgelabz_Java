package javaControlFlow;

import java.util.Scanner;

/*
This program checks whether a given date falls within the spring season.
It takes the month and day as input from the user and checks
whether the date falls between March 20 and June 20.
Based on the entered date, it displays whether it is a spring season or not.
*/

public class IsSpringseason {

    // Main method - execution of the program starts here
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // creates an object of Scanner class to take input from the user

        System.out.print("Enter the Month: ");

        String month = sc.next();
        // takes the month as input from the user

        System.out.print("Enter the day: ");

        int day = sc.nextInt();
        // takes the day as input from the user

        if ((month.equals("march") && day >= 20 && day <= 31)
                || (month.equals("april") && day <= 30 && day > 0)
                || (month.equals("may") && day <= 31 && day > 0)
                || (month.equals("june") && day <= 20 && day > 0)) {
            // checks whether the entered month and day fall within the spring season

            System.out.print("Yea! It's a Spring Season");
            // prints the message if the date falls within the spring season

        } else {

            System.out.print("Nope! It's not a Spring Season");
            // prints the message if the date does not fall within the spring season
        }
    }
}