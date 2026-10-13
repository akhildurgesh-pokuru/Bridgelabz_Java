package LinkedList.Double;

/*
This program manages movie records using a doubly linked list.
It supports insertion, deletion, searching, rating updates, and forward and reverse display.
*/

public class MovieManagementSystem {

    // Each node stores movie details and links to previous and next movies.
    static class Node {
        String title, director;
        int year;
        double rating;
        Node next, prev;

        // Initialize the movie information.
        Node(String title, String director, int year, double rating) {
            this.title = title;
            this.director = director;
            this.year = year;
            this.rating = rating;
        }
    }

    // Head points to the first movie, and tail points to the last movie.
    Node head, tail;

    // Insert a movie at the specified position.
    void add(String title, String director, int year,
             double rating, int pos) {

        if (pos < 1) {
            System.out.println("Invalid position");
            return;
        }

        Node n = new Node(title, director, year, rating);

        // Handle insertion at the beginning.
        if (pos == 1) {
            n.next = head;

            // Connect the old head back to the new node.
            if (head != null)
                head.prev = n;
            else
                tail = n;

            head = n;
            return;
        }

        // Find the node before the insertion position.
        Node c = head;
        for (int i = 1; c != null && i < pos - 1; i++)
            c = c.next;

        if (c == null) {
            System.out.println("Invalid position");
            return;
        }

        // Connect the new node with its previous and next nodes.
        n.next = c.next;
        n.prev = c;

        // Update the next node's previous pointer if it exists.
        if (c.next != null)
            c.next.prev = n;
        else
            tail = n;

        c.next = n;
    }

    // Remove a movie using its title.
    void remove(String title) {
        Node c = head;

        // Search for the movie to remove.
        while (c != null && !c.title.equalsIgnoreCase(title))
            c = c.next;

        if (c == null) {
            System.out.println("Movie not found");
            return;
        }

        // Connect the previous node to the next node.
        if (c.prev != null)
            c.prev.next = c.next;
        else
            head = c.next;

        // Update the next node's previous pointer.
        if (c.next != null)
            c.next.prev = c.prev;
        else
            tail = c.prev;
    }

    // Search movies by director or by minimum rating.
    void search(String director, double minRating) {
        Node c = head;

        while (c != null) {
            // Display the movie if either condition matches.
            if (c.director.equalsIgnoreCase(director)
                    || c.rating >= minRating)
                show(c);

            c = c.next;
        }
    }

    // Update a movie's rating using its title.
    void updateRating(String title, double rating) {
        Node c = head;

        while (c != null) {
            if (c.title.equalsIgnoreCase(title)) {
                c.rating = rating;
                System.out.println("Rating updated");
                return;
            }

            c = c.next;
        }

        System.out.println("Movie not found");
    }

    // Display the details of one movie.
    void show(Node c) {
        System.out.println(c.title + " | " + c.director
                + " | " + c.year + " | " + c.rating);
    }

    // Traverse from head to tail using next pointers.
    void forward() {
        Node c = head;

        while (c != null) {
            show(c);
            c = c.next;
        }
    }

    // Traverse from tail to head using previous pointers.
    void reverse() {
        Node c = tail;

        while (c != null) {
            show(c);
            c = c.prev;
        }
    }

    public static void main(String[] args) {
        MovieManagementSystem m = new MovieManagementSystem();

        // Add sample movies at different positions.
        m.add("Interstellar", "Christopher Nolan", 2014, 8.7, 1);
        m.add("Inception", "Christopher Nolan", 2010, 8.8, 2);
        m.add("Avatar", "James Cameron", 2009, 7.9, 2);

        System.out.println("Movies in Forward Order:");
        m.forward();

        System.out.println("Movies in Reverse Order:");
        m.reverse();

        // Search by director or minimum rating.
        System.out.println("Search Results:");
        m.search("Christopher Nolan", 9.0);

        // Update a rating and remove a movie.
        m.updateRating("Avatar", 8.2);
        m.remove("Inception");

        System.out.println("Movies After Updates:");
        m.forward();
    }
}