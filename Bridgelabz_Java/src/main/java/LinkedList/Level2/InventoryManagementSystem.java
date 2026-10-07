package LinkedList.Level2;

/*
 * ============================================================
 * Program: Inventory Management System
 * Data Structure: Singly Linked List
 *
 * Each node stores:
 * Item Name
 * Item ID
 * Quantity
 * Price
 *
 * Operations:
 * 1. Add item at beginning
 * 2. Add item at end
 * 3. Add item at a specific position
 * 4. Remove item by Item ID
 * 5. Update quantity by Item ID
 * 6. Search item by ID or Name
 * 7. Calculate total inventory value
 * 8. Sort by Item Name or Price
 * ============================================================
 */

import java.util.Scanner;

public class InventoryManagement {

    // Node represents one inventory item
    static class Node {
        String itemName;
        int itemId;
        int quantity;
        double price;
        Node next;

        // Constructor to create an item
        Node(String itemName, int itemId, int quantity, double price) {
            this.itemName = itemName;
            this.itemId = itemId;
            this.quantity = quantity;
            this.price = price;
            this.next = null;
        }
    }

    Node head = null;

    // ---------------------------------------------------------
    // Add item at the beginning
    // ---------------------------------------------------------
    void addAtBeginning(String name, int id, int quantity, double price) {

        Node newNode = new Node(name, id, quantity, price);

        // New node becomes the first node
        newNode.next = head;
        head = newNode;

        System.out.println("Item added at beginning.");
    }

    // ---------------------------------------------------------
    // Add item at the end
    // ---------------------------------------------------------
    void addAtEnd(String name, int id, int quantity, double price) {

        Node newNode = new Node(name, id, quantity, price);

        // If list is empty, new node becomes head
        if (head == null) {
            head = newNode;
            System.out.println("Item added at end.");
            return;
        }

        // Traverse to the last node
        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        // Connect last node to new node
        current.next = newNode;

        System.out.println("Item added at end.");
    }

    // ---------------------------------------------------------
    // Add item at a specific position
    // Position starts from 1
    // ---------------------------------------------------------
    void addAtPosition(String name, int id, int quantity,
                       double price, int position) {

        Node newNode = new Node(name, id, quantity, price);

        // Position 1 means adding at beginning
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            System.out.println("Item added at position " + position);
            return;
        }

        Node current = head;

        // Move to the node before the required position
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        // Position is invalid
        if (current == null) {
            System.out.println("Invalid position.");
            return;
        }

        // Insert the new node
        newNode.next = current.next;
        current.next = newNode;

