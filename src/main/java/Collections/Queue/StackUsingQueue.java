
/*
 * This program implements stack operations using two queues.
 * It demonstrates push, pop, and peek while following the Last-In, First-Out (LIFO) principle.
 */

package Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;

class Operations {
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    // Adds an element so that the newest element stays at the front of queue1.
    public void push(int value) {
        queue2.add(value);

        // Moves existing elements behind the newly added value.
        while (!queue1.isEmpty()) {
            queue2.add(queue1.poll());
        }

        // Transfers all elements back to queue1 in stack order.
        while (!queue2.isEmpty()) {
            queue1.add(queue2.poll());
        }
    }

    // Removes and prints the top element of the stack.
    public void pop() {
        System.out.println("popped Value: " + queue1.poll());
    }

    // Displays the top element without removing it.
    public void peek() {
        System.out.println(queue1.peek());
    }
}

public class StackUsingQueue {
    public static void main(String[] args) {
        // Creates an object to perform stack operations.
        Operations operation = new Operations();

        // Pushes four elements onto the stack.
        operation.push(10);
        operation.push(20);
        operation.push(30);
        operation.push(40);

        // Displays the top element, removes it, and displays the new top.
        operation.peek();
        operation.pop();
        operation.peek();
    }
}
