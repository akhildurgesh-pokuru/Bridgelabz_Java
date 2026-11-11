package Extras;


/*
 * This program takes a date as input and performs date arithmetic operations.
 * It adds 7 days, 1 month, and 2 years, then subtracts 3 weeks.
 */

import java.time.LocalDate;
import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get date input from the user
        System.out.print("Enter date (yyyy-MM-dd): ");
        String input = sc.nextLine();

        // Convert the input string into LocalDate
        LocalDate date = LocalDate.parse(input);

        // Add 7 days
        date = date.plusDays(7);
        System.out.println("After adding 7 days: " + date);

        // Add 1 month
        date = date.plusMonths(1);
        System.out.println("After adding 1 month: " + date);

        // Add 2 years
        date = date.plusYears(2);
        System.out.println("After adding 2 years: " + date);

        // Subtract 3 weeks
        date = date.minusWeeks(3);
        System.out.println("After subtracting 3 weeks: " + date);

        sc.close();
    }
}

