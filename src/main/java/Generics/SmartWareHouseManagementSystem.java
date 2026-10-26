
/*
 * This program demonstrates a warehouse management system using Java Generics.
 * It stores different warehouse items and displays their details using inheritance.
 */

package Generics;

import java.util.ArrayList;
import java.util.List;

// Abstract base class containing common details for all warehouse items.
abstract class WareHouseItem {
    int id;
    String name;

    WareHouseItem(int id, String name) {
        this.id = id;
        this.name = name;
    }

    abstract public void displayDetails();
}

// Electronics stores the warranty period along with common item details.
class Electronics extends WareHouseItem {
    int warranty_years;

    Electronics(int id, String name, int warranty_years) {
        super(id, name);
        this.warranty_years = warranty_years;
    }

    public void displayDetails() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Warranty years: " + warranty_years);
    }
}

// Groceries stores the number of days until expiry.
class Groceries extends WareHouseItem {
    int expiry_days;

    Groceries(int id, String name, int expiry_days) {
        super(id, name);
        this.expiry_days = expiry_days;
    }

    public void displayDetails() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Expiry Days: " + expiry_days);
    }
}

// Furniture stores the material used to make the item.
class Furniture extends WareHouseItem {
    String material;

    Furniture(int id, String name, String material) {
        super(id, name);
        this.material = material;
    }

    public void displayDetails() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Material: " + material);
    }
}

// Generic storage class that accepts WareHouseItem objects and their subclasses.
class Storage<T extends WareHouseItem> {
    List<T> storage_items;

    Storage() {
        this.storage_items = new ArrayList<>();
    }

    public void addItems(T item) {
        storage_items.add(item);
    }

    public T getItem(int index) {
        return storage_items.get(index);
    }
}

class WareHouseUtility {
    // Display details for any list containing WareHouseItem types or subclasses.
    public void displayAll(List<? extends WareHouseItem> items) {
        for (WareHouseItem item : items) {
            item.displayDetails();
            System.out.println();
        }
    }
}

public class SmartWareHouseManagementSystem {
    public static void main(String[] args) {
        // Create items from different warehouse categories.
        Electronics electronics = new Electronics(121, "smart watch", 2);
        Electronics electronics1 = new Electronics(122, "iphone", 2);
        Groceries groceries = new Groceries(120, "vegetables", 2);
        Furniture furniture = new Furniture(155, "double cart bed", "take");

        // Store all items in one collection using the common parent type.
        Storage<WareHouseItem> storage = new Storage<>();
        storage.addItems(electronics);
        storage.addItems(electronics1);
        storage.addItems(groceries);
        storage.addItems(furniture);

        // Display the details of every stored item.
        WareHouseUtility obj = new WareHouseUtility();
        obj.displayAll(storage.storage_items);

    }
}
