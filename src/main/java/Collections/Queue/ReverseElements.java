
/*
 * This program reverses the order of elements in a queue using a stack.
 * It demonstrates how a stack's Last-In, First-Out (LIFO) behavior reverses queue elements.
 */

package Collections.Queue;

import java.util.*;

public class ReverseElements {
    public static void main(String[] args) {

        // Creates a queue containing three integers and an empty stack.
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(10, 20, 30));
        Stack<Integer> stack = new Stack<>();

        // Removes elements from the queue and pushes them onto the stack.
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        // Pops elements from the stack and adds them back to the queue in reverse order.
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        // Prints the reversed queue.
        System.out.println(queue);
    }
}
