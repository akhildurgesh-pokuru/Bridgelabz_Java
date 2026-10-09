/*
 * Problem: Find all subarrays whose elements have a sum of zero.
 * Approach: Use prefix sum and HashMap to find zero-sum subarrays efficiently.
 */

package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SubarraywithZero {
    public static void main(String[] args) {

        int[] arr = {1, -1, 2, -2};

        // Key = prefix sum, Value = indexes where that sum appeared
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        // We consider index -1 as the position before the array starts
        map.put(0, new ArrayList<>(Arrays.asList(-1)));

        int sum = 0;

        // Go through the array and calculate the prefix sum
        for (int i = 0; i < arr.length; i++) {

            // Add the current element to our running sum
            sum = sum + arr[i];

            // If the same sum appeared before, the elements between them add to zero
            if (map.containsKey(sum)) {

                // There can be multiple previous positions with the same sum
                for (int start : map.get(sum)) {

                    // Print the starting and ending indexes of the zero-sum subarray
                    System.out.println("Sub array: " + (start + 1) + " to " + i);
                }
            }

            // If this sum is new, create an empty list for it
            map.putIfAbsent(sum, new ArrayList<>());

            // Remember the current index for this prefix sum
            map.get(sum).add(i);
        }
    }
}