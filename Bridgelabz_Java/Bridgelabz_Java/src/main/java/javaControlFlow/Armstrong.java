package javaControlFlow;

/*The below program implements finding
weather the number is Armstrong or not.
Armstrong Number is a number whose Sum of cubes of each digit results in the original number e.g. 153 = 1^3 + 5^3 + 3^3

 */

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);  // creating the object for scanner
        System.out.print("Enter the number");    // Taking the input as Number from user
        int num = sc.nextInt();
        int result = num;    // storing the number in result to preserve the number for further operations
        int sum = 0;
        while(num!=0){      //initializing while loop with number not equal to 0
            int a = num%10;      // Extract the last digit in a number
            sum = sum + (a*a*a);      // adding the extracted element to the sum with cube of a number
            num = num/10;    // remove the last element from the number
        }

        if(sum==result){   //check weather the sum is equal to the preserved element
            System.out.print("Number is ArmStrong");       // Prints true if Equal
        }else{
            System.out.print("Number is not an ArmStrong");   // Prints false if not equal
        }
    }
}
