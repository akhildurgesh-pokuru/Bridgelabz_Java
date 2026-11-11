package java.RunTimeAnalysis;

/*
 * This program compares the performance of Linear Search and Binary Search.
 * It measures execution time for different dataset sizes using System.nanoTime().
 */

import java.util.Arrays;
import java.util.Random;

public class SearchPerformanceComparison {

    // Linear Search - O(N)
    public static int linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    // Binary Search - O(log N)
    public static int binarySearch(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return -1;
    }

    // Generate a sorted dataset
    public static int[] generateDataset(int size) {

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = i + 1;
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] sizes = {1000, 10000, 1000000};

        System.out.println("Search Performance Comparison");
        System.out.println("------------------------------------------");

        for (int size : sizes) {

            int[] arr = generateDataset(size);

            int target = size;

            // Measure Linear Search execution time
            long start = System.nanoTime();

            int linearResult = linearSearch(arr, target);

            long end = System.nanoTime();

            double linearTime = (end - start) / 1_000_000.0;

            // Measure Binary Search execution time
            start = System.nanoTime();

            int binaryResult = binarySearch(arr, target);

            end = System.nanoTime();

            double binaryTime = (end - start) / 1_000_000.0;

            // Display results
            System.out.println("\nDataset Size: " + size);
            System.out.println("Linear Search Index: " + linearResult);
            System.out.println("Linear Search Time: " + linearTime + " ms");
            System.out.println("Binary Search Index: " + binaryResult);
            System.out.println("Binary Search Time: " + binaryTime + " ms");
        }
    }
}

