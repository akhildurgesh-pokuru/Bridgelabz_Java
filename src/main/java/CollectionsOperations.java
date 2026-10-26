
/*
 * This program demonstrates basic Java Collections operations.
 * It uses Collections.swap() to exchange two elements in a list.
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsOperations {
    public void main(String[] args) {
        // Create a collection and add integer values.
        Collection<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);

        // Create a list and add elements to it.
        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(10);
        numbers1.add(24);
        numbers1.add(11);
        //Collections.shuffle(numbers1);

        // Swap the elements at index 0 and index 2.
        Collections.swap(numbers1, 0, 2);
        System.out.println(numbers1);

    }
}
