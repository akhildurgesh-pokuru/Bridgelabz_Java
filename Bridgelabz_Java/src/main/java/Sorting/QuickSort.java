
package Sorting;

/*
This program sorts an array in ascending order using Quick Sort.
It selects a pivot element, places it in its correct position, and sorts both sides.
*/

class sorting {

    public void quickSort(int[] arr, int low, int up) {

        // Continue sorting while the array section has more than one element
        if (low < up) {
            int loc = partition(arr, low, up);

            // Sort the elements on the left side of the pivot
            quickSort(arr, low, loc - 1);

            // Sort the elements on the right side of the pivot
            quickSort(arr, loc + 1, up);
        }
    }

    public int partition(int[] arr, int low, int up) {
        int start = low;
        int end = up;
        int pivot = arr[low]; // Choose the first element as the pivot

        // Move elements to the correct sides of the pivot
        while (start < end) {

            // Find an element greater than the pivot from the left
            while (start < up && arr[start] <= pivot) {
                start++;
            }

            // Find an element smaller than or equal to the pivot from the right
            while (arr[end] > pivot) {
                end--;
            }

            // Swap the elements if the pointers have not crossed
            if (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }

        // Place the pivot in its correct position
        int temp = arr[low];
        arr[low] = arr[end];
        arr[end] = temp;

        // Return the pivot's final position
        return end;
    }
}

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};

        // Create an object to perform Quick Sort
        sorting sort = new sorting();

        // Sort the array from the first index to the last index
        sort.quickSort(arr, 0, arr.length - 1);

        // Print the sorted array
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
