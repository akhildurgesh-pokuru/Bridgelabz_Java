package javaControlFlow;

/*The below Program depicts for finding the Year is a Leap Year
with single If condition.
 */

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);   //Creating the reference for Scanner Object
        System.out.print("Enter the year");
        int year = sc.nextInt();
        if(year>=1582){       // According to georgiean calender Lear Year is calculated only above 1582
            if( (year%4==0 && year%100!=0) || (year%100==0 && year%400==0)){     // single if condition year with divisibility of 4 and not with 100  OR year divisible with 100 along with 400
                System.out.print("It is a Leap Year");   // Prints It is a Leap Year
            }else{
                System.out.print("It is not a Leap Year");   // Prints Not a leap Year
            }
        }else{
            System.out.print("Leap Year is only above the year 1582");   // It is because if the year is less then 1582
        }
    }
}
