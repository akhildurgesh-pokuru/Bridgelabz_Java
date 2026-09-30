/*
 * Project: Mobile Phone Details
 *
 * This program takes mobile phone details from the user
 * and displays them using getters and setters.
 */

package ObjectOrientedFundamental.Level_1;

import java.util.Scanner;

public class HandleMobilePhoneDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get mobile phone details from the user
        System.out.println("Enter the name of the mobile phone");
        String name = sc.next();

        System.out.println("Enter the brand of the mobile phone");
        String brand = sc.next();

        System.out.println("Enter the price of the mobile phone");
        double price = sc.nextDouble();

        // Create a mobile phone object and set its details
        MobilePhone obj = new MobilePhone();
        obj.setName(name);
        obj.setBrand(brand);
        obj.setPrice(price);

        // Display the mobile phone details
        System.out.println("Mobile Phone Name: " + obj.getName());
        System.out.println("Mobile Phone Brand: " + obj.getBrand());
        System.out.println("Mobile Phone Price: " + obj.getPrice());

    }
}

class MobilePhone {
    private String name;
    private String brand;
    private double price;

    // Set the mobile phone name
    public void setName(String name) {
        this.name = name;
    }

    // Set the mobile phone brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Set the mobile phone price
    public void setPrice(double price) {
        this.price = price;
    }

    // Return the mobile phone name
    public String getName() {
        return this.name;
    }

    // Return the mobile phone brand
    public String getBrand() {
        return this.brand;
    }

    // Return the mobile phone price
    public double getPrice() {
        return this.price;
    }
}