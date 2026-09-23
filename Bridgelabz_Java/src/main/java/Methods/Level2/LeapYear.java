package Methods.Level2;

import java.util.Scanner;

class operation{
    public boolean check(int year){
        if(year>=1582){       // According to georgiean calender Lear Year is calculated only above 1582
            if( (year%4==0 && year%100!=0) || (year%100==0 && year%400==0)){     // single if condition year with divisibility of 4 and not with 100  OR year divisible with 100 along with 400
                return true;   // Prints It is a Leap Year
            }else{
                return false;   // Prints Not a leap Year
            }
        }
        return false;
    }
}

public class LeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);   //Creating the reference for Scanner Object
        System.out.print("Enter the year");
        int year = sc.nextInt();
        operation obj = new operation();
        obj.check(year);
    }
}
