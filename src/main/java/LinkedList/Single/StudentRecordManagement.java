package LinkedList.Single;

/*
This program manages student records using a singly linked list.
It supports adding, deleting, searching, displaying students, and updating grades.
*/

public class StudentRecordManagement {

    // Each node stores student details and a link to the next student.
    static class Node {
        int rollNo, age;
        String name, grade;
        Node next;

        // Initialize the student details when creating a new node.
        Node(int rollNo, String name, int age, String grade) {
            this.rollNo = rollNo;
            this.name = name;
            this.age = age;
            this.grade = grade;
        }
    }

    // Head points to the first student in the linked list.
    Node head;

    // Insert a student at the specified position.
    void add(int rollNo, String name, int age, String grade, int pos) {
        if (pos < 1) {
            System.out.println("Invalid position");
            return;
        }

        Node n = new Node(rollNo, name, age, grade);

        // If position is 1, make the new node the head.
        if (pos == 1) {
            n.next = head;
            head = n;
            return;
        }

        // Traverse until the node before the required position.
        Node c = head;
        for (int i = 1; c != null && i < pos - 1; i++)
            c = c.next;

        // Stop if the requested position does not exist.
        if (c == null) {
            System.out.println("Invalid position");
            return;
        }

        // Connect the new node with the remaining nodes.
        n.next = c.next;
        c.next = n;
    }

    // Delete a student using the roll number.
    void delete(int rollNo) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Handle deletion when the student is the first node.
        if (head.rollNo == rollNo) {
            head = head.next;
            return;
        }

        // Find the node immediately before the student to delete.
        Node c = head;
        while (c.next != null && c.next.rollNo != rollNo)
            c = c.next;

        // Skip the matching node to remove it from the list.
        if (c.next != null)
            c.next = c.next.next;
        else
            System.out.println("Student not found");
    }

    // Search for a student and display their details.
    void search(int rollNo) {
        Node c = head;

        // Check each node until the student is found.
        while (c != null) {
            if (c.rollNo == rollNo) {
                System.out.println(c.rollNo + " " + c.name
                        + " " + c.age + " " + c.grade);
                return;
            }

            c = c.next;
        }

        System.out.println("Student not found");
    }

    // Update the grade without changing other student details.
    void updateGrade(int rollNo, String grade) {
        for (Node c = head; c != null; c = c.next) {
            if (c.rollNo == rollNo) {
                c.grade = grade;
                System.out.println("Grade updated");
                return;
            }
        }

        System.out.println("Student not found");
    }

    // Display all student records from the head to the end.
    void display() {
        Node c = head;

        while (c != null) {
            System.out.println(c.rollNo + " " + c.name
                    + " " + c.age + " " + c.grade);

            // Move to the next student.
            c = c.next;
        }
    }

    public static void main(String[] args) {
        StudentRecordManagement s = new StudentRecordManagement();

        // Insert sample student records.
        s.add(101, "Ravi", 20, "A", 1);
        s.add(102, "Priya", 21, "B", 2);
        s.add(103, "Arun", 19, "A+", 2);

        System.out.println("All Students:");
        s.display();

        System.out.println("Search Student:");
        s.search(102);

        // Update a grade and remove a student record.
        s.updateGrade(102, "A+");
        s.delete(101);

        System.out.println("After Update and Delete:");
        s.display();
    }
}