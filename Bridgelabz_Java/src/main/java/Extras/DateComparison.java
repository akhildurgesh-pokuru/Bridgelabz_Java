package Extras;


/*
 * This program compares two dates entered by the user.
 * It checks whether the first date is before, after, or equal to the second date.
 */

import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get the first date
        System.out.print("Enter first date (yyyy-MM-dd): ");
        LocalDate date1 = LocalDate.parse(sc.nextLine());

        // Get the second date
        System.out.print("Enter second date (yyyy-MM-dd): ");
        LocalDate date2 = LocalDate.parse(sc.nextLine());

        // Compare the two dates
        if (date1.isBefore(date2)) {
            System.out.println("First date is before the second date.");
        }
        else if (date1.isAfter(date2)) {
            System.out.println("First date is after the second date.");
        }
        else {
            System.out.println("Both dates are equal.");
        }

        sc.close();
    }
}

