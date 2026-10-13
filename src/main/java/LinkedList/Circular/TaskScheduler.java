package LinkedList.Circular;

/*
This program manages tasks using a circular linked list.
It supports insertion, deletion, priority searching, displaying tasks, and moving to the next task.
*/

public class TaskScheduler {

    // Each node stores task details and points to the next task.
    static class Node {
        int id, priority;
        String name, dueDate;
        Node next;

        // Initialize the details of a new task.
        Node(int id, String name, int priority, String dueDate) {
            this.id = id;
            this.name = name;
            this.priority = priority;
            this.dueDate = dueDate;
        }
    }

    // Head points to the first task, and current tracks the active task.
    Node head, current;

    // Add a task at the specified position.
    void add(int id, String name, int priority, String dueDate, int pos) {
        if (pos < 1) {
            System.out.println("Invalid position");
            return;
        }

        Node n = new Node(id, name, priority, dueDate);

        // Create a circular link when inserting the first task.
        if (head == null) {
            if (pos != 1) {
                System.out.println("Invalid position");
                return;
            }

            head = current = n;
            n.next = n;
            return;
        }

        // Insert the new task at the beginning.
        if (pos == 1) {
            Node tail = head;

            // Find the last task in the circular list.
            while (tail.next != head)
                tail = tail.next;

            n.next = head;
            tail.next = n;
            head = n;
            return;
        }

        // Find the node before the required position.
        Node c = head;
        int i = 1;

        while (i < pos - 1 && c.next != head) {
            c = c.next;
            i++;
        }

        if (i != pos - 1) {
            System.out.println("Invalid position");
            return;
        }

        // Insert the task without breaking the circular connection.
        n.next = c.next;
        c.next = n;
    }

    // Remove a task using its ID.
    void remove(int id) {
        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        Node c = head;
        Node prev = head;

        // Search the circular list until the task is found.
        do {
            if (c.id == id) {

                // Handle the case where only one task exists.
                if (c.next == c) {
                    head = current = null;
                    return;
                }

                // Find the node immediately before the task.
                while (prev.next != c)
                    prev = prev.next;

                // Bypass the node being deleted.
                prev.next = c.next;

                // Update head and current if necessary.
                if (c == head)
                    head = c.next;

                if (c == current)
                    current = c.next;

                System.out.println("Task removed");
                return;
            }

            c = c.next;
        } while (c != head);

        System.out.println("Task not found");
    }

    // Display the details of one task.
    void show(Node n) {
        System.out.println("ID: " + n.id
                + ", Name: " + n.name
                + ", Priority: " + n.priority
                + ", Due Date: " + n.dueDate);
    }

    // Display the currently selected task.
    void viewCurrent() {
        if (current == null) {
            System.out.println("No tasks available");
            return;
        }

        show(current);
    }

    // Move the current pointer to the next task.
    void moveNext() {
        if (current != null)
            current = current.next;

        viewCurrent();
    }

    // Display every task exactly once.
    void display() {
        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        Node c = head;

        // Stop when traversal returns to the head.
        do {
            show(c);
            c = c.next;
        } while (c != head);
    }

    // Find all tasks having the requested priority.
    void searchPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        Node c = head;
        boolean found = false;

        do {
            if (c.priority == priority) {
                show(c);
                found = true;
            }

            c = c.next;
        } while (c != head);

        if (!found)
            System.out.println("No tasks found with this priority");
    }

    public static void main(String[] args) {
        TaskScheduler t = new TaskScheduler();

        // Add sample tasks at different positions.
        t.add(1, "Complete Assignment", 1, "2026-10-15", 1);
        t.add(2, "Study Java", 2, "2026-10-16", 2);
        t.add(3, "Submit Project", 1, "2026-10-17", 3);

        System.out.println("All Tasks:");
        t.display();

        System.out.println("Current Task:");
        t.viewCurrent();

        System.out.println("Next Task:");
        t.moveNext();

        System.out.println("High Priority Tasks:");
        t.searchPriority(1);

        // Remove a task and display the updated list.
        t.remove(2);

        System.out.println("Tasks After Removal:");
        t.display();
    }
}