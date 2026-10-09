/*
 * Problem: Sort all elements of a stack using recursion without using another stack.
 * Approach: Remove elements recursively and insert each element back into its correct position.
 */

package StacksQueues;

import java.util.Stack;

class sortingOperation {

    // Sorts the stack using recursion
    public void sort(Stack<Integer> stack) {

        // If the stack is empty, there is nothing to sort
        if (stack.empty()) {
            return;
        }

        // Remove the top element temporarily
        int temp = stack.pop();

        // Sort the remaining elements first
        sort(stack);

        // Put the removed element back in its correct position
        insertStack(stack, temp);
    }


    // Inserts an element into its correct position in the sorted stack
    public void insertStack(Stack<Integer> stack, int temp) {

        // If the stack is empty or the top element is smaller,
        // place the current element here
        if (stack.empty() || stack.peek() <= temp) {
            stack.push(temp);
            return;
        }

        // Remove the top element temporarily
        int temp1 = stack.pop();

        // Try to find the correct position for temp
        insertStack(stack, temp);

        // Put the removed element back
        stack.push(temp1);
    }
}


public class SortUsingRecursion {

    public static void main(String[] args) {

        // Create a stack and add some values
        Stack<Integer> stack = new Stack<>();

        stack.push(3);
        stack.push(5);
        stack.push(1);
        stack.push(2);

        // Create object for sorting operations
        sortingOperation obj = new sortingOperation();

        // Sort the stack using recursion
        obj.sort(stack);

        // Display the sorted stack
        System.out.println(stack);
    }
}