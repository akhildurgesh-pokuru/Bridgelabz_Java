package javaControlFlow;

/*An abundant number is an integer in which the sum of all the divisors of the number is greater than the number itself. For example,
Divisor of 12: 1, 2, 3, 4, 6
Sum of divisor: 1 + 2 + 3 + 4 + 6 = 16 > 12
*/

import java.util.Scanner;

public class Abundant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // creating the object for scanner
        System.out.print("Enter the number");    // Taking the input as Number from user
        int num = sc.nextInt();
        int sum = 0;
        for(int i=1;i<num;i++){    // running for loop from 1 to number
            if(num%i==0){          // checking weather number is divisible by value
                sum = sum + i;    // if divisible adding the current value to sum
            }
        }

        if(sum>num){  // condition check for sum is greater than number
            System.out.print("Number is Abundant");    // Prints Abundant as condition is true
        }else{
            System.out.print("Number is not Abundant");   //Prints Not Abundant as condition is not true
        }
    }
}
