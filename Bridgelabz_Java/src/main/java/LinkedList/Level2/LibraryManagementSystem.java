package LinkedList.Level2;

/*
 * ============================================================
 * Program: Library Management System
 * Data Structure: Doubly Linked List
 *
 * Each node stores:
 * Book Title
 * Author
 * Genre
 * Book ID
 * Availability Status
 *
 * Operations:
 * 1. Add book at beginning
 * 2. Add book at end
 * 3. Add book at a specific position
 * 4. Remove book by Book ID
 * 5. Search by Book Title
 * 6. Search by Author
 * 7. Update Availability Status
 * 8. Display books in forward order
 * 9. Display books in reverse order
 * 10. Count total books
 * ============================================================
 */

import java.util.Scanner;

public class LibraryManagement {

    // Node represents one book
    static class Node {

        String title;
        String author;
        String genre;
        int bookId;
        boolean available;

        Node prev;
        Node next;

        // Constructor to create a book node
        Node(String title, String author, String genre,
             int bookId, boolean available) {

            this.title = title;
            this.author = author;
            this.genre = genre;
            this.bookId = bookId;
            this.available = available;

            this.prev = null;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    // ---------------------------------------------------------
    // Add book at the beginning
    // ---------------------------------------------------------
    void addAtBeginning(String title, String author,
                        String genre, int id, boolean available) {

        Node newNode =
                new Node(title, author, genre, id, available);

        // If list is empty
        if (head == null) {
            head = tail = newNode;
        } else {

            // Connect new node with current head
            newNode.next = head;
            head.prev = newNode;

            // Make new node the head
            head = newNode;
        }

        System.out.println("Book added at beginning.");
    }

    // ---------------------------------------------------------
    // Add book at the end
    // ---------------------------------------------------------
    void addAtEnd(String title, String author,
                  String genre, int id, boolean available) {

        Node newNode =
                new Node(title, author, genre, id, available);

        // If list is empty
        if (head == null) {
            head = tail = newNode;
        } else {

            // Connect current tail with new node
            tail.next = newNode;
            newNode.prev = tail;

            // Update tail
            tail = newNode;
        }

        System.out.println("Book added at end.");
    }

    // ---------------------------------------------------------
    // Add book at a specific position
    // Position starts from 1
    // ---------------------------------------------------------
    void addAtPosition(String title, String author,
                       String genre, int id,
                       boolean available, int position) {

        Node newNode =
                new Node(title, author, genre, id, available);

        // Position 1 means beginning
        if (position == 1) {

            if (head == null) {
                head = tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }

            System.out.println("Book added at position " + position);
            return;
        }

        Node current = head;

        // Move to the node before required position
        for (int i = 1;
             i < position - 1 && current != null;
             i++) {

            current = current.next;
        }

        // Invalid position
        if (current == null) {
            System.out.println("Invalid position.");
            return;
        }

        // Insert new node
        newNode.next = current.next;
        newNode.prev = current;

        if (current.next != null) {
            current.next.prev = newNode;
        } else {
            // New node becomes tail
            tail = newNode;
        }

        current.next = newNode;

        System.out.println("Book added at position " + position);
    }

    // ---------------------------------------------------------
    // Remove book using Book ID
    // ---------------------------------------------------------
    void removeBook(int id) {

        Node current = head;

        // Search for the book
        while (current != null &&
                current.bookId != id) {

            current = current.next;
        }

        // Book not found
        if (current == null) {
            System.out.println("Book not found.");
            return;
        }

        // If removing the head
        if (current == head) {
            head = current.next;
        }

        // If removing the tail
        if (current == tail) {
            tail = current.prev;
        }

        // Connect previous node to next node
        if (current.prev != null) {
            current.prev.next = current.next;
        }

        // Connect next node to previous node
        if (current.next != null) {
            current.next.prev = current.prev;
        }

        System.out.println("Book removed successfully.");
    }

    // ---------------------------------------------------------
    // Search book by title
    // ---------------------------------------------------------
    void searchByTitle(String title) {

        Node current = head;

        while (current != null) {

            if (current.title.equalsIgnoreCase(title)) {
                displayBook(current);
                return;
            }

            current = current.next;
        }

        System.out.println("Book not found.");
    }

    // ---------------------------------------------------------
    // Search book by author
    // ---------------------------------------------------------
    void searchByAuthor(String author) {

        Node current = head;

        while (current != null) {

            if (current.author.equalsIgnoreCase(author)) {
                displayBook(current);
                return;
            }

            current = current.next;
        }

        System.out.println("Book not found.");
    }

    // ---------------------------------------------------------
    // Update availability status
    // ---------------------------------------------------------
    void updateAvailability(int id, boolean status) {

        Node current = head;

        while (current != null) {

            if (current.bookId == id) {

                current.available = status;

                System.out.println(
                        "Availability status updated.");

                return;
            }

            current = current.next;
        }

        System.out.println("Book not found.");
    }

    // ---------------------------------------------------------
    // Display one book
    // ---------------------------------------------------------
    void displayBook(Node book) {

        System.out.println("----------------------------");
        System.out.println("Book Title : " + book.title);
        System.out.println("Author     : " + book.author);
        System.out.println("Genre      : " + book.genre);
        System.out.println("Book ID    : " + book.bookId);

        if (book.available) {
            System.out.println("Status     : Available");
        } else {
            System.out.println("Status     : Not Available");
        }

        System.out.println("----------------------------");
    }

    // ---------------------------------------------------------
    // Display books from head to tail
    // ---------------------------------------------------------
    void displayForward() {

        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }

        Node current = head;

        System.out.println("\n===== FORWARD ORDER =====");

        while (current != null) {

            displayBook(current);

            current = current.next;
        }
    }

