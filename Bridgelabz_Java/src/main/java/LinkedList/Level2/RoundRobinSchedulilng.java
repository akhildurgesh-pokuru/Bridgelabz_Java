/*
 * This program manages CPU processes using a circular linked list.
 * It supports adding, removing, and displaying processes in Round Robin scheduling.
 */

package LinkedList.Level2;

// Node class representing one process in the circular linked list
class RoundRobin {
    int process_id;
    int burst_time;
    int priority;

    // Points to the next process in the circular list
    RoundRobin next;

    // Constructor to initialize process details
    RoundRobin(int process_id, int burst_time, int priority) {
        this.process_id = process_id;
        this.burst_time = burst_time;
        this.priority = priority;

        // Initially, the next process is null
        this.next = null;
    }
}

// Class containing operations on the circular linked list
class RobinOperations {

    // Head points to the first process
    // Current is used to traverse the circular linked list
    RoundRobin head = null, current = null;

    // Adds a new process to the circular linked list
    public void addProcesses(int process_id, int burst_time, int priority) {

        // Create a new process node
        RoundRobin robin = new RoundRobin(process_id, burst_time, priority);

        // If the list is empty, make the new process the head
        if (head == null) {
            head = current = robin;

            // Point the node back to itself to maintain circular structure
            robin.next = head;
            return;
        }

        // Move current to the last process in the circular list
        while (current.next != head) {
            current = current.next;
        }

        // New process points back to the head
        robin.next = head;

        // Last process points to the new process
        current.next = robin;
    }

    // Adds a new process at the end of the circular linked list
    public void addAtEnd(int process_id, int burst_time, int priority) {

        // Create a new process node
        RoundRobin robin = new RoundRobin(process_id, burst_time, priority);

        // Start traversal from the head
        current = head;

        // If the list is empty, make the new node the head
        if (head == null) {
            head = current = robin;

            // Point the node back to itself
            robin.next = head;
            return;
        }

        // Find the last process in the circular list
        while (current.next != head) {
            current = current.next;
        }

        // Connect the new process back to the head
        robin.next = head;

        // Connect the last process to the new process
        current.next = robin;
    }

    // Removes a process using its process ID
    public void removeProcess(int process_id) {

        // If the list is empty, there is nothing to remove
        if (head == null) {
            return;
        }

        // Start checking from the head
        current = head;

        // Check if the process to remove is the head
        if (head.process_id == process_id) {

            // If there is only one process, make the list empty
            if (head.next == head) {
                head = null;
                current = null;
                return;
            }

            // Find the last process
            while (current.next != head) {
                current = current.next;
            }

            // Move head to the next process
            head = head.next;

            // Connect the last process to the new head
            current.next = head;
            return;
        }

        // Find the process before the process that needs to be removed
        while (current.next != head && current.next.process_id != process_id) {
            current = current.next;
        }

        // If the process is found, skip that node
        if (current.next.process_id == process_id) {
            current.next = current.next.next;
        }
    }

    // Displays all processes in the circular linked list
    public void displayProcesses() {

        // Start traversal from the head
        current = head;

        // Traverse until the last node
        while (current.next != head) {

            // Display process details
            System.out.println("Process id: " + current.process_id);
            System.out.println("Burst time: " + current.burst_time);
            System.out.println("Priority: " + current.priority);
            System.out.println();

            // Move to the next process
            current = current.next;
        }

        // Display the last process
        System.out.println("Process id: " + current.process_id);
        System.out.println("Burst time: " + current.burst_time);
        System.out.println("Priority: " + current.priority);
        System.out.println();
    }
}

// Main class for the Round Robin scheduling program
public class RoundRobinSchedulilng {

    public static void main(String[] args) {

        // Create an object to perform process operations
        RobinOperations operation = new RobinOperations();

        // Add processes to the circular linked list
        operation.addProcesses(32, 2, 1);
        operation.addProcesses(31, 5, 4);
        operation.addProcesses(41, 4, 2);
        operation.addProcesses(65, 7, 3);

        // Add another process at the end
        operation.addAtEnd(90, 8, 5);

        // Remove the process with ID 31
        operation.removeProcess(31);

        // Display all remaining processes
        operation.displayProcesses();
    }
}