package java.RunTimeAnalysis;


/*
 * This program compares Bubble Sort, Merge Sort, and Quick Sort algorithms.
 * It measures their execution time for different dataset sizes.
 */

import java.util.Arrays;
import java.util.Random;

public class SortingPerformanceComparison {

    // Bubble Sort - O(N^2)
    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    // Merge Sort - O(N log N)
    public static void mergeSort(int[] arr, int left, int right) {

        if (left < right) {

            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    // Merge two sorted portions
    public static void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {

            if (leftArray[i] <= rightArray[j]) {
                arr[k++] = leftArray[i++];
            }
            else {
                arr[k++] = rightArray[j++];
            }
        }

        while (i < n1) {
            arr[k++] = leftArray[i++];
        }

        while (j < n2) {
            arr[k++] = rightArray[j++];
        }
    }

    // Quick Sort - Average O(N log N)
    public static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Partition function for Quick Sort
    public static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];

        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] <= pivot) {

                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Generate random dataset
    public static int[] generateArray(int size) {

        Random random = new Random();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100000);
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] sizes = {1000, 10000, 1000000};

        for (int size : sizes) {

            System.out.println("\nDataset Size: " + size);

            int[] original = generateArray(size);

            // Bubble Sort is skipped for one million elements
            if (size <= 10000) {

                int[] bubbleArray = original.clone();

                long start = System.nanoTime();

                bubbleSort(bubbleArray);

                long end = System.nanoTime();

                System.out.println("Bubble Sort: " +
                        (end - start) / 1_000_000.0 + " ms");
            }
            else {
                System.out.println("Bubble Sort: Skipped (too slow)");
            }

            // Measure Merge Sort
            int[] mergeArray = original.clone();

            long start = System.nanoTime();

            mergeSort(mergeArray, 0, mergeArray.length - 1);

            long end = System.nanoTime();

            System.out.println("Merge Sort: " +
                    (end - start) / 1_000_000.0 + " ms");

            // Measure Quick Sort
            int[] quickArray = original.clone();

            start = System.nanoTime();

            quickSort(quickArray, 0, quickArray.length - 1);

            end = System.nanoTime();

            System.out.println("Quick Sort: " +
                    (end - start) / 1_000_000.0 + " ms");
        }
    }
}

