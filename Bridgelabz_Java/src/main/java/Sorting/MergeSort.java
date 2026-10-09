
package Sorting;

/*
This program sorts an array in ascending order using Merge Sort.
It divides the array into smaller parts, sorts them, and merges them back together.
*/

class Sort {
    int length;
    int[] result;

    Sort(int length) {
        this.length = length;
        result = new int[length];
    }

    public void mergeSort(int[] arr, int low, int up) {

        // Divide the array until each part contains only one element
        if (low < up) {
            int mid = low + (up - low) / 2;

            // Sort the left half of the array
            mergeSort(arr, low, mid);

            // Sort the right half of the array
            mergeSort(arr, mid + 1, up);

            // Merge both sorted halves into one sorted section
            merge(arr, low, mid, up);
        }
    }

    public void merge(int[] arr, int low, int mid, int up) {
        int i = low;      // Starting index of the left half
        int j = mid + 1;  // Starting index of the right half
        int k = low;      // Position to store the next smallest element

        // Compare elements from both halves and take the smaller one
        while (i <= mid && j <= up) {
            if (arr[i] <= arr[j]) {
                result[k] = arr[i];
                k++;
                i++;
            } else {
                result[k] = arr[j];
                k++;
                j++;
            }
        }

        // Copy any remaining elements from the right half
        if (i > mid) {
            while (j <= up) {
                result[k] = arr[j];
                k++;
                j++;
            }
        } else {
            // Copy any remaining elements from the left half
            while (i <= mid) {
                result[k] = arr[i];
                k++;
                i++;
            }
        }

        // Copy the merged elements back into the original array
        for (int p = low; p <= up; p++) {
            arr[p] = result[p];
        }
    }
}

public class MergeSort {
    public static void main(String[] args) {
        int[] prices = {50, 20, 120, 60, 59, 45};

        // Create a Sort object and pass the array length
        Sort sort = new Sort(prices.length);

        // Sort the array from the first index to the last index
        sort.mergeSort(prices, 0, prices.length - 1);

        // Print each sorted price
        for (int price : prices) {
            System.out.println(" " + price);
        }
    }
}
