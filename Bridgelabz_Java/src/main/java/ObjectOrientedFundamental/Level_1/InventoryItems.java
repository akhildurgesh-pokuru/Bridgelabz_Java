/*
 * Project: Inventory Items
 *
 * This program takes item details from the user and
 * calculates the total value of the inventory.
 */

package ObjectOrientedFundamental.Level_1;

import java.util.Scanner;

public class InventoryItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get item details from the user
        System.out.println("Enter the name of the item");
        String name = sc.next();

        System.out.println("Enter the price of the item");
        double price = sc.nextDouble();

        System.out.println("Enter the quantity of the item");
        int quantity = sc.nextInt();

        // Create an inventory object and set its details
        Inventory obj = new Inventory();
        obj.setName(name);
        obj.setPrice(price);
        obj.setQuantity(quantity);

        // Display the item details and calculate its total value
        System.out.println("Item Name: " + obj.getName());
        System.out.println("Item Price: " + obj.getPrice());
        System.out.println("Item Quantity: " + obj.getQuantity());
        System.out.println("Total Value of Inventory: " + (obj.getPrice() * obj.getQuantity()));
    }
}

class Inventory {
    private String name;
    private double price;
    private int quantity;

    // Set the item name
    public void setName(String name) {
        this.name = name;
    }

    // Set the item price
    public void setPrice(double price) {
        this.price = price;
    }

    // Set the item quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Return the item name
    public String getName() {
        return this.name;
    }

    // Return the item price
    public double getPrice() {
        return this.price;
    }

    // Return the item quantity
    public int getQuantity() {
        return this.quantity;
    }
}