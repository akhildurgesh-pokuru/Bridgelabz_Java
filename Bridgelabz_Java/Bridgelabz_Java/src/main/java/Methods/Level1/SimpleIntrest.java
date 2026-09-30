package Methods.Level1;
/*program to input the Principal, Rate, and Time values and
 calculate Simple Interest.
 */

import java.util.Scanner;

class calculate{
    public void result(int principle, int rate, int time){
        int simple_interest = (principle*rate*time)/100;  //calculates simple interest
        System.out.println("The Simple Intrese is: "+simple_interest+" For Principle: "+principle+" For Rate: "+rate+" For Time: "+time);
    }
}


public class SimpleIntrest {
    public static void main(String[] args){  //main method
        Scanner sc = new Scanner(System.in);  //create object for scanner class
        System.out.println("Enter the Principle, Rate, Time");
        int principle = sc.nextInt();   //Taking input as principle from user
        int rate = sc.nextInt();    //Taking input as rate from user
        int time = sc.nextInt();   //Taking input as time from user
        calculate c = new calculate();  //create the object for calculate class
        c.result(principle,rate,time);  //call the result method
    }
}
