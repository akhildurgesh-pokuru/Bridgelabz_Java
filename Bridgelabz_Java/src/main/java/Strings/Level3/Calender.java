package Strings.Level3;

import java.util.Scanner;

/*
Displaying calendar for a given month and year
1) finding the month name
2) finding the number of days in the month
3) finding whether the year is a leap year
4) finding the first day of the month
5) displaying the calendar
*/

class calendar{
    public String month_name(int month){ //taking month as parameter
        String[] months = {"January","February","March","April","May","June",
                "July","August","September","October","November","December"};

        return months[month-1]; //returning month name
    }

    public boolean leap_year(int year){ //taking year as parameter
        if(year%400==0 || (year%4==0 && year%100!=0)){ //checking leap year condition
            return true;
        }

        return false;
    }

    public int days_in_month(int month,int year){ //taking month and year as parameters
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31}; //array to store number of days

        if(month==2 && leap_year(year)){ //checking February in leap year
            return 29;
        }

        return days[month-1]; //returning number of days
    }

    public int first_day(int month,int year){ //taking month and year as parameters
        int d = 1;

        int y0 = year - (14-month)/12; //calculating adjusted year
        int x = y0 + y0/4 - y0/100 + y0/400; //calculating year value
        int m0 = month + 12*((14-month)/12) - 2; //calculating adjusted month
        int d0 = (d + x + 31*m0/12)%7; //calculating first day

        return d0; //returning first day
    }

    public void display(int month,int year){ //taking month and year as parameters
        System.out.println("      "+month_name(month)+" "+year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int first = first_day(month,year); //finding first day
        int days = days_in_month(month,year); //finding number of days

        for(int i=0;i<first;i++){ //adding spaces before first day
            System.out.print("    ");
        }

        for(int day=1;day<=days;day++){ //displaying days of month
            System.out.printf("%3d ",day); //displaying day with proper spacing

            if((first+day)%7==0){ //checking whether Saturday is reached
                System.out.println();
            }
        }
    }
}

public class Calender {
    public static void main(String[] args){ //main method
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter month and year"); //taking month and year input
        int month = sc.nextInt();
        int year = sc.nextInt();

        calendar obj = new calendar(); //creating object
        obj.display(month,year); //displaying calendar
    }
}