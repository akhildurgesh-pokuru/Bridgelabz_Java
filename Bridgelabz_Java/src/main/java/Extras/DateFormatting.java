package Extras;


/*
 * This program displays the current date in three different formats.
 * It uses DateTimeFormatter to customize the date representation.
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {

        // Get the current date
        LocalDate date = LocalDate.now();

        // Create formatters for different date formats
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        // Display the date in different formats
        System.out.println("Format 1: " + date.format(format1));
        System.out.println("Format 2: " + date.format(format2));
        System.out.println("Format 3: " + date.format(format3));
    }
}
