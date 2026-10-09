/*
 * Problem: Create a Library Management System using a doubly linked list.
 * Operations: Add, remove, search, update, display and count library books.
 */

package LinkedList.Level2;

import java.util.Scanner;

class LibraryManagement {

    // Each node represents one book in the library
    static class Node {
        String title;
        String author;
        String genre;
        int bookId;
        boolean available;

        Node prev;
        Node next;

        // Create a new book with all its details
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

    // Add a book at the beginning of the list
    void addAtBeginning(String title, String author,
                        String genre, int id, boolean available) {

        Node newNode =
                new Node(title, author, genre, id, available);

        // If the library is empty, this book becomes both head and tail
        if (head == null) {
            head = tail = newNode;
        } else {

            // Connect the new book before the current first book
            newNode.next = head;
            head.prev = newNode;

            // Make the new book the first book
            head = newNode;
        }

        System.out.println("Book added at beginning.");
    }

    // Add a book at the end of the list
    void addAtEnd(String title, String author,
                  String genre, int id, boolean available) {

        Node newNode =
                new Node(title, author, genre, id, available);

        // If the library is empty, this book becomes the first book
        if (head == null) {
            head = tail = newNode;
        } else {

            // Connect the current last book to the new book
            tail.next = newNode;
            newNode.prev = tail;

            // Move tail to the newly added book
            tail = newNode;
        }

        System.out.println("Book added at end.");
    }

    // Add a book at a specific position
    // Position starts from 1
    void addAtPosition(String title, String author,
                       String genre, int id,
                       boolean available, int position) {

        Node newNode =
                new Node(title, author, genre, id, available);

        // Position 1 means adding the book at the beginning
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

        // Move to the book just before the required position
        for (int i = 1;
             i < position - 1 && current != null;
             i++) {

            current = current.next;
        }

        // The given position does not exist
        if (current == null) {
            System.out.println("Invalid position.");
            return;
        }

        // Connect the new book between two existing books
        newNode.next = current.next;
        newNode.prev = current;

        if (current.next != null) {
            current.next.prev = newNode;
        } else {

            // If it is added at the end, update tail
            tail = newNode;
        }

        current.next = newNode;

        System.out.println("Book added at position " + position);
    }

    // Remove a book using its Book ID
    void removeBook(int id) {

        Node current = head;

        // Search for the book with the given ID
        while (current != null &&
                current.bookId != id) {

            current = current.next;
        }

        // The book was not found
        if (current == null) {
            System.out.println("Book not found.");
            return;
        }

        // If we are removing the first book, move head forward
        if (current == head) {
            head = current.next;
        }

        // If we are removing the last book, move tail backward
        if (current == tail) {
            tail = current.prev;
        }

        // Connect the previous book to the next book
        if (current.prev != null) {
            current.prev.next = current.next;
        }

        // Connect the next book back to the previous book
        if (current.next != null) {
            current.next.prev = current.prev;
        }

        System.out.println("Book removed successfully.");
    }

    // Search for a book using its title
    void searchByTitle(String title) {

        Node current = head;

        // Check every book until the title is found
        while (current != null) {

            if (current.title.equalsIgnoreCase(title)) {

                // Display the book when we find it
                displayBook(current);
                return;
            }

            current = current.next;
        }

        System.out.println("Book not found.");
    }

    // Search for a book using its author
    void searchByAuthor(String author) {

        Node current = head;

        // Check every book until the author is found
        while (current != null) {

            if (current.author.equalsIgnoreCase(author)) {

                // Display the book when we find it
                displayBook(current);
                return;
            }

            current = current.next;
        }

        System.out.println("Book not found.");
    }

    // Change the availability status of a book
    void updateAvailability(int id, boolean status) {

        Node current = head;

        // Search for the book using its ID
        while (current != null) {

            if (current.bookId == id) {

                // Update whether the book is available or not
                current.available = status;

                System.out.println(
                        "Availability status updated.");

                return;
            }

            current = current.next;
        }

        System.out.println("Book not found.");
    }

    // Display the details of one book
    void displayBook(Node book) {

        System.out.println("----------------------------");
        System.out.println("Book Title : " + book.title);
        System.out.println("Author     : " + book.author);
        System.out.println("Genre      : " + book.genre);
        System.out.println("Book ID    : " + book.bookId);

        // Show a readable message for the boolean value
        if (book.available) {
            System.out.println("Status     : Available");
        } else {
            System.out.println("Status     : Not Available");
        }

        System.out.println("----------------------------");
    }

    // Display books from head to tail
    void displayForward() {

        // There is nothing to display if the library is empty
        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }

        Node current = head;

        System.out.println("\n===== FORWARD ORDER =====");

        // Move forward using next
        while (current != null) {

            displayBook(current);

            current = current.next;
        }
    }

    // Display books from tail to head
    void displayReverse() {

        // There is nothing to display if the library is empty
        if (tail == null) {
            System.out.println("Library is empty.");
            return;
        }

        Node current = tail;

        System.out.println("\n===== REVERSE ORDER =====");

        // Move backward using prev
        while (current != null) {

            displayBook(current);

            current = current.prev;
        }
    }

    // Count the total number of books
    void countBooks() {

        int count = 0;

        Node current = head;

        // Visit every book and increase the count
        while (current != null) {

            count++;

            current = current.next;
        }

        System.out.println("Total number of books = " + count);
    }

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

        // Add Computer Networks at the beginning
        library.addAtBeginning(
                "Computer Networks",
                "Andrew Tanenbaum",
                "Networking",
                104,
                true
        );

        // Add Database Systems at position 3
        library.addAtPosition(
                "Database Systems",
                "Raghu Ramakrishnan",
                "Database",
                105,
                true,
                3
        );

        // Display books from beginning to end
        library.displayForward();

        // Display books from end to beginning
        library.displayReverse();

        // Search for a book using its title
        System.out.println("\nSearching by Title:");
        library.searchByTitle("Java Programming");

        // Search for a book using its author
        System.out.println("\nSearching by Author:");
        library.searchByAuthor("Andrew Tanenbaum");

        // Make Operating Systems available
        library.updateAvailability(103, true);

        // Remove Computer Networks
        library.removeBook(104);

        // Count the remaining books
        library.countBooks();

        // Display the final library
        library.displayForward();

        sc.close();
    }
}