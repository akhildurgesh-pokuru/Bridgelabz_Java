
package Sorting;

/*
This program sorts an array in ascending order using Selection Sort.
It finds the smallest element in each pass and places it in the correct position.
*/

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {54, 90, 54, 92, 86, 52, 74};

        // Traverse the array to place each element in its correct position
        for (int i = 0; i < arr.length; i++) {
            int index = i; // Assume the current element is the smallest

            // Find the smallest element in the remaining unsorted part
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }

            // Swap the smallest element with the current element
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }

        // Print the sorted array
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
