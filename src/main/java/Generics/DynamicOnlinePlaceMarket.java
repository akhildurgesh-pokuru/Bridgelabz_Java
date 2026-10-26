
/*
 * This program demonstrates an online marketplace using Java Generics.
 * It manages different products and applies discounts to update their prices.
 */

package Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.StreamSupport;

// Base class that stores common information for all products.
class Product {
    int prod_id;
    String prod_name;
    double price;

    Product(int prod_id, String prod_name, double price) {
        this.prod_id = prod_id;
        this.prod_name = prod_name;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void displayDetails() {
        System.out.println("ID: " + prod_id);
        System.out.println("name: " + prod_name);
        System.out.println("Price: " + price);
    }
}

// Product categories inherit the common properties of Product.
class Book extends Product {
    Book(int prod_id, String prod_name, double price) {
        super(prod_id, prod_name, price);
    }
}

class Clothing extends Product {
    Clothing(int prod_id, String prod_name, double price) {
        super(prod_id, prod_name, price);
    }

}

class Gadgets extends Product {
    Gadgets(int prod_id, String prod_name, double price) {
        super(prod_id, prod_name, price);
    }

}

// Bounded generics ensure that only Product types or their subclasses are stored.
class StoreProducts<T extends Product> {
    List<T> products;

    StoreProducts() {
        products = new ArrayList<>();
    }

    public void addProducts(T product) {
        products.add(product);
    }

    public void displayDetails() {
        for (T product : products) {
            product.displayDetails();
            System.out.println();
        }
    }
}

class Discount {
    // Calculate the discount and update the product's price.
    public <T extends Product> void applyDiscount(T product, double percentage) {
        double discount = product.getPrice() * percentage / 100;
        double updatedPrice = product.getPrice() - discount;
        product.setPrice(updatedPrice);
    }
}

public class DynamicOnlinePlaceMarket {
    public static void main(String[] args) {
        // Add different product categories to the store.
        StoreProducts<Product> product = new StoreProducts<>();
        product.addProducts(new Book(144, "classmate", 50));
        product.addProducts(new Clothing(155, "pant", 500));
        product.addProducts(new Gadgets(100, "smart watch", 2000));

        // Display the original product prices.
        product.displayDetails();

        Discount discount = new Discount();
        discount.applyDiscount(product.products.get(0), 20);
        discount.applyDiscount(product.products.get(1), 10);

        // Display the updated prices after applying discounts.
        product.displayDetails();
    }
}
