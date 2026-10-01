/*
 * Program to demonstrate a simple Library Management System
 * using static, final, this, and instanceof concepts in Java.
 */

package ThisStaticFinal;

import java.awt.datatransfer.FlavorListener;

class library {
    // Static variable is shared by all library objects.
    static String library_name = "Kadapayapalli Central Library";

    // final variable can be assigned only once.
    final int isbn;
    String title;
    String author;

    library(int isbn, String title, String author) {
        // Initialize the final ISBN and other object variables.
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    // Static method displays the common library name.
    public static void display_library_name() {
        System.out.println("Library Name: " + library_name);
    }

    // Display the details of a particular book.
    public void display_book() {
        System.out.println("Library Name: " + library_name);
        System.out.println("Book ISBN: " + isbn);
        System.out.println("Title of book: " + title);
        System.out.println("Author: " + author);
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {

        // Create two library objects with different book details.
        library obj = new library(10169, "DSA", "Akhil Durgesh");
        library obj1 = new library(10180, "cricket stories", "Abhishek");

        // Check whether obj belongs to the library class.
        if (obj instanceof library) {
            System.out.println("Yes it is..");
        }

        // Call the static method using the class name.
        library.display_library_name();
        System.out.println();

        // Display details of the first book.
        obj.display_book();
        System.out.println();

        // Display details of the second book.
        obj1.display_book();
    }
}