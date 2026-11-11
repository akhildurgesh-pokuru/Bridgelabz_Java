package java.RunTimeAnalysis;


/*
 * This program compares searching performance using Array, HashSet, and TreeSet.
 * It measures execution time for different dataset sizes using System.nanoTime().
 */

import java.util.HashSet;
import java.util.TreeSet;

public class DataStructureSearchComparison {

    // Linear Search in Array - O(N)
    public static boolean arraySearch(int[] arr, int target) {

        for (int num : arr) {

            if (num == target) {
                return true;
            }
        }

        return false;
    }

    // Search in HashSet - O(1) average
    public static boolean hashSetSearch(HashSet<Integer> set, int target) {
        return set.contains(target);
    }

    // Search in TreeSet - O(log N)
    public static boolean treeSetSearch(TreeSet<Integer> set, int target) {
        return set.contains(target);
    }

    // Generate dataset and populate data structures
    public static int[] generateArray(int size) {

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = i + 1;
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] sizes = {1000, 100000, 1000000};

        // Number of search operations
        int repetitions = 100;

        for (int size : sizes) {

            System.out.println("\nDataset Size: " + size);

            // Generate array
            int[] arr = generateArray(size);

            // Create HashSet and TreeSet
            HashSet<Integer> hashSet = new HashSet<>();
            TreeSet<Integer> treeSet = new TreeSet<>();

            // Insert array elements into both data structures
            for (int num : arr) {

                hashSet.add(num);
                treeSet.add(num);
            }

            // Search for the last element
            int target = size;

            int count = 0;

            // Measure Array Search
            long start = System.nanoTime();

            for (int i = 0; i < repetitions; i++) {

                if (arraySearch(arr, target)) {
                    count++;
                }
            }

            long end = System.nanoTime();

            System.out.println("Array Search: " +
                    (end - start) / 1_000_000.0 + " ms");

            // Measure HashSet Search
            start = System.nanoTime();

            for (int i = 0; i < repetitions; i++) {

                if (hashSetSearch(hashSet, target)) {
                    count++;
                }
            }

            end = System.nanoTime();

            System.out.println("HashSet Search: " +
                    (end - start) / 1_000_000.0 + " ms");

            // Measure TreeSet Search
            start = System.nanoTime();

            for (int i = 0; i < repetitions; i++) {

                if (treeSetSearch(treeSet, target)) {
                    count++;
                }
            }

            end = System.nanoTime();

            System.out.println("TreeSet Search: " +
                    (end - start) / 1_000_000.0 + " ms");

            System.out.println("Successful Searches: " + count);
        }
    }
}

