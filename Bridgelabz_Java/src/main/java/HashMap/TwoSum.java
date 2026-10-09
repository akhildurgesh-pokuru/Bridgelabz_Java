/*
 * Problem: Given an array and a target value, find two elements whose sum equals the target.
 * Approach: Use a HashMap to remember previous elements and quickly find the required value.
 */

package HashMap;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 13;

        // Key = array value, Value = index where that value was found
        HashMap<Integer, Integer> map = new HashMap<>();

        // Check each element one by one
        for (int i = 0; i < arr.length; i++) {

            // Find the value we need to reach the target
            int value = target - arr[i];

            // If this required value was already seen, we found our pair
            if (map.containsKey(value)) {

                // Print the two values whose sum is equal to the target
                System.out.println("Two values are: " + arr[i] + " and " + value);
                return;

            } else {

                // Remember the current value and its index for future elements
                map.put(arr[i], i);
            }
        }
    }
}