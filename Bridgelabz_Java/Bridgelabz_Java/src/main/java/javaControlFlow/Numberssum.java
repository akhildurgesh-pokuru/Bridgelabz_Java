package javaControlFlow;

/*Printing Sum of Numbers
if numbers are not equal to 0 and negative numbers
 */

import java.util.Scanner;

public class Numberssum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // creating object for scanner
        int temp =0;
        int sum = 0;
        while(true){
            System.out.println("Enter the number");  //Taking input as Number from user
            temp = sc.nextInt();
            if(temp!=0 && temp>0){  //conditon on weather number is not equal to 0 or Less than zero
                sum = sum + temp;  //calculating sum
            }else{
                break;
            }
        }

        System.out.println("Total Sum is: "+sum);

    }
}
