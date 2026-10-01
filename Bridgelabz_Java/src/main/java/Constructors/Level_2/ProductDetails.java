/*
 * This program keeps track of the total number of products created.
 * Each product object stores its own name and price, while the
 * total_products variable is shared by all product objects.
 * Whenever a new product is created, the total product count increases.
 * At the end, the program displays the details of each product
 * and the total number of products created.
 */

package Constructors.Level_2;

import java.util.Scanner;

class product {
    String name;
    int price;
    static int total_products;

    // Constructor used to initialize the product details
    // and increase the total product count.
    product(String name, int price) {
        this.name = name;
        this.price = price;
        total_products++;
    }

    // Displays the details of the product.
    public void display_product_details() {
        System.out.println("Product Details");
        System.out.println("Name of Product: " + name);
        System.out.println("Price of Product: " + price);
    }

    // Displays the total number of products created.
    public static void totalproducts() {
        System.out.println("Total products: " + total_products);
    }
}

public class ProductDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating two product objects.
        // Each object increases the shared total_products count.
        product obj = new product("iphone", 97000);
        product obj2 = new product("speaker", 2000);

        // Displaying the details of both products.
        obj.display_product_details();
        System.out.println();

        obj2.display_product_details();
        System.out.println();

        // Displaying the total number of products created.
        product.totalproducts();
    }
}