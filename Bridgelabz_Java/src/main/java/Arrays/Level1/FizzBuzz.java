package Arrays.Level1;

/*Write a program FizzBuzz, take a number as user input and if it is a positive integer loop from 0 to the number and save the number,
 but for multiples of 3 save "Fizz" instead of the number, for multiples of 5 save "Buzz", and
 for multiples of both save "FizzBuzz".
 Finally, print the array results
 */

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {   //Main Method present inside the class
        Scanner sc = new Scanner(System.in);     //creating object for scanner class and storing it in reference variable
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        if (num > 0) {    //check if the integer is positive or not
            String[] arr = new String[num];     // create an String Array
            for (int i = 0; i < num; i++) {      // Loop Through the number
                if (i % 3 == 0 && i % 5 == 0) {    //if multiples of both 3 and 5 prints Fizzbuzz
                    arr[i] = "FizzBuzz";
                } else if (i % 3 == 0) {    //if multiple of only 3 then print Fizz
                    arr[i] = "Fizz";
                } else if (i % 5 == 0) {    //if multiple of only 5 then print Buzz
                    arr[i] = "Buzz";
                } else {
                    arr[i] = String.valueOf(i);   //if not a multiple of both 3 and 5 store the integer in string format
                }
            }

            for (int j = 0; j < arr.length; j++) {
                System.out.print(" " + arr[j]);     //print the results of an array
            }
        }else{
            System.err.println("Positive Integer Required");   // as the program requires positive integer it prints requires positive integer
            System.exit(1);   //program will get exit with status code 1
        }
    }
}
