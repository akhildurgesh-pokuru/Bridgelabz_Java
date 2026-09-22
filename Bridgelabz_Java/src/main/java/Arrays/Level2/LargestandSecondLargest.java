package Arrays.Level2;

/*program to store the digits of the number in an array and
find the largest and second largest element of the array.
 */

import java.util.Scanner;

public class LargestandSecondLargest {
    public static void main(String[] args) {     //Main Method present inside the class
        Scanner sc = new Scanner(System.in);    //creating object for scanner class and storing it in reference variable
        int[] arr = new int[10];
        System.out.println("Enter the Number");
        int num = sc.nextInt();     //Taking Input as a num from user
        int i=0;
        while(num!=0){     //while condition runs until the number becomes zero
            arr[i] = num%10;   //extracts the last element and store in array
            num = num/10;   // remove the last element
            i++;
        }

        int largest = Integer.MIN_VALUE;      //assign the minimum integer value to largest
        int second_largest = Integer.MIN_VALUE;     //assign the minimum integer value to second_largest

        for(i=0;i<arr.length;i++){      //Traverse the array
            if(arr[i]>largest){        // conditional check to check if digit in an array is greater than largest
                second_largest = largest;     //assign largest to second largest
                largest = arr[i];    // assign greater digit to largest
            }else if(arr[i]>second_largest && arr[i]<largest){   //conditional check for checking if a digit is greater than second number and less than largest number
                second_largest = arr[i];  // assign digit to second largest
            }
        }

        System.out.print("Largest Digit: "+largest);    //prints Largest digit of a number
        System.out.println();
        System.out.print("Second Largest Digit: "+second_largest);   //prints second largest digit of a number
    }
}
