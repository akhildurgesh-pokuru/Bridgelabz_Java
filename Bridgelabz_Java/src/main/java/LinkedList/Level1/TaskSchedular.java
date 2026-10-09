/*
 * Problem: Create a Task Scheduler using a circular singly linked list.
 * Operations: Add tasks, remove tasks, view tasks and search tasks by priority.
 */

package LinkedList;

class Task {
    int task_id;
    String task_name;
    int priority;
    String due_date;
    Task next;

    Task(int task_id, String task_name, int priority, String due_date) {
        this.task_id = task_id;
        this.task_name = task_name;
        this.priority = priority;
        this.due_date = due_date;
        this.next = null;
    }
}

class taskOperations {
    Task head = null;

    public void addAtBeginning(int task_id, String task_name, int priority, String due_date) {

        Task task = new Task(task_id, task_name, priority, due_date);

        // If the list is empty, the new task points back to itself
        if (head == null) {
            head = task;
            task.next = head;
        } else {

            // Find the last task because it should point to the new head
            Task current = head;

            while (current.next != head) {
                current = current.next;
            }

            // Put the new task before the current head
            task.next = head;
            current.next = task;
            head = task;
        }
    }

    public void addAtEnd(int task_id, String task_name, int priority, String due_date) {

        Task task = new Task(task_id, task_name, priority, due_date);

        // If the list is empty, the new task becomes the head
        if (head == null) {
            head = task;
            task.next = head;
            return;
        }

        Task current = head;

        // Move until we reach the last task
        while (current.next != head) {
            current = current.next;
        }

        // Add the new task at the end
        current.next = task;
        task.next = head;
    }

    public void addAtPosition(int task_id, String task_name, int priority, String due_date, int pos) {

        Task task = new Task(task_id, task_name, priority, due_date);

        // Position 1 means adding the task at the beginning
        if (pos == 1) {
            addAtBeginning(task_id, task_name, priority, due_date);
            return;
        }

        if (head == null) {
            return;
        }

        Task current = head;

        // Move to the task just before the required position
        for (int i = 1; i < pos - 1; i++) {
            current = current.next;

            // We came back to head, so the position does not exist
            if (current == head) {
                return;
            }
        }

        // Connect the new task into the list
        task.next = current.next;
        current.next = task;
    }

    public void removeTask(int task_id) {

        // Nothing to remove if the list is empty
        if (head == null) {
            return;
        }

        Task current = head;
        Task previous = null;

        // Search for the task while keeping track of the previous task
        do {
            if (current.task_id == task_id) {
                break;
            }

            previous = current;
            current = current.next;

        } while (current != head);

        // Task was not found
        if (current.task_id != task_id) {
            return;
        }

        // If there is only one task in the circular list
        if (current == head && current.next == head) {
            head = null;
            return;
        }

        // If we are removing the first task
        if (current == head) {

            // Find the last task
            Task tail = head;

            while (tail.next != head) {
                tail = tail.next;
            }

            // Move head to the next task
            head = head.next;

            // Last task should now point to the new head
            tail.next = head;

        } else {

            // Skip the task that needs to be removed
            previous.next = current.next;
        }
    }

    public void viewCurrentTask(String task_name) {

        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        Task current = head;

        // Search the circular list for the required task name
        do {
            if (current.task_name.equals(task_name)) {

                System.out.println("Task id: " + current.task_id);
                System.out.println("Task Name: " + current.task_name);
                System.out.println("Priority: " + current.priority);
                System.out.println("Due Date: " + current.due_date);
                System.out.println();

                return;
            }

            current = current.next;

        } while (current != head);

        // We came back to head without finding the task
        System.out.println("Task not found");
    }

    public void viewTasks() {

        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        Task current = head;

        // Since this is circular, use do-while and stop when we reach head again
        do {
            System.out.println("Task id: " + current.task_id);
            System.out.println("Task Name: " + current.task_name);
            System.out.println("Priority: " + current.priority);
            System.out.println("Due Date: " + current.due_date);
            System.out.println();

            current = current.next;

        } while (current != head);
    }

    public void searchByPriority(int priority) {

        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        Task current = head;
        boolean found = false;

        // Check every task for the required priority
        do {
            if (current.priority == priority) {

                System.out.println("Task id: " + current.task_id);
                System.out.println("Task Name: " + current.task_name);
                System.out.println("Priority: " + current.priority);
                System.out.println("Due Date: " + current.due_date);
                System.out.println();

                found = true;
            }

            current = current.next;

        } while (current != head);

        if (!found) {
            System.out.println("No task found with priority " + priority);
        }
    }
}

public class TaskSchedular {
    public static void main(String[] args) {

        taskOperations task = new taskOperations();

        // Add the first task
        task.addAtBeginning(122, "debugging", 3, "23-09-2026");

        // Add another task at the end
        task.addAtEnd(132, "building", 2, "15-09-2026");

        // Add architecture at position 1
        task.addAtPosition(142, "architecture", 1, "23-09-2026", 1);

        // Remove the architecture task
        task.removeTask(142);

        // Find a task using its name
        task.viewCurrentTask("building");

        // Display all tasks
        task.viewTasks();

        // Search for tasks having priority 1
        task.searchByPriority(1);
    }
}