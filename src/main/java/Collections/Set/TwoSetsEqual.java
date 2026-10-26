
/*
 * This program checks whether two sets contain the same elements.
 * It compares the elements of both sets without considering their order.
 */

package Collections.Set;

import java.util.HashSet;
import java.util.Set;

class check {

    // Checks whether every element of the first set exists in the second set.
    public void checkSets(Set<Integer> set, Set<Integer> set1) {
        boolean result = true;

        for (Integer i : set) {
            if (!set1.contains(i)) {
                result = false;
                break;
            }
        }

        // Displays the result based on whether all elements were found.
        if (result) {
            System.out.println("Sets are equal");
        } else {
            System.out.println("Sets are not equal");
        }
    }
}

public class TwoSetsEqual {
    public static void main(String[] args) {

        // Creates the first set and adds three integers.
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        // Creates the second set with the same elements in a different order.
        Set<Integer> set1 = new HashSet<>();
        set1.add(3);
        set1.add(2);
        set1.add(1);

        // Calls the method to compare the two sets.
        check obj = new check();
        obj.checkSets(set, set1);
    }
}
