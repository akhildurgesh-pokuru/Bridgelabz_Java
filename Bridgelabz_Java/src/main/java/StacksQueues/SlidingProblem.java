/*
 * Problem: Find the maximum element in every window of size k.
 * Approach: Use a Deque to keep useful indexes so the maximum can be found quickly.
 */

package StacksQueues;

import java.util.Deque;
import java.util.LinkedList;

class SlidingWindowMaximum {

    // Finds and prints the maximum value from every window
    static void findMaximum(int[] arr, int k) {

        // Stores indexes of elements that can be maximum
        Deque<Integer> deque = new LinkedList<>();

        // Move the window from left to right
        for (int i = 0; i < arr.length; i++) {

            // Remove indexes that are outside the current window
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // Remove smaller elements from the back
            // They cannot become maximum while the current element is present
            while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) {
                deque.pollLast();
            }

            // Add the current element's index
            deque.addLast(i);

            // Once the first complete window is formed, print its maximum
            if (i >= k - 1) {
                System.out.print(arr[deque.peekFirst()] + " ");
            }
        }
    }


    public static void main(String[] args) {

        // Given array
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};

        // Size of each window
        int k = 3;

        // Find maximum element from every window
        findMaximum(arr, k);
    }
}