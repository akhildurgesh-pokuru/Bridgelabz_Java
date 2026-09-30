package Arrays.Level2;

import java.util.Scanner;


public class LargestSecondLargest {
    public static void main(String[] args) {      //Main Method present inside the class

        Scanner sc = new Scanner(System.in);  //creating object for scanner class and storing it in reference variable

        // Take number as input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initially create an array of size 10
        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        // Index to store digits in the array
        int index = 0;

        // Extract each digit from the number
        while (number != 0) {

            // If array is full, increase its size by 10
            if (index == maxDigit) {
                maxDigit = maxDigit + 10;

                // Create a new array with increased size
                int[] temp = new int[maxDigit];

                // Copy old array elements into temp array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                // Assign temp array to digits
                digits = temp;
            }

            // Store the last digit in the array
            digits[index] = number % 10;

            // Remove the last digit from the number
            number = number / 10;

            // Move to the next array index
            index++;
        }

        // Initialize largest and second largest
        int largest = 0;
        int secondLargest = 0;

        // Find largest and second largest digit
        for (int i = 0; i < index; i++) {

            // If current digit is greater than largest
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            }

            // Find second largest
            else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        sc.close();
    }
}