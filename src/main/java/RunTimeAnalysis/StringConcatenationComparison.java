package java.RunTimeAnalysis;


/*
 * This program compares String, StringBuilder, and StringBuffer concatenation.
 * It measures execution time for different numbers of concatenation operations.
 */

public class StringConcatenationComparison {

    // String concatenation - creates a new String object each time
    public static String stringConcatenation(int n) {

        String str = "";

        for (int i = 0; i < n; i++) {
            str += "A";
        }

        return str;
    }

    // StringBuilder concatenation - mutable and faster
    public static String stringBuilderConcatenation(int n) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append("A");
        }

        return sb.toString();
    }

    // StringBuffer concatenation - synchronized and thread-safe
    public static String stringBufferConcatenation(int n) {

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < n; i++) {
            sb.append("A");
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        int[] sizes = {1000, 10000, 1000000};

        for (int size : sizes) {

            System.out.println("\nOperations: " + size);

            // String concatenation is skipped for large datasets
            if (size <= 10000) {

                long start = System.nanoTime();

                String result1 = stringConcatenation(size);

                long end = System.nanoTime();

                System.out.println("String Time: " +
                        (end - start) / 1_000_000.0 + " ms");
            }
            else {
                System.out.println("String Time: Skipped (too expensive)");
            }

            // Measure StringBuilder
            long start = System.nanoTime();

            String result2 = stringBuilderConcatenation(size);

            long end = System.nanoTime();

            System.out.println("StringBuilder Time: " +
                    (end - start) / 1_000_000.0 + " ms");

            // Measure StringBuffer
            start = System.nanoTime();

            String result3 = stringBufferConcatenation(size);

            end = System.nanoTime();

            System.out.println("StringBuffer Time: " +
                    (end - start) / 1_000_000.0 + " ms");
        }
    }
}

