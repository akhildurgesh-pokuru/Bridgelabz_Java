import java.util.Scanner;

public class InventoryItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the item");
        String name = sc.next();

        System.out.println("Enter the price of the item");
        double price = sc.nextDouble();

        System.out.println("Enter the quantity of the item");
        int quantity = sc.nextInt();

        Inventory obj = new Inventory();
        obj.setName(name);
        obj.setPrice(price);
        obj.setQuantity(quantity);

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

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    
}