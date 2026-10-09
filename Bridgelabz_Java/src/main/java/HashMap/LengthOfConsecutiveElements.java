/*
 * Problem: Given an unsorted array, find the length of the longest consecutive elements sequence.
 * Approach: Store all elements in a HashMap and check consecutive numbers efficiently.
 */

package HashMap;

import java.util.HashMap;

public class LengthOfConsecutiveElements {
    public static void main(String[] args) {

        int[] arr = {100, 4, 200, 1, 3, 2};

        // Store every array element in the HashMap
        // Key = array element, Value = 1 just to mark that the element exists
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], 1);
        }

        int longest = 0;

        // Check every number in the array
        for (int num : arr) {

            // If num - 1 does not exist, this number can be the starting point
            // of a consecutive sequence
            if (!map.containsKey(num - 1)) {

                int current = num;
                int count = 1;

                // Keep checking whether the next consecutive number exists
                while (map.containsKey(current + 1)) {
                    count++;
                    current++;
                }

                // Keep the largest sequence length found so far
                longest = Math.max(longest, count);
            }
        }

        // Print the length of the longest consecutive sequence
        System.out.println("Max Count: " + longest);
    }
}