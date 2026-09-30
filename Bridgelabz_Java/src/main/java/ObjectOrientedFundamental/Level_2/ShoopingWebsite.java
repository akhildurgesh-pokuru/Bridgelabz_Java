/*
 * Project: Shopping Website
 *
 * This program simulates a simple shopping website where the user
 * can add products to a cart, remove products, view cart details,
 * and check the available products.
 */

package ObjectOrientedFundamental.Level_2;

import java.util.Scanner;

public class ShoopingWebsite {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean turns = true;
        shooping obj = new shooping();

        System.out.println("*****Welcome to shopping website*****");
        System.out.println("1. iphone Rs-100000");
        System.out.println("2. Laptop Rs-98000");
        System.out.println("3. speaker-2000");

        while (turns) {
            System.out.println("*****Welcome to shopping website*****");
            System.out.println("1. Want to add to cart");
            System.out.println("2. Want to delete to cart");
            System.out.println("3. Display the total cart price");
            System.out.println("4. Check Products");
            System.out.println("Enter the operation to perform");
            int choice = sc.nextInt();

            // Perform the operation selected by the user
            switch(choice) {
                case 1 : obj.add_to_cart();
                    break;

                case 2 : obj.remove_from_cart();
                    break;

                case 3 : obj.display_cart_items();
                    break;

                case 4 : obj.application_items();
                    break;

                default : System.out.println("Please enter a valid operation");
                    break;
            }

            // Ask whether the user wants to continue shopping
            System.out.println("Need to perform another operation (0/1)");
            int value = sc.nextInt();

            if(value == 1) {
                turns = true;
            } else {
                turns = false;
            }
        }
    }
}

class shooping {
    public static final Scanner sc = new Scanner(System.in);

    String[] item_name = new String[10];
    int[] price = new int[10];
    double[] quantity = new double[10];

    int k = 0;

    // Add a selected product and its quantity to the cart
    public void add_to_cart() {
        for (int i = 0; i < 10; i++) {
            if(item_name[i] == null) {
                System.out.println("Enter the product which do you want to add to cart");
                int productid = sc.nextInt();

                System.out.println("Enter the quantity of items to purchase");
                int quant = sc.nextInt();

                if(productid == 1) {
                    item_name[i] = "iphone";
                    price[i] = 100000;
                    quantity[i] = quant;

                } else if(productid == 2) {
                    item_name[i] = "laptop";
                    price[i] = 98000;
                    quantity[i] = quant;

                } else if(productid == 3) {
                    item_name[i] = "speaker";
                    price[i] = 2000;
                    quantity[i] = quant;
                }

                break;
            } else {
                continue;
            }
        }

        System.out.println("Product added successfully");
    }

    // Remove a product from the cart using its name
    public void remove_from_cart() {
        System.out.println("Enter the product name");
        String name = sc.next();

        for(int i = 0; i < 10; i++) {
            if(name.equals(item_name[i])) {
                item_name[i] = null;
                price[i] = 0;
                quantity[i] = 0;
            }
        }

        System.out.println("Product removed Successfully");
    }

    // Display all products currently present in the cart
    public void display_cart_items() {
        for(int i = 0; i < item_name.length; i++) {
            if(item_name[i] != null) {
                System.out.println("Item-" + i + 1);
                System.out.println("Item: " + item_name[i]);
                System.out.println("Price: " + price[i]);
                System.out.println("Quantity: " + quantity[i]);
                System.out.println("Total price: " + (price[i] * quantity[i]));
            }
        }
    }

    // Display the list of products available for purchase
    public void application_items() {
        System.out.println("*****Welcome to shopping website*****");
        System.out.println("1. iphone Rs-100000");
        System.out.println("2. Laptop Rs-98000");
        System.out.println("3. speaker-2000");
    }
}