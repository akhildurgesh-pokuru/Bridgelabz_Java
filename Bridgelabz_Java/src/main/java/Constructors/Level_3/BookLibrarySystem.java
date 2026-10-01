/*
 * This program demonstrates access modifiers, encapsulation, and inheritance in Java.
 * The books class uses public, protected, and private variables to store book details.
 * The private author field is accessed and modified using getter and setter methods.
 * The Ebook class inherits the public ISBN and protected title from the books class.
 * The program creates book objects, updates their authors, retrieves the author details,
 * and demonstrates how the child class can access members inherited from the parent class.
 */

package Constructors.Level_3;

class books {
    public int isbn;
    protected String title;
    private String author;

    // Default constructor that allows an object to be created without initial values.
    books() {
    }

    // Constructor used to initialize the book details.
    books(int isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    // Updates the private author field using a setter method.
    public void setAuthor(String author) {
        this.author = author;
    }

    // Returns the private author value using a getter method.
    public String getAuthor() {
        return author;
    }
}

class Ebook extends books {

    // Calls the parent class constructor to initialize the book details.
    Ebook(int isbn, String title, String author) {
        super(isbn, title, author);
    }

    // Accesses the public and protected members inherited from the parent class.
    public void AccessingParent() {
        System.out.println("Book ISBN: " + isbn);
        System.out.println("Book Title: " + title);
    }
}

public class BookLibrarySystem {
    public static void main(String[] ars) {

        // Creating two book objects with their initial details.
        books obj = new books(1002, "Good Stories", "Vishruth");
        books obj1 = new books(13232, "Good nights", "Akhil");

        // Updating the authors using the setter method.
        obj.setAuthor("Venkatesh");
        obj1.setAuthor("Sreenu");

        // Getting the updated author of the first book.
        String author = obj.getAuthor();
        System.out.println("Object-1 author: " + author);

        System.out.println();

        // Getting the updated author of the second book.
        String author1 = obj1.getAuthor();
        System.out.println("Object-2 author: " + author1);

        System.out.println();

        // Creating an Ebook object using the child class constructor.
        Ebook obj2 = new Ebook(5649, "Stranger Things", "Abhishek");

        // Displaying the parent class members accessed through the child object.
        obj2.AccessingParent();
    }
}