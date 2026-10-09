
package Sorting;

/*
This program sorts an array in ascending order using Counting Sort.
It counts the occurrences of each element and places them back in sorted order.
*/

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {12, 16, 13, 18, 9, 15};
        int[] counting = new int[19];

        // Count how many times each element appears in the array
        for (int i = 0; i < arr.length; i++) {
            counting[arr[i]]++;
        }

        int j = 0;

        // Traverse the counting array to arrange elements in ascending order
        for (int i = 0; i < counting.length; i++) {

            // Add the element back as many times as it appears
            while (counting[i] > 0) {
                arr[j] = i;
                j++;
                counting[i]--;
            }
        }

        // Print the sorted array
        for (int k : arr) {
            System.out.println(" " + k);
        }
    }
}
