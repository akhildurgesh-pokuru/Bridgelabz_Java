package javaControlFlow;

import java.util.Scanner;

public class IsSpringseason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // creating object for scanner
        System.out.print("Enter the Month: ");   // Taking input1 as Month from user
        String month = sc.next();
        System.out.print("Enter the day: ");   // Taking input2 as Day from user
        int day = sc.nextInt();
        if( (month.equals("march")  && day>=20 && day<=31) || (month.equals("april") && day<=30 && day>0) || (month.equals("may") && day<=31 && day>0) || (month.equals("june") && day<=20 && day>0) ){  //placong conditions for month and day
            System.out.print("Yea! It's a Spring Season");   // Printing as the user input satisfies the condition
        }else{
            System.out.print("Nope! It's not a Spring Season");  //Printing Nope! as user input does not satisfies condition
        }
    }
}
