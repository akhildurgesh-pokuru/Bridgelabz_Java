
/*
 * This program finds the fruit with the highest value in a HashMap.
 * It checks the stored values and prints the corresponding fruit name and highest value.
 */

package Collections.Map;

import java.util.HashMap;
import java.util.Set;

public class KeyWithHighestValue {
    public static void main(String[] args) {

        // Stores fruit names as keys and their values as numbers.
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("mango", 10);
        map.put("orange", 5);

        // Finds the highest value among all the fruits.
        int highest = Integer.MIN_VALUE;
        for (int value : map.values()) {
            highest = Math.max(value, highest);
        }

        // Finds and prints the fruit associated with the highest value.
        for (String fruit : map.keySet()) {
            if (map.get(fruit) == highest) {
                System.out.println(fruit + " " + highest);
                break;
            }
        }
    }
}
