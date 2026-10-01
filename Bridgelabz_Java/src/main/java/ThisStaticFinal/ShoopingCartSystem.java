/*
 * Program to demonstrate a Shopping Cart System
 * using static, final, this, method parameters, and instanceof concepts.
 */

package ThisStaticFinal;

class shooping {
    // Static discount is shared by all shopping objects.
    static double discount = 30;

    // final product ID cannot be changed after initialization.
    final int product_id;

    String product_name;
    double price;
    int quantity;

    shooping(int product_id, String product_name, double price, int quantity) {
        // Initialize product details using the current object.
        this.product_id = product_id;
        this.product_name = product_name;

        // Calculate the discount amount from the original price.
        double a = (double) (discount / 100) * price;

        // Store the price after applying the initial discount.
        this.price = (price - a);
        this.quantity = quantity;
    }

    // Modify the price of products when the discount percentage changes.
    public void modify_price(double discount, double old_discount, shooping obj, shooping obj1) {

        // Calculate the price adjustment based on the difference in discounts.
        double amount1 = ((discount - old_discount) / 100) * (obj.price);
        double amount2 = ((discount - old_discount) / 100) * (obj1.price);

        // If the new discount is higher, reduce the product prices.
        if (old_discount < discount) {
            obj.price -= amount1;
            obj1.price -= amount2;
        } else {
            // If the discount is reduced, increase the product prices.
            obj.price += amount1;
            obj1.price += amount2;
        }
    }

    // Static method to change the common discount for all products.
    public static void modify_discount(double discount, shooping obj, shooping obj1) {

        // Store the current discount before changing it.
        double old_discount = shooping.discount;

        // Update the prices based on the new discount.
        obj.modify_price(discount, old_discount, obj, obj1);

        // Update the static discount value.
        shooping.discount = discount;
    }

    // Display all details of a shopping item.
    public void display_shooping_items() {
        System.out.println("Product ID: " + product_id);
        System.out.println("Product name: " + product_name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount);
    }
}

public class ShoopingCartSystem {
    public static void main(String[] args) {

        // Create two shopping product objects.
        shooping obj = new shooping(1001, "charger", 900, 10);
        shooping obj1 = new shooping(1005, "book", 80, 100);

        // Display the initial details of the first product.
        obj.display_shooping_items();
        System.out.println();

        // Display the initial details of the second product.
        obj1.display_shooping_items();
        System.out.println();

        // Change the common discount from 30% to 40%.
        shooping.modify_discount(40, obj, obj1);

        System.out.println("Product Details after discount");

        // Display the updated details of the first product.
        obj.display_shooping_items();
        System.out.println();

        // Display the updated details of the second product.
        obj1.display_shooping_items();
        System.out.println();

        // Check whether obj is an instance of the shooping class.
        if (obj instanceof shooping) {
            System.out.println("Yeah! obj is instance of shooping");
        }
    }
}