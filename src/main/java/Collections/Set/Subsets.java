
/*
 * This program checks whether one set is a subset of another set.
 * It uses containsAll() to verify that every element of the smaller set exists in the larger set.
 */

package Collections.Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Subsets {
    public static void main(String[] args) {

        // Creates the main set and the set whose elements need to be checked.
        Set<Integer> set = new HashSet<>(Arrays.asList(10, 20, 30, 40, 50));
        Set<Integer> set1 = new HashSet<>(Arrays.asList(20, 30));

        // Checks whether all elements of set1 are present in set.
        if (set.containsAll(set1)) {
            System.out.println("It is a sub set");
        } else {
            System.out.println("It is not a sub set");
        }

    }
}
