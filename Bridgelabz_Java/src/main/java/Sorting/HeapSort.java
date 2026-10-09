package Sorting;


/*
 Approach: First, we build a max heap so the largest element comes to the root.
           Then, we move the largest element to the end and repeat the process.
 */

import java.util.Arrays;

public class HeapSort {

    // This method makes sure the largest element stays at the root
    // of the current heap.
    static void heapify(int[] arr, int n, int i) {
        int largest = i;          // Assume the current node is the largest
        int left = 2 * i + 1;     // Find the left child's index
        int right = 2 * i + 2;    // Find the right child's index

        // Check if the left child is larger than the current node
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // Check if the right child is larger than the largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If a child is larger, swap it with the current node
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Fix the affected subtree after the swap
            heapify(arr, n, largest);
        }
    }

    // This method sorts the array using the Heap Sort algorithm.
    static void heapSort(int[] arr) {

        int n = arr.length;

        // Step 1: Build a max heap from the array
        // Start from the last non-leaf node and move towards the root
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Step 2: Move the largest element to the end one by one
        for (int i = n - 1; i > 0; i--) {

            // The root has the largest element, so move it to the end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Restore the max heap using the remaining unsorted elements
            heapify(arr, i, 0);
        }
    }

    public static void main(String[] args) {

        int[] arr = {12, 11, 13, 5, 6, 7};

        // Display the array before sorting
        System.out.println("Before sorting: " + Arrays.toString(arr));

        // Call Heap Sort to arrange the elements in ascending order
        heapSort(arr);

        // Display the sorted array
        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}
