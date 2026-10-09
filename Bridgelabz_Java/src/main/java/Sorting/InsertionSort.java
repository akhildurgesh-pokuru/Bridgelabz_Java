
package Sorting;

/*
This program sorts an array in ascending order using Insertion Sort.
It takes each element and inserts it into its correct position in the sorted part.
*/

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {32, 43, 12, 5, 325, 12, 65};

        // Start from the second element and sort each element into its position
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i]; // Store the element that needs to be placed
            int j = i - 1;    // Check elements on the left side

            // Shift larger elements one position to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert the key into its correct position
            arr[j + 1] = key;
        }

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" " + arr[i]);
        }
    }
}
