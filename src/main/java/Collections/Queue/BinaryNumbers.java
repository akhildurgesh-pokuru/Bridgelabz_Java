
/*
 * This program generates binary representations for numbers from 1 to the given number.
 * It stores the generated strings in a Queue and prints the collection.
 */

package Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();

        // Reads the maximum number from the user.
        System.out.println("Enter the number");
        int num = sc.nextInt();

        String result = "";
        int i = 1;

        // Generates a binary representation for each number from 1 to num.
        while (i <= num) {
            result = "";
            int temp = i;

            // Converts the number to binary by repeatedly dividing it by 2.
            while (temp != 0) {
                int n = temp % 2;
                result = result.concat(String.valueOf(n));
                temp = temp / 2;
            }

            // Adds the generated binary string to the queue.
            queue.offer(result);
            i++;
        }

        // Displays all the generated binary strings.
        System.out.println(queue);
    }
}