        System.out.println("Item added at position " + position);
    }

    // ---------------------------------------------------------
    // Remove item using Item ID
    // ---------------------------------------------------------
    void removeItem(int id) {

        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }

        // If the item is the first node
        if (head.itemId == id) {
            head = head.next;
            System.out.println("Item removed successfully.");
            return;
        }

        Node current = head;

        // Search for the item
        while (current.next != null &&
                current.next.itemId != id) {

            current = current.next;
        }

        // Item not found
        if (current.next == null) {
            System.out.println("Item not found.");
            return;
        }

        // Skip the node that needs to be removed
        current.next = current.next.next;

        System.out.println("Item removed successfully.");
    }

    // ---------------------------------------------------------
    // Update quantity using Item ID
    // ---------------------------------------------------------
    void updateQuantity(int id, int newQuantity) {

        Node current = head;

        while (current != null) {

            if (current.itemId == id) {
                current.quantity = newQuantity;
                System.out.println("Quantity updated successfully.");
                return;
            }

            current = current.next;
        }

        System.out.println("Item not found.");
    }

    // ---------------------------------------------------------
    // Search item by Item ID
    // ---------------------------------------------------------
    void searchById(int id) {

        Node current = head;

        while (current != null) {

            if (current.itemId == id) {
                displayItem(current);
                return;
            }

            current = current.next;
        }

        System.out.println("Item not found.");
    }

    // ---------------------------------------------------------
    // Search item by Item Name
    // ---------------------------------------------------------
    void searchByName(String name) {

        Node current = head;

        while (current != null) {

            if (current.itemName.equalsIgnoreCase(name)) {
                displayItem(current);
                return;
            }

            current = current.next;
        }

        System.out.println("Item not found.");
    }

    // ---------------------------------------------------------
    // Display one item
    // ---------------------------------------------------------
    void displayItem(Node node) {

        System.out.println("----------------------------");
        System.out.println("Item Name : " + node.itemName);
        System.out.println("Item ID   : " + node.itemId);
        System.out.println("Quantity  : " + node.quantity);
        System.out.println("Price     : " + node.price);
        System.out.println("----------------------------");
    }

    // ---------------------------------------------------------
    // Display all inventory items
    // ---------------------------------------------------------
    void displayInventory() {

        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }

        Node current = head;

        System.out.println("\n===== INVENTORY =====");

        while (current != null) {

            displayItem(current);

            current = current.next;
        }
    }

    // ---------------------------------------------------------
    // Calculate total value
    // Total = Price * Quantity
    // ---------------------------------------------------------
    void calculateTotalValue() {

        double total = 0;

        Node current = head;

        while (current != null) {

            total += current.price * current.quantity;

            current = current.next;
        }

        System.out.println("Total Inventory Value = " + total);
    }

    // ---------------------------------------------------------
    // Sort inventory by Item Name
    // ascending = true  -> Ascending
    // ascending = false -> Descending
    // ---------------------------------------------------------
    void sortByName(boolean ascending) {

        if (head == null || head.next == null) {
            return;
        }

        Node current = head;

        // Bubble sort by changing node data
        while (current != null) {

            Node nextNode = current.next;

            while (nextNode != null) {

                int result = current.itemName
                        .compareToIgnoreCase(nextNode.itemName);

                if ((ascending && result > 0) ||
                        (!ascending && result < 0)) {

                    swapData(current, nextNode);
                }

                nextNode = nextNode.next;
            }

            current = current.next;
        }

        System.out.println("Inventory sorted by Item Name.");
    }

    // ---------------------------------------------------------
    // Sort inventory by Price
    // ---------------------------------------------------------
    void sortByPrice(boolean ascending) {

        if (head == null || head.next == null) {
            return;
        }

        Node current = head;

        while (current != null) {

            Node nextNode = current.next;

            while (nextNode != null) {

                if ((ascending && current.price > nextNode.price) ||
                        (!ascending && current.price < nextNode.price)) {

                    swapData(current, nextNode);
                }

                nextNode = nextNode.next;
            }

            current = current.next;
        }

        System.out.println("Inventory sorted by Price.");
    }

    // ---------------------------------------------------------
    // Swap data between two nodes
    // ---------------------------------------------------------
    void swapData(Node a, Node b) {

        String tempName = a.itemName;
        int tempId = a.itemId;
        int tempQuantity = a.quantity;
        double tempPrice = a.price;

        a.itemName = b.itemName;
        a.itemId = b.itemId;
        a.quantity = b.quantity;
        a.price = b.price;

        b.itemName = tempName;
        b.itemId = tempId;
        b.quantity = tempQuantity;
        b.price = tempPrice;
    }

    // ---------------------------------------------------------
    // Main method
    // ---------------------------------------------------------
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        InventoryManagement inventory =
                new InventoryManagement();

        // Adding sample inventory items
        inventory.addAtEnd("Laptop", 101, 5, 55000);
        inventory.addAtEnd("Keyboard", 102, 10, 1500);
        inventory.addAtEnd("Monitor", 103, 7, 12000);

        // Add item at beginning
        inventory.addAtBeginning("Mouse", 104, 20, 800);

        // Add item at position 3
        inventory.addAtPosition("Printer", 105, 4,
                15000, 3);

        // Display inventory
        inventory.displayInventory();

        // Search item
        System.out.println("\nSearching by ID:");
        inventory.searchById(103);

        System.out.println("\nSearching by Name:");
        inventory.searchByName("Laptop");

        // Update quantity
        inventory.updateQuantity(102, 25);

        // Remove item
        inventory.removeItem(104);

        // Calculate total value
        inventory.calculateTotalValue();

        // Sort by name
        inventory.sortByName(true);
        inventory.displayInventory();

        // Sort by price in descending order
        inventory.sortByPrice(false);
        inventory.displayInventory();

        sc.close();
    }
}