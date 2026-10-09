/*
 * Problem: Given an array and a target value, find two elements whose sum equals the target.
 * Approach: Use a HashMap to store previously seen elements and quickly find the required value.
 */

package HashMap;

import java.util.HashMap;

public class TwoSum1 {
    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 13;

        // Key = array value, Value = index where that value was found
        HashMap<Integer, Integer> map = new HashMap<>();

        // Check each element one by one
        for (int i = 0; i < arr.length; i++) {

            // Find the number needed to reach the target
            int value = target - arr[i];

            // Check whether the required number was already seen
            if (map.containsKey(value)) {

                // We found two numbers whose sum is equal to the target
                System.out.println("Two values are: " + arr[i] + " and " + value);
                return;

            } else {

                // Store the current number and its index for future checking
                map.put(arr[i], i);
            }
        }
    }
}