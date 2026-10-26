
/*
 * This program merges two HashMaps containing fruit names and their values.
 * If a fruit exists in both maps, its values are added together in the result map.
 */

package Collections.Map;

import java.util.HashMap;

public class MergeTwoHashMaps {
    public static void main(String[] args) {

        // Creates two maps to store fruit names and their values.
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        map1.put("mango", 10);
        map1.put("banana", 5);

        map2.put("guava", 7);
        map2.put("banana", 10);

        // Creates a map to store the combined results.
        HashMap<String, Integer> result = new HashMap<>();

        // Adds all entries from the first map to the result.
        for (String fruit : map1.keySet()) {
            result.put(fruit, result.getOrDefault(fruit, 0) + map1.get(fruit));
        }

        // Adds entries from the second map, combining values for duplicate keys.
        for (String fruit : map2.keySet()) {
            result.put(fruit, result.getOrDefault(fruit, 0) + map2.get(fruit));
        }

        // Displays the merged map.
        System.out.println(result);
    }
}
