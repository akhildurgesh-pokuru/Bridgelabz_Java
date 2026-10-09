
package Sorting;

/*
This program sorts an array in ascending order using Bubble Sort.
It compares adjacent elements and swaps them whenever they are in the wrong order.
*/

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};

        // Repeat the process to sort all elements
        for (int i = 0; i < arr.length; i++) {

            // Compare adjacent elements and move larger elements to the right
            for (int j = 0; j < arr.length - i - 1; j++) {

                // Swap the elements if they are in the wrong order
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
