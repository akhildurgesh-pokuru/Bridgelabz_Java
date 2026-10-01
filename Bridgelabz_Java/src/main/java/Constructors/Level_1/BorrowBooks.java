/*
 * This program checks whether a book is available for borrowing.
 * It takes the book title, author, price, and availability status
 * from the user and creates a book object using a parameterized constructor.
 * Based on the availability entered by the user, it displays whether
 * the book was borrowed successfully or the book was not found.
 */

package Constructors.Level_1;

import java.util.Scanner;

class borrow {
    String title;
    String author;
    int price;
    boolean availability;

    // Constructor used to initialize all the book details.
    borrow(String title, String author, int price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    // Checks the availability of the book and displays the result.
    public void book_details() {
        if (availability) {
            System.out.println("Book borrowed successfully");
        } else {
            System.out.println("Book not found");
        }
    }
}

public class BorrowBooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking the book details from the user.
        System.out.println("Enter the title of book");
        String title = sc.nextLine();

        System.out.println("Enter the author of book");
        String author = sc.next();

        System.out.println("Enter the price of book");
        int price = sc.nextInt();

        // The user enters true if the book is available, otherwise false.
        System.out.println("Enter the availability");
        boolean availability = sc.nextBoolean();

        // Creating the book object using the details entered by the user.
        borrow obj = new borrow(title, author, price, availability);

        // Checking whether the book is available for borrowing.
        obj.book_details();
    }
}