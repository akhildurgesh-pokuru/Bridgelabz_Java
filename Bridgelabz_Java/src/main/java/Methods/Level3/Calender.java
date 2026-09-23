/*
 * Program to display the calendar for a given month and year
 * using the Gregorian calendar algorithm.
 */

package Methods.Level3;

import java.util.Scanner;

class CalendarOperations {

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
        };

        return months[month - 1];
    }

    // Method to check whether the year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) ||
                (year % 4 == 0 && year % 100 != 0);
    }

    // Method to get the number of days in a month
    public static int getNumberOfDays(int month, int year) {
        int[] days = {
                31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };

        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        return days[month - 1];
    }

    // Method to find the first day of the month
    public static int getFirstDay(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;

        return (1 + x + 31 * m0 / 12) % 7;
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        int firstDay = getFirstDay(month, year);
        int numberOfDays = getNumberOfDays(month, year);

        System.out.println("\n" + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Add spaces before the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Display all days
        for (int day = 1; day <= numberOfDays; day++) {
            System.out.printf("%3d ", day);

            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }
}

public class Calender {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter month:");
        int month = sc.nextInt();

        System.out.println("Enter year:");
        int year = sc.nextInt();

        CalendarOperations.displayCalendar(month, year);
    }
}