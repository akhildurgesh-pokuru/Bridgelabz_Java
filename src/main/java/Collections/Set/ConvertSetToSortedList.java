
/*
 * This program converts a Set of integers into a sorted List.
 * It uses a TreeSet to arrange the elements in ascending order before creating the List.
 */

package Collections.Set;

import java.util.*;

public class ConvertSetToSortedList {
    public static void main(String[] args) {

        // Creates a HashSet and adds integer values to it.
        Set<Integer> set = new HashSet<>();
        set.add(20);
        set.add(10);
        set.add(50);
        set.add(30);

        // Sorts the Set elements using TreeSet and stores them in an ArrayList.
        List<Integer> list = new ArrayList<>(new TreeSet<>(set));

        // Prints the sorted list.
        System.out.println(list);
    }
}
