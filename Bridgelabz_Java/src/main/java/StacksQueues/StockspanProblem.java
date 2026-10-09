/*
 * Problem: Find the stock span for each day's stock price.
 * Approach: Use a stack to store indexes of previous greater stock prices.
 */

package StacksQueues;

import java.util.Stack;

class StockspanProblem {

    public static void main(String[] args) {

        // Stock prices for each day
        int[] days = {100, 80, 60, 70, 60, 75, 85};

        // Stack stores the indexes of useful previous days
        Stack<Integer> stack = new Stack<>();

        // Check each day's stock price
        for (int i = 0; i < days.length; i++) {

            // For the first day, the span is always 1
            if (i == 0) {
                stack.push(i);

                System.out.println(
                        "Span of " + days[i] + " is: " + (i + 1)
                );

                continue;
            }

            // Remove previous days whose prices are smaller
            // because they are included in today's span
            while (!stack.isEmpty() && days[i] >= days[stack.peek()]) {
                stack.pop();
            }

            // If stack is empty, all previous days have smaller prices
            // so the span includes all previous days and today
            int span;

            if (stack.isEmpty()) {
                span = i + 1;
            } else {
                // The nearest greater price stops the span
                span = i - stack.peek();
            }

            // Store today's index for future days
            stack.push(i);

            // Print today's span
            System.out.println(
                    "Span of " + days[i] + " is: " + span
            );
        }
    }
}