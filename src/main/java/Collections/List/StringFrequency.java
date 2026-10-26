
/*
 * This program counts how many times each string appears in an array.
 * It uses a HashMap to store each string along with its frequency.
 */

package Collections.List;

import java.util.HashMap;
import java.util.Map;

class frequency {

    // Counts the occurrences of each string and stores the results in a map.
    public Map<String, Integer> stringFrequency(String[] arr, Map<String, Integer> freq_map) {
        for (String fruit : arr) {

            // Increases the existing count by one, or starts the count at one.
            freq_map.put(fruit, freq_map.getOrDefault(fruit, 0) + 1);
        }
        return freq_map;
    }
}

public class StringFrequency {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "apple", "cherry", "cherry"};

        // Creates an empty map to store each string and its frequency.
        Map<String, Integer> freq_map = new HashMap<>();

        // Creates the frequency object and calculates the counts.
        frequency freq = new frequency();
        freq_map = freq.stringFrequency(arr, freq_map);

        // Prints each string and its total occurrence count.
        System.out.println(freq_map);
    }
}
