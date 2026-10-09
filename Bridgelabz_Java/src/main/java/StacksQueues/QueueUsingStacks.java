/*
 * Problem: Implement a Queue using two stacks.
 * Approach: Use one stack for enqueue and another temporarily during dequeue to follow FIFO order.
 */

package StacksQueues;

class Operations {

    int[] enque_stack;
    int[] deque_stack;

    int top1 = -1;
    int top2 = -1;

    // Create two stacks with the given sizes
    Operations(int size1, int size2) {
        enque_stack = new int[size1];
        deque_stack = new int[size2];
    }


    // Adds an element to the queue
    public void enqueueOperation(int value) {

        // Check if the first stack is full
        if (top1 == enque_stack.length - 1) {
            System.out.println("Overflow");
            return;
        }

        // Move top to the next position
        top1++;

        // Store the new value
        enque_stack[top1] = value;
    }


    // Removes the first element added to the queue
    public int dequeueOperation() {

        // Check if the queue is empty
        if (top1 == -1) {
            System.out.println("Stack is underFlow");
            return -1;
        }

        // Move all elements from the first stack to the second stack
        // This puts the oldest element at the top of the second stack
        while (top1 != -1) {
            top2++;

            deque_stack[top2] = enque_stack[top1];

            top1--;
        }

        // The top element is the first element that entered the queue
        int value = deque_stack[top2];

        // Remove that element from the second stack
        top2--;

        // Move the remaining elements back to the first stack
        while (top2 != -1) {
            top1++;

            deque_stack[top2] = deque_stack[top2];
            enque_stack[top1] = deque_stack[top2];

            top2--;
        }

        // Return the removed value
        return value;
    }


    // Returns the most recently added element
    public int peek() {
        return enque_stack[top1];
    }
}


class QueueUsingStacks {

    public static void main(String[] args) {

        // Create two stacks with capacity 5
        Operations operation = new Operations(5, 5);

        // Add elements to the queue
        operation.enqueueOperation(10);
        operation.enqueueOperation(20);
        operation.enqueueOperation(30);

        // Show the element currently at the top
        System.out.println(operation.peek());

        // Remove the first element from the queue
        System.out.println("Popped element: " + operation.dequeueOperation());

        // Show the element after removing 10
        System.out.println(operation.peek());
    }
}