/*
 * This program calculates the total rental cost of a car.
 * It takes the customer's name, car model, and number of rental days
 * from the user and creates a rental object using a parameterized constructor.
 * The program then calculates the total cost based on a fixed charge
 * of 5000 per day and displays the rental details.
 */

package Constructors.Level_1;

import java.util.Scanner;

class rental {
    String name;
    String model;
    int rental_days;

    // Constructor used to store the customer's rental details.
    rental(String name, String model, int rental_days) {
        this.name = name;
        this.model = model;
        this.rental_days = rental_days;
    }

    // Calculates and displays the total rental cost.
    public void total_cost() {
        System.out.println("Total Cost details");
        System.out.println("Charge for 1 day is 5000");
        System.out.println("Customer name: " + name);
        System.out.println("Car Model: " + model);
        System.out.println("Rental days: " + rental_days);
        System.out.println("Total cost: " + (rental_days * 5000));
    }
}

public class CarRentalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking the customer's rental details as input.
        System.out.println("Enter the name of customer");
        String name = sc.next();

        System.out.println("Enter the model of the car");
        String model = sc.next();

        System.out.println("Enter the number of days taken for rental");
        int rental_days = sc.nextInt();

        // Creating a rental object with the details entered by the user.
        rental obj = new rental(name, model, rental_days);

        // Calculating and displaying the total rental cost.
        obj.total_cost();
    }
}