package StacksQueues;

class CircularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;

    // Initialize the queue
    public CircularQueue(int size) {
        this.capacity = size;
        this.queue = new int[size];
        this.front = -1;
        this.rear = -1;
    }

    // Check if the queue is full
    public boolean isFull() {
        return (rear + 1) % capacity == front;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == -1;
    }

    // Insert an element
    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("Queue is Full! Cannot insert " + value);
            return;
        }

        // If inserting the very first element
        if (isEmpty()) {
            front = 0;
        }

        // Circular increment formula points rear to 0 when it hits capacity
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        System.out.println("Inserted: " + value + " (Rear is now at index: " + rear + ")");
    }

    // Remove an element
    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty! Cannot dequeue.");
            return -1;
        }

        int element = queue[front];

        // If the queue has only one element left, reset the queue
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            // Circular increment formula for front pointer as well
            front = (front + 1) % capacity;
        }
        return element;
    }

    public static void main(String[] args) {
        // Create a circular queue of size 3
        CircularQueue cq = new CircularQueue(3);

        // Fill up the queue
        cq.enQueue(10);
        cq.enQueue(20);
        cq.enQueue(30);

        // Remove one element to free up index 0 (after wrapping)
        System.out.println("Dequeued: " + cq.deQueue());

        // This insertion triggers the wrap-around formula!
        // rear was at 2, (2 + 1) % 3 = 0. New element goes to index 0.
        cq.enQueue(40);
    }
}

