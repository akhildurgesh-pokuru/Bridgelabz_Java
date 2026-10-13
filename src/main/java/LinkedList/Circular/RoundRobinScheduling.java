package LinkedList.Circular;

/*
This program simulates Round Robin CPU scheduling using a circular linked list.
It executes processes using a fixed time quantum and calculates average waiting and turnaround times.
*/

public class RoundRobinScheduling {

    static class Node {
        int pid, burst, remaining, priority;
        int waiting, turnaround;
        Node next;

        Node(int pid, int burst, int priority) {
            this.pid = pid;
            this.burst = burst;
            this.remaining = burst;
            this.priority = priority;
        }
    }

    Node head, tail;

    // Add a process to the end of the circular list.
    void addProcess(int pid, int burst, int priority) {
        Node n = new Node(pid, burst, priority);

        if (head == null) {
            head = tail = n;
            n.next = head;
        } else {
            tail.next = n;
            tail = n;
            tail.next = head;
        }
    }

    // Remove a completed process from the circular list.
    void removeProcess(int pid) {
        if (head == null)
            return;

        Node c = head;
        Node prev = tail;

        do {
            if (c.pid == pid) {
                if (c == head && c == tail) {
                    head = tail = null;
                } else {
                    prev.next = c.next;

                    if (c == head)
                        head = c.next;

                    if (c == tail)
                        tail = prev;
                }
                return;
            }

            prev = c;
            c = c.next;
        } while (c != head);
    }

    // Show the processes still waiting for CPU time.
    void display() {
        if (head == null) {
            System.out.println("No active processes");
            return;
        }

        Node c = head;

        do {
            System.out.println("PID: " + c.pid
                    + ", Remaining Burst: " + c.remaining);
            c = c.next;
        } while (c != head);
    }

    // Execute each process for at most one time quantum per turn.
    void schedule(int quantum) {
        if (quantum <= 0) {
            System.out.println("Quantum must be positive");
            return;
        }

        if (head == null) {
            System.out.println("No processes to schedule");
            return;
        }

        Node c = head;
        int time = 0;
        int completed = 0;
        int totalWaiting = 0;
        int totalTurnaround = 0;

        // Save the process count before completed nodes are removed.
        int processCount = 0;
        Node temp = head;

        do {
            processCount++;
            temp = temp.next;
        } while (temp != head);

        while (head != null) {
            // Execute for the quantum or until the process finishes.
            int run = Math.min(quantum, c.remaining);
            c.remaining -= run;
            time += run;

            System.out.println("\nAfter running PID " + c.pid
                    + " for " + run + " units:");
            display();

            if (c.remaining == 0) {
                // All processes arrive at time zero, so completion
                // time is also the turnaround time.
                c.turnaround = time;
                c.waiting = c.turnaround - c.burst;

                totalWaiting += c.waiting;
                totalTurnaround += c.turnaround;
                completed++;

                int finishedPid = c.pid;
                Node nextProcess = c.next;

                // Remove the finished process and continue safely.
                removeProcess(finishedPid);

                if (head != null)
                    c = nextProcess == head || nextProcess != null
                            ? nextProcess : head;
            } else {
                // Move to the next process for the next round.
                c = c.next;
            }
        }

        System.out.println("\nProcess Count: " + processCount);
        System.out.println("Average Waiting Time: "
                + (double) totalWaiting / completed);
        System.out.println("Average Turnaround Time: "
                + (double) totalTurnaround / completed);
    }

    public static void main(String[] args) {
        RoundRobinScheduling rr = new RoundRobinScheduling();

        rr.addProcess(1, 5, 2);
        rr.addProcess(2, 4, 1);
        rr.addProcess(3, 2, 3);

        rr.schedule(2);
    }
}