    // ---------------------------------------------------------
    // Display books from tail to head
    // ---------------------------------------------------------
    void displayReverse() {

        if (tail == null) {
            System.out.println("Library is empty.");
            return;
        }

        Node current = tail;

        System.out.println("\n===== REVERSE ORDER =====");

        while (current != null) {

            displayBook(current);

            current = current.prev;
        }
    }

    // ---------------------------------------------------------
    // Count total number of books
    // ---------------------------------------------------------
    void countBooks() {

        int count = 0;

        Node current = head;

        while (current != null) {

            count++;

            current = current.next;
        }

        System.out.println("Total number of books = " + count);
    }

    // ---------------------------------------------------------
    // Main method
    // ---------------------------------------------------------
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LibraryManagement library =
                new LibraryManagement();

        // Add books at the end
        library.addAtEnd(
                "Java Programming",
                "James Gosling",
                "Programming",
                101,
                true
        );

        library.addAtEnd(
                "Data Structures",
                "Mark Allen",
                "Computer Science",
                102,
                true
        );

        library.addAtEnd(
                "Operating Systems",
                "Abraham Silberschatz",
                "Computer Science",
                103,
                false
        );

        // Add book at beginning
        library.addAtBeginning(
                "Computer Networks",
                "Andrew Tanenbaum",
                "Networking",
                104,
                true
        );

        // Add book at position 3
        library.addAtPosition(
                "Database Systems",
                "Raghu Ramakrishnan",
                "Database",
                105,
                true,
                3
        );

        // Display books forward
        library.displayForward();

        // Display books reverse
        library.displayReverse();

        // Search by title
        System.out.println("\nSearching by Title:");
        library.searchByTitle("Java Programming");

        // Search by author
        System.out.println("\nSearching by Author:");
        library.searchByAuthor("Andrew Tanenbaum");

        // Update availability
        library.updateAvailability(103, true);

        // Remove book
        library.removeBook(104);

        // Count books
        library.countBooks();

        // Display final library
        library.displayForward();

        sc.close();
    }
}