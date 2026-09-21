package javaControlFlow;

import java.util.Scanner;

/*Printing Sum of Numbers
if numbers are not equal to 0
 */

public class Sumofnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // creating object for scanner
        boolean value = true;  // condition for while
        int temp =0;
        int sum = 0;
        while(value){   //initializing while with boolean value
            sum = sum + temp;    // calculating sum
            System.out.println("Enter the number");  // Taking input number from user
             temp = sc.nextInt();
            if(temp!=0){     // if number is not equal to Zero update value to True
                value = true;
            }else{
                value = false;   // if number is equal to Zero update value to False
            }
        }

        System.out.println("Total Sum is: "+sum);

    }
}
