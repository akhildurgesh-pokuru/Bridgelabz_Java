/*
 * Project: Book Details
 *
 * This program takes book details from the user and
 * displays them using getters and setters.
 */

package ObjectOrientedFundamental.Level_1;

import java.util.Scanner;

public class HandlebookDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get book details from the user
        System.out.println("Enter the name of the book");
        String name = sc.next();

        System.out.println("Enter the author of the book");
        String author = sc.next();

        System.out.println("Enter the price of the book");
        double price = sc.nextDouble();

        // Create a book object and set its details
        handle obj = new handle();
        obj.setName(name);
        obj.setAuthor(author);
        obj.setPrice(price);

        // Display the book details
        System.out.println("Book Name: " + obj.getName());
        System.out.println("Book Author: " + obj.getAuthor());
        System.out.println("Book Price: " + obj.getPrice());

    }
}

class handle {
    private String book;
    private String author;
    private double price;

    // Set the book name
    public void setName(String book) {
        this.book = book;
    }

    // Set the book author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Set the book price
    public void setPrice(double price) {
        this.price = price;
    }

    // Return the book name
    public String getName() {
        return this.book;
    }

    // Return the book author
    public String getAuthor() {
        return this.author;
    }

    // Return the book price
    public double getPrice() {
        return this.price;
    }
}