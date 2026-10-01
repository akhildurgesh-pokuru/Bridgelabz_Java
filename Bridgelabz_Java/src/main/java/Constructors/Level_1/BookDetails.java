/*
 * This program demonstrates the use of constructors in Java.
 * It creates two book objects using two different constructors.
 * The first book uses a default constructor with predefined details.
 * The second book takes the title, author, and price from the user
 * and creates the book object using a parameterized constructor.
 */

package Constructors.Level_1;

import java.util.Scanner;

class books {
    private String title;
    private String author;
    private int price;

    // Default constructor that assigns predefined details to the book.
    books() {
        title = "MS Dhoni Bio Pic";
        author = "Akhil";
        price = 100;
    }

    // Parameterized constructor that sets the book details received from the user.
    books(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Displays all the details of the book.
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class BookDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating the first book using the default constructor.
        books obj = new books();
        System.out.println("Book-1 details");
        obj.display();

        // Taking the details of the second book from the user.
        System.out.println("Enter the title of the book");
        String title = sc.nextLine();

        System.out.println("Enter the author of book");
        String author = sc.next();

        System.out.println("Enter price of book");
        int price = sc.nextInt();

        // Creating the second book using the parameterized constructor.
        books obj1 = new books(title, author, price);
        System.out.println("Book-2 details");

        // Displays the details of the second book.
        obj.display();
    }
}