
/*
 * This program performs union and intersection operations on two sets of integers.
 * It uses HashSet methods to combine elements and find common elements between the sets.
 */

package Collections.Set;

import java.util.HashSet;
import java.util.Set;

class Operations {

    // Combines the elements of both sets without storing duplicates.
    public void union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> union = new HashSet<>(set2);
        union.addAll(set1);

        System.out.println(union);
    }

    // Keeps only the elements that are present in both sets.
    public void intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection);
    }
}

public class UnionIntersection {
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

        // Calls the methods to display the union and intersection of both sets.
        Operations operations = new Operations();
        operations.union(set1, set2);
        operations.intersection(set1, set2);
    }
}
