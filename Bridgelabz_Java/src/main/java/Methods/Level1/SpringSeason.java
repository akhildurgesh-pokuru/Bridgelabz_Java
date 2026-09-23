package Methods.Level1;

/*program SpringSeason that takes two int values month and day from the command line and
prints “Its a Spring Season” otherwise prints “Not a Spring Season”
 */

import javax.swing.*;
import java.util.Scanner;

class spring{
    public void find(String month, int day){
        if( (month.equals("march")  && day>=20 && day<=31) || (month.equals("april") && day<=30 && day>0) || (month.equals("may") && day<=31 && day>0) || (month.equals("june") && day<=20 && day>0) ){  // conditions for month and day
            System.out.print("Yea! It's a Spring Season");   // Printing as the user input satisfies the condition
        }else{
            System.out.print("Nope! It's not a Spring Season");  //Printing Nope! as user input does not satisfies condition
        }
    }
}

public class SpringSeason {
    public static void main(String[] args) {  //main method
        Scanner sc = new Scanner(System.in);    // creating object for scanner
        System.out.print("Enter the Month: ");   // Taking input1 as Month from user
        String month = sc.next();
        System.out.print("Enter the day: ");   // Taking input2 as Day from user
        int day = sc.nextInt();
        spring obj = new spring();   //create object for spring class
        obj.find(month,day);   // calls the find method
    }
}
