
/*
   This program demonstrates the aggregation relationship between Library and Book classes.
   It shows how a library can contain multiple book objects.
 */

        package ObjectModeling;

import java.util.ArrayList;
import java.util.List;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        // Initialize book details
        this.title = title;
        this.author = author;
    }

    // Display the details of a book
    public void display_books() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class library {
    static String libraryname = "SRM Library";
    List<Book> books;

    library() {
        // Create an empty list to store books
        this.books = new ArrayList<>();
    }

    // Add a book object to the library
    public void addBooks(Book obj) {
        books.add(obj);
    }

    // Display all books available in the library
    public void library_books() {
        for (Book book : books) {
            book.display_books();
            System.out.println();
        }
    }
}

public class LibraryBookAggregation {
    public static void main(String[] args) {

        // Create two independent Book objects
        Book obj = new Book("DSA", "Akhil");
        Book obj2 = new Book("OS", "Charan");

        // Create a library object and add the books to it
        library obj3 = new library();
        obj3.addBooks(obj);
        obj3.addBooks(obj2);

        // Display all books in the library
        obj3.library_books();
    }
}
