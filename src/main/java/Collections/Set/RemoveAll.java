
/*
 * This program finds the elements that are present in either of two sets, but not in both.
 * It uses HashSet and set operations to calculate the symmetric difference between the sets.
 */

package Collections.Set;

import java.util.HashSet;
import java.util.Set;

class difference {

    // Finds elements that appear in only one of the two sets.
    public void minus(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> diff1 = new HashSet<>(set1);
        diff1.removeAll(set2);

        Set<Integer> diff2 = new HashSet<>(set2);
        diff2.removeAll(set1);

        // Combines both differences into a single set.
        diff1.addAll(diff2);

        // Prints the elements that are unique to either set.
        System.out.println(diff1);
    }
}

public class RemoveAll {
    public static void main(String[] args) {

        // Creates the first set and adds three integers.
        Set<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);

        // Creates the second set with one common element and two different elements.
        Set<Integer> set2 = new HashSet<>();
        set2.add(30);
        set2.add(40);
        set2.add(50);

        // Calls the method to find the symmetric difference of both sets.
        difference obj = new difference();
        obj.minus(set1, set2);
    }
}
