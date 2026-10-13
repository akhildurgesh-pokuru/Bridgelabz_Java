package LinkedList.Double;

/*
This program manages library books using a doubly linked list.
It supports adding, removing, searching, updating availability, counting, and displaying books in both directions.
*/

public class LibraryManagementSystem {

    static class Node {
        int bookId;
        String title, author, genre;
        boolean available;
        Node prev, next;

        Node(int bookId, String title, String author,
             String genre, boolean available) {
            this.bookId = bookId;
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.available = available;
        }
    }

    Node head, tail;

    // Insert a book at a 1-based position.
    void add(int id, String title, String author,
             String genre, boolean available, int pos) {
        if (pos < 1) {
            System.out.println("Invalid position");
            return;
        }

        Node n = new Node(id, title, author, genre, available);

        if (head == null) {
            if (pos != 1) {
                System.out.println("Invalid position");
                return;
            }
            head = tail = n;
            return;
        }

        if (pos == 1) {
            n.next = head;
            head.prev = n;
            head = n;
            return;
        }

        Node c = head;

        for (int i = 1; c != null && i < pos - 1; i++)
            c = c.next;

        if (c == null) {
            System.out.println("Invalid position");
            return;
        }

        // Connect the new node to both neighboring nodes.
        n.next = c.next;
        n.prev = c;

        if (c.next != null)
            c.next.prev = n;
        else
            tail = n;

        c.next = n;
    }

    // Remove a book using its ID.
    void remove(int id) {
        Node c = head;

        while (c != null && c.bookId != id)
            c = c.next;

        if (c == null) {
            System.out.println("Book not found");
            return;
        }

        // Connect the previous node to the next node.
        if (c.prev != null)
            c.prev.next = c.next;
        else
            head = c.next;

        // Update the backward link or the tail.
        if (c.next != null)
            c.next.prev = c.prev;
        else
            tail = c.prev;
    }

    // Search for books by title or author.
    void search(String key) {
        Node c = head;
        boolean found = false;

        while (c != null) {
            if (c.title.equalsIgnoreCase(key)
                    || c.author.equalsIgnoreCase(key)) {
                show(c);
                found = true;
            }
            c = c.next;
        }

        if (!found)
            System.out.println("Book not found");
    }

    // Change whether a book is available for borrowing.
    void updateAvailability(int id, boolean available) {
        Node c = head;

        while (c != null) {
            if (c.bookId == id) {
                c.available = available;
                return;
            }
            c = c.next;
        }

        System.out.println("Book not found");
    }

    // Count the total number of books.
    int count() {
        int total = 0;
        Node c = head;

        while (c != null) {
            total++;
            c = c.next;
        }

        return total;
    }

    void show(Node n) {
        System.out.println("ID: " + n.bookId + ", Title: " + n.title
                + ", Author: " + n.author + ", Genre: " + n.genre
                + ", Available: " + n.available);
    }

    // Traverse from the head to the tail.
    void displayForward() {
        Node c = head;

        while (c != null) {
            show(c);
            c = c.next;
        }
    }

    // Traverse backward using the prev links.
    void displayReverse() {
        Node c = tail;

        while (c != null) {
            show(c);
            c = c.prev;
        }
    }

    public static void main(String[] args) {
        LibraryManagementSystem lib = new LibraryManagementSystem();

        lib.add(1, "Java Basics", "James", "Programming", true, 1);
        lib.add(2, "Python Guide", "John", "Programming", true, 2);
        lib.add(3, "The Alchemist", "Paulo", "Fiction", false, 3);

        System.out.println("Forward:");
        lib.displayForward();

        System.out.println("Reverse:");
        lib.displayReverse();

        System.out.println("Search:");
        lib.search("James");

        lib.updateAvailability(3, true);
        lib.remove(2);

        System.out.println("Book Count: " + lib.count());
    }
}