
/*
 * This program demonstrates a fixed-size buffer that stores integer values.
 * When the buffer is full, it shifts the existing values to make room for a new value.
 */

package Collections.Queue;

// Stores and manages integer values in a fixed-size array.
class circularArray {
    int[] queue = new int[3];
    int front = -1, rear = -1;

    // Adds a value to the buffer, shifting elements when it is full.
    public void push(int value) {
        if (front == -1) {
            front++;
            rear++;
            queue[rear] = value;
        }

        if (rear != 2) {
            rear++;
            queue[rear] = value;
        } else {
            // Shifts elements left to make room for the new value.
            int temp = front;
            while (temp != rear) {
                queue[temp] = queue[temp + 1];
                temp++;
            }
            queue[temp] = value;
        }
    }

    // Prints all values currently stored in the array.
    public void display() {
        for (int j : queue) {
            System.out.print(" " + j);
        }
    }
}

public class CircularBuffer {
    public static void main(String[] args) {
        // Creates a buffer and adds five values to it.
        circularArray array = new circularArray();
        array.push(10);
        array.push(20);
        array.push(30);
        array.push(40);
        array.push(50);

        // Displays the final contents of the buffer.
        array.display();
    }
}
