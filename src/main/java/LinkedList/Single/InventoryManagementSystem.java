package LinkedList.Single;

/*
This program manages inventory items using a singly linked list.
It supports adding, removing, updating, searching, sorting, and calculating total inventory value.
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class InventoryManagementSystem {

    static class Node {
        String name;
        int id, quantity;
        double price;
        Node next;

        Node(String name, int id, int quantity, double price) {
            this.name = name;
            this.id = id;
            this.quantity = quantity;
            this.price = price;
        }
    }

    Node head;

    // Add an item at a given 1-based position.
    void add(String name, int id, int quantity, double price, int pos) {
        if (pos < 1) {
            System.out.println("Invalid position");
            return;
        }

        Node n = new Node(name, id, quantity, price);

        if (pos == 1) {
            n.next = head;
            head = n;
            return;
        }

        Node c = head;

        // Stop at the node immediately before the required position.
        for (int i = 1; c != null && i < pos - 1; i++)
            c = c.next;

        if (c == null) {
            System.out.println("Invalid position");
            return;
        }

        n.next = c.next;
        c.next = n;
    }

    // Remove an item by its unique ID.
    void remove(int id) {
        if (head == null)
            return;

        if (head.id == id) {
            head = head.next;
            return;
        }

        Node c = head;

        while (c.next != null && c.next.id != id)
            c = c.next;

        if (c.next != null)
            c.next = c.next.next;
        else
            System.out.println("Item not found");
    }

    // Update the available quantity of an item.
    void updateQuantity(int id, int quantity) {
        Node c = head;

        while (c != null) {
            if (c.id == id) {
                c.quantity = quantity;
                return;
            }
            c = c.next;
        }

        System.out.println("Item not found");
    }

    // Search using either the item ID or its name.
    void search(String key) {
        Node c = head;
        boolean found = false;

        while (c != null) {
            if (String.valueOf(c.id).equals(key)
                    || c.name.equalsIgnoreCase(key)) {
                show(c);
                found = true;
            }
            c = c.next;
        }

        if (!found)
            System.out.println("Item not found");
    }

    // Calculate the total value of all available stock.
    double totalValue() {
        double total = 0;
        Node c = head;

        while (c != null) {
            total += c.price * c.quantity;
            c = c.next;
        }

        return total;
    }

    // Copy nodes into a list so they can be sorted and relinked.
    void sort(String field, boolean ascending) {
        List<Node> items = new ArrayList<>();
        Node c = head;

        while (c != null) {
            items.add(c);
            c = c.next;
        }

        Comparator<Node> comparator;

        if (field.equalsIgnoreCase("name"))
            comparator = Comparator.comparing(n -> n.name.toLowerCase());
        else if (field.equalsIgnoreCase("price"))
            comparator = Comparator.comparingDouble(n -> n.price);
        else {
            System.out.println("Sort by name or price");
            return;
        }

        if (!ascending)
            comparator = comparator.reversed();

        items.sort(comparator);

        // Rebuild the linked list in the new sorted order.
        head = null;
        Node tail = null;

        for (Node item : items) {
            item.next = null;

            if (head == null)
                head = item;
            else
                tail.next = item;

            tail = item;
        }
    }

    // Print the details of one inventory item.
    void show(Node n) {
        System.out.println("ID: " + n.id + ", Name: " + n.name
                + ", Quantity: " + n.quantity + ", Price: " + n.price);
    }

    void display() {
        Node c = head;

        while (c != null) {
            show(c);
            c = c.next;
        }
    }

    public static void main(String[] args) {
        InventoryManagementSystem inv = new InventoryManagementSystem();

        inv.add("Laptop", 101, 5, 45000, 1);
        inv.add("Mouse", 102, 20, 500, 2);
        inv.add("Keyboard", 103, 10, 1200, 3);

        System.out.println("Inventory:");
        inv.display();

        inv.updateQuantity(102, 25);

        System.out.println("Search:");
        inv.search("Laptop");

        System.out.println("Total Inventory Value: " + inv.totalValue());

        // Sort by item name in ascending order.
        inv.sort("name", true);
        System.out.println("Sorted Inventory:");
        inv.display();

        inv.remove(103);
        System.out.println("After Removal:");
        inv.display();
    }
}