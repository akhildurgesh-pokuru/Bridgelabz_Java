package java.RunTimeAnalysis;


/*
 * This program compares recursive and iterative Fibonacci calculations.
 * It measures execution time to demonstrate the difference in time complexity.
 */

public class FibonacciPerformanceComparison {

    // Recursive Fibonacci - O(2^N)
    public static long fibonacciRecursive(int n) {

        // Base condition
        if (n <= 1) {
            return n;
        }

        // Recursive calls
        return fibonacciRecursive(n - 1) +
                fibonacciRecursive(n - 2);
    }

    // Iterative Fibonacci - O(N)
    public static long fibonacciIterative(int n) {

        if (n <= 1) {
            return n;
        }

        long a = 0;
        long b = 1;
        long sum = 0;

        // Calculate Fibonacci using a loop
        for (int i = 2; i <= n; i++) {

            sum = a + b;

            a = b;
            b = sum;
        }

        return b;
    }

    public static void main(String[] args) {

        int[] values = {10, 30, 40, 50};

        for (int n : values) {

            System.out.println("\nFibonacci Number: " + n);

            // Recursive approach is skipped for large inputs
            if (n <= 40) {

                long start = System.nanoTime();

                long recursiveResult = fibonacciRecursive(n);

                long end = System.nanoTime();

                System.out.println("Recursive Result: " + recursiveResult);

                System.out.println("Recursive Time: " +
                        (end - start) / 1_000_000.0 + " ms");
            }
            else {
                System.out.println("Recursive: Skipped (too expensive)");
            }

            // Measure iterative approach
            long start = System.nanoTime();

            long iterativeResult = fibonacciIterative(n);

            long end = System.nanoTime();

            System.out.println("Iterative Result: " + iterativeResult);

            System.out.println("Iterative Time: " +
                    (end - start) / 1_000_000.0 + " ms");
        }
    }
}

