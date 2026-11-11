package Extras;

/*
 * This program displays the current date and time in different time zones.
 * It uses ZonedDateTime and ZoneId to display GMT, IST, and PST times.
 */

import java.time.ZonedDateTime;
import java.time.ZoneId;

public class TimeZones {
    public static void main(String[] args) {

        // Get the current time in GMT
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));

        // Get the current time in IST
        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        // Get the current time in PST
        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        // Display the current time in different time zones
        System.out.println("GMT: " + gmt);
        System.out.println("IST: " + ist);
        System.out.println("PST: " + pst);
    }
}
