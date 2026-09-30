package javaControlFlow;

/* The below program implements Harshad Number
harshad number : A Harshad number is an integer which is divisible by the sum of its digits.
For example, 21 which is perfectly divided by 3 (sum of digits: 2 + 1).

 */

import java.util.Scanner;

public class Harshadnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // creating the object for scanner
        System.out.print("Enter the number");    // Taking the input as Number from user
        int num = sc.nextInt();
        int sum  = 0;   //initialize the sum to zero
        int result = num;   // strong the number into another variable for future operations
        while(num!=0){   // run the while loop until number not equal to zero
            sum = sum + (num%10);   // calculating the sum by adding each digit
            num = num/10;  // decrementing the number = removing the last digit of a number
        }

        if(result%sum==0){   // if result is divisible by sum of a number
            System.out.println("Number is Harshad Number");  // prints Harshad Number if condition satisfies
        }else{
            System.out.print("numebr is not a Harshad Number");  // prints Not a harshad number as condition not satisfies
        }
    }
}
