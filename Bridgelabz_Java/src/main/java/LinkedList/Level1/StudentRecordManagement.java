/*
 * Problem: Create a Student Record Management System using a singly linked list.
 * Operations: Insert, delete, search, display student records and update grades.
 */

package LinkedList;

class Student {
    int roll_num;
    String name;
    int age;
    char grade;
    Student next;

    Student(int roll_num, String name, int age, char grade) {
        this.roll_num = roll_num;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentOperations {
    Student head = null;
    Student tail = null;

    public void InsertAtBeginning(int roll_num, String name, int age, char grade) {

        Student student = new Student(roll_num, name, age, grade);

        // If the list is empty, the new student becomes both head and tail
        if (head == null) {
            head = tail = student;
        } else {

            // Connect the new student before the current first student
            student.next = head;
            head = student;
        }
    }

    public void InsertAtEnd(int roll_num, String name, int age, char grade) {

        Student student = new Student(roll_num, name, age, grade);

        // If the list is empty, this student becomes the first student
        if (head == null) {
            head = tail = student;
        } else {

            // Add the new student after the current last student
            tail.next = student;
            tail = student;
        }
    }

    public void InsertAtPosition(int roll_num, String name, int age, char grade, int pos) {

        Student student = new Student(roll_num, name, age, grade);

        // Position 1 means inserting at the beginning
        if (pos == 1) {
            InsertAtBeginning(roll_num, name, age, grade);
            return;
        }

        if (head == null) {
            return;
        }

        Student current = head;

        // Move to the student just before the required position
        for (int i = 1; i < pos - 1 && current != null; i++) {
            current = current.next;
        }

        // If the position is invalid, stop here
        if (current == null) {
            return;
        }

        // Connect the new student into the list
        student.next = current.next;
        current.next = student;

        // If the student was added at the end, update tail
        if (student.next == null) {
            tail = student;
        }
    }

    public void DeleteByRollNumber(int roll_number) {

        // Nothing can be deleted if the list is empty
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        // If the first student has the required roll number, remove the head
        if (head.roll_num == roll_number) {
            head = head.next;

            // If the list became empty, tail should also become null
            if (head == null) {
                tail = null;
            }

            return;
        }

        Student current = head;

        // Search for the student just before the one we want to delete
        while (current.next != null && current.next.roll_num != roll_number) {
            current = current.next;
        }

        // If the roll number was not found, do nothing
        if (current.next == null) {
            return;
        }

        // Skip the student that needs to be deleted
        current.next = current.next.next;

        // If we deleted the last student, update tail
        if (current.next == null) {
            tail = current;
        }
    }

    public void SearchByRollNumber(int roll_num) {

        Student current = head;

        // Search through the list until we find the required roll number
        while (current != null) {

            if (current.roll_num == roll_num) {
                System.out.println("Roll Number: " + current.roll_num);
                System.out.println("Name: " + current.name);
                System.out.println("Age: " + current.age);
                System.out.println("Grade: " + current.grade);
                System.out.println();
                return;
            }

            // Move to the next student
            current = current.next;
        }

        System.out.println("Student not found");
    }

    public void DisplayStudentRecords() {

        Student current = head;

        // Check whether there are any student records
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        // Display every student from the beginning to the end
        while (current != null) {
            System.out.println("Roll Number: " + current.roll_num);
            System.out.println("Name: " + current.name);
            System.out.println("Age: " + current.age);
            System.out.println("Grade: " + current.grade);
            System.out.println();

            current = current.next;
        }
    }

    public void UpdateGrade(int roll_num, char grade) {

        Student current = head;

        // Search for the student whose grade needs to be updated
        while (current != null) {

            if (current.roll_num == roll_num) {

                // Update the grade when the student is found
                current.grade = grade;

                System.out.println("Check the Updated Details Below");
                System.out.println("Roll Number: " + current.roll_num);
                System.out.println("Student Name: " + current.name);
                System.out.println("Age: " + current.age);
                System.out.println("Grade: " + current.grade);
                System.out.println();

                return;
            }

            // Continue searching through the list
            current = current.next;
        }

        System.out.println("Student not found");
    }
}

public class StudentRecordManagement {
    public static void main(String[] args) {

        StudentOperations student = new StudentOperations();

        // Add students at the beginning
        student.InsertAtBeginning(169, "Akhil", 20, 'C');
        student.InsertAtBeginning(180, "Abhishek", 21, 'A');

        // Add students at the end
        student.InsertAtEnd(182, "hemanth", 19, 'O');
        student.InsertAtEnd(190, "venky", 45, 'O');

        // Display the current student records
        student.DisplayStudentRecords();

        // Insert Vishruth at position 3
        student.InsertAtPosition(155, "Vishruth", 12, 'A', 3);
        student.DisplayStudentRecords();

        // Delete the student with roll number 169
        student.DeleteByRollNumber(169);
        student.DisplayStudentRecords();

        // Search for a student using roll number
        student.SearchByRollNumber(190);

        // Update the grade of student 180
        student.UpdateGrade(180, 'B');

        // Display the final student records
        student.DisplayStudentRecords();
    }
}