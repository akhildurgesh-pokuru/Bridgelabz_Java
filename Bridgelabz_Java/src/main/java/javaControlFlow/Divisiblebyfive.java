package javaControlFlow;

/*
Program for checking weather number
is divisible by 5
 */
import java.util.Scanner;

public class Divisiblebyfive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);    // creating object for scanner
        System.out.print("Enter the number");   // Taking input from user
        int num = sc.nextInt();
        boolean result = (num%5==0)? true : false;      // condition implementation
        if(result){
            System.out.print("Number is divisible by 5");    // if condition is True
        }else{
            System.out.print("Number is not divisible by 5");    // if condition is False
        }
    }
}
