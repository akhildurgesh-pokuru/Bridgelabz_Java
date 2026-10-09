/*
 * Problem: Create a Movie Management System using a doubly linked list.
 * Operations: Add, remove, search, display movies and update movie ratings.
 */

package LinkedList;

class Movie {
    String movie_title;
    String director;
    int year_of_release;
    Movie next;
    Movie prev;
    int rating;

    Movie(String movie_title, String director, int year_of_release, int rating) {
        this.movie_title = movie_title;
        this.director = director;
        this.year_of_release = year_of_release;
        this.next = null;
        this.prev = null;
        this.rating = rating;
    }
}

class MovieOperations {
    Movie head = null;
    Movie tail = null;

    public void addAtBeginning(String movie_title, String director, int year_of_release, int rating) {

        Movie movie = new Movie(movie_title, director, year_of_release, rating);

        // If there are no movies, this movie becomes both head and tail
        if (head == null) {
            head = movie;
            tail = movie;
        } else {

            // Connect the new movie before the current first movie
            movie.next = head;
            head.prev = movie;

            // Make the new movie the first movie
            head = movie;
        }
    }

    public void addAtEnd(String movie_title, String director, int year_of_release, int rating) {

        Movie movie = new Movie(movie_title, director, year_of_release, rating);

        // If the list is empty, this movie becomes the first movie
        if (head == null) {
            head = movie;
            tail = movie;
        } else {

            // Connect the new movie after the current last movie
            tail.next = movie;
            movie.prev = tail;

            // Move tail to the newly added movie
            tail = movie;
        }
    }

    public void addAtPosition(String movie_title, String director, int year_of_release, int pos, int rating) {

        Movie movie = new Movie(movie_title, director, year_of_release, rating);

        // Position 1 means adding the movie at the beginning
        if (pos == 1) {
            addAtBeginning(movie_title, director, year_of_release, rating);
            return;
        }

        Movie current = head;

        // Move to the movie just before the required position
        for (int i = 1; i < pos - 1 && current != null; i++) {
            current = current.next;
        }

        // If the position is invalid, stop here
        if (current == null) {
            return;
        }

        // Connect the new movie between the previous and next movies
        movie.next = current.next;
        movie.prev = current;

        if (current.next != null) {
            current.next.prev = movie;
        } else {
            // If we are adding at the end, update tail
            tail = movie;
        }

        current.next = movie;
    }

    public void removeMovieRecord(String title) {

        Movie current = head;

        // Nothing to remove if the list is empty
        if (current == null) {
            return;
        }

        // Search for the movie with the given title
        while (current != null && !current.movie_title.equals(title)) {
            current = current.next;
        }

        // Movie was not found
        if (current == null) {
            return;
        }

        // If we are removing the first movie, move head forward
        if (current == head) {
            head = current.next;

            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }

            return;
        }

        // Connect the previous movie to the next movie
        current.prev.next = current.next;

        // If there is a next movie, connect it back to the previous movie
        if (current.next != null) {
            current.next.prev = current.prev;
        } else {
            // If the last movie was removed, update tail
            tail = current.prev;
        }
    }

    public void searchDirector(String director) {

        Movie current = head;

        // Check every movie until we reach the end
        while (current != null) {

            // If the director matches, print that movie's details
            if (current.director.equals(director)) {
                System.out.println("Title: " + current.movie_title);
                System.out.println("Director: " + current.director);
                System.out.println("Year of Release: " + current.year_of_release);
                System.out.println("Rating: " + current.rating);
                System.out.println();
            }

            // Move to the next movie
            current = current.next;
        }
    }

    public void printForwardOrder() {

        Movie current = head;

        // Start from head and move forward using next
        while (current != null) {
            System.out.println("Title: " + current.movie_title);
            System.out.println("Director: " + current.director);
            System.out.println("Year of Release: " + current.year_of_release);
            System.out.println("Rating: " + current.rating);
            System.out.println();

            current = current.next;
        }
    }

    public void printBackwardOrder() {

        // Start from tail because we want to print in reverse
        Movie current = tail;

        // Move backwards using prev
        while (current != null) {
            System.out.println("Title: " + current.movie_title);
            System.out.println("Director: " + current.director);
            System.out.println("Year of Release: " + current.year_of_release);
            System.out.println("Rating: " + current.rating);
            System.out.println();

            current = current.prev;
        }
    }

    public void updateRating(String title, int rating) {

        Movie current = head;

        // Search for the movie whose rating needs to be changed
        while (current != null) {

            if (current.movie_title.equals(title)) {

                // Update the rating when the movie is found
                current.rating = rating;
                return;
            }

            // Continue searching through the list
            current = current.next;
        }
    }
}

public class MovieManagementSystem {
    public static void main(String[] args) {

        MovieOperations operation = new MovieOperations();

        // Add the first movie
        operation.addAtBeginning("Govindhudu", "akhil", 2013, 9);

        // Add a movie at the end
        operation.addAtEnd("Shathamanam bhavathi", "charan", 2017, 8);

        // Add Pushpa at position 2
        operation.addAtPosition("Pushpa", "trikram", 2021, 2, 9);

        // Add Temper at position 2
        operation.addAtPosition("temper", "priya", 2015, 2, 10);

        // Remove Pushpa from the list
        operation.removeMovieRecord("Pushpa");

        // Find movies directed by Akhil
        operation.searchDirector("akhil");

        // Display all movies from first to last
        operation.printForwardOrder();

        // Display all movies from last to first
        operation.printBackwardOrder();

        // Change Govindhudu's rating
        operation.updateRating("Govindhudu", 10);

        // Display the updated movie list
        operation.printForwardOrder();
    }
}