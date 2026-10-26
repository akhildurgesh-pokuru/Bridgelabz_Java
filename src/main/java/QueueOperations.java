
/*
 * This program demonstrates queue operations using Java's Deque interface.
 * It performs insertion, removal, and element-access operations before printing the remaining elements.
 */

import java.util.*;

public class QueueOperations {
    public static void main(String[] args) {
        // Create a deque using LinkedList and insert elements at the end.
        Deque<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(0);
        queue.add(30);
        queue.offer(5);
        queue.offer(14);

        // Remove the first element and access the front element.
        queue.poll();
        queue.peek();

        queue.remove();
        //queue.clear();

        queue.remove();
        queue.element();

        // Insert elements at the beginning of the deque.
        queue.addFirst(10);

        queue.addFirst(100);

        // Iterate through the deque and print the remaining elements.
        Iterator<Integer> it = queue.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
