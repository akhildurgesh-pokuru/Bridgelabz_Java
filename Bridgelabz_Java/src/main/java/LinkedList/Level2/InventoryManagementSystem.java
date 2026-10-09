/*
 * Problem: Create an Inventory Management System using a singly linked list.
 * Operations: Add, remove, update, search, calculate value and sort inventory items.
 */

package LinkedList.Level2;

import java.util.Scanner;

class InventoryManagement {

    // Each node represents one item in our inventory
    static class Node {
        String itemName;
        int itemId;
        int quantity;
        double price;
        Node next;

        // Create a new inventory item with all its details
        Node(String itemName, int itemId, int quantity, double price) {
            this.itemName = itemName;
            this.itemId = itemId;
            this.quantity = quantity;
            this.price = price;
            this.next = null;
        }
    }

    Node head = null;

    // Add a new item at the beginning of the list
    void addAtBeginning(String name, int id, int quantity, double price) {

        Node newNode = new Node(name, id, quantity, price);

        // The new item becomes the first item
        newNode.next = head;
        head = newNode;

        System.out.println("Item added at beginning.");
    }

    // Add a new item at the end of the list
    void addAtEnd(String name, int id, int quantity, double price) {

        Node newNode = new Node(name, id, quantity, price);

        // If there are no items, the new item becomes the first item
        if (head == null) {
            head = newNode;
            System.out.println("Item added at end.");
            return;
        }

        Node current = head;

        // Move until we reach the last item
        while (current.next != null) {
            current = current.next;
        }

        // Connect the last item to the new item
        current.next = newNode;

        System.out.println("Item added at end.");
    }

    // Add an item at a particular position
    // Position starts from 1
    void addAtPosition(String name, int id, int quantity,
                       double price, int position) {

        Node newNode = new Node(name, id, quantity, price);

        // Position 1 means the new item should become the first item
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            System.out.println("Item added at position " + position);
            return;
        }

        Node current = head;

        // Move to the item just before the required position
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        // The given position does not exist
        if (current == null) {
            System.out.println("Invalid position.");
            return;
        }

        // Put the new item between the current item and the next item
        newNode.next = current.next;
        current.next = newNode;

        System.out.println("Item added at position " + position);
    }

    // Remove an item using its Item ID
    void removeItem(int id) {

        // There is nothing to remove if the inventory is empty
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }

        // If the first item has this ID, move head to the next item
        if (head.itemId == id) {
            head = head.next;
            System.out.println("Item removed successfully.");
            return;
        }

        Node current = head;

        // Search for the item just before the item we want to remove
        while (current.next != null &&
                current.next.itemId != id) {

            current = current.next;
        }

        // We reached the end, so the item was not found
        if (current.next == null) {
            System.out.println("Item not found.");
            return;
        }

        // Skip the item that needs to be removed
        current.next = current.next.next;

        System.out.println("Item removed successfully.");
    }

    // Update the quantity of an item using its Item ID
    void updateQuantity(int id, int newQuantity) {

        Node current = head;

        // Search through the list for the given Item ID
        while (current != null) {

            if (current.itemId == id) {

                // Change the old quantity to the new quantity
                current.quantity = newQuantity;

                System.out.println("Quantity updated successfully.");
                return;
            }

            // Move to the next item
            current = current.next;
        }

        System.out.println("Item not found.");
    }

    // Search for an item using its Item ID
    void searchById(int id) {

        Node current = head;

        // Check each item until we find the required ID
        while (current != null) {

            if (current.itemId == id) {

                // Display the details when the item is found
                displayItem(current);
                return;
            }

            current = current.next;
        }

        System.out.println("Item not found.");
    }

    // Search for an item using its name
    void searchByName(String name) {

        Node current = head;

        // Check each item until we find the required name
        while (current != null) {

            if (current.itemName.equalsIgnoreCase(name)) {

                // Display the item details when the name matches
                displayItem(current);
                return;
            }

            current = current.next;
        }

        System.out.println("Item not found.");
    }

    // Display the details of one inventory item
    void displayItem(Node node) {

        System.out.println("----------------------------");
        System.out.println("Item Name : " + node.itemName);
        System.out.println("Item ID   : " + node.itemId);
        System.out.println("Quantity  : " + node.quantity);
        System.out.println("Price     : " + node.price);
        System.out.println("----------------------------");
    }

    // Display all items currently present in the inventory
    void displayInventory() {

        // Check whether the inventory has any items
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }

        Node current = head;

        System.out.println("\n===== INVENTORY =====");

        // Go through every item one by one
        while (current != null) {

            displayItem(current);

            current = current.next;
        }
    }

    // Calculate the total value of all items
    // Total value = Price × Quantity
    void calculateTotalValue() {

        double total = 0;

        Node current = head;

        // Calculate the value of each item and add it to total
        while (current != null) {

            total += current.price * current.quantity;

            current = current.next;
        }

        System.out.println("Total Inventory Value = " + total);
    }

    // Sort the inventory according to item name
    // ascending = true  means A to Z
    // ascending = false means Z to A
    void sortByName(boolean ascending) {

        // No need to sort if there are zero or one items
        if (head == null || head.next == null) {
            return;
        }

        Node current = head;

        // Compare each item with the items after it
        while (current != null) {

            Node nextNode = current.next;

            while (nextNode != null) {

                // Compare the names of the two items
                int result = current.itemName
                        .compareToIgnoreCase(nextNode.itemName);

                // Swap when the items are in the wrong order
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

    // Sort the inventory according to price
    void sortByPrice(boolean ascending) {

        // No need to sort if there are zero or one items
        if (head == null || head.next == null) {
            return;
        }

        Node current = head;

        // Compare the price of each item with the items after it
        while (current != null) {

            Node nextNode = current.next;

            while (nextNode != null) {

                // Check whether the two prices are in the wrong order
                if ((ascending && current.price > nextNode.price) ||
                        (!ascending && current.price < nextNode.price)) {

                    // Swap the item details
                    swapData(current, nextNode);
                }

                nextNode = nextNode.next;
            }

            current = current.next;
        }

        System.out.println("Inventory sorted by Price.");
    }

    // Swap the data of two nodes
    void swapData(Node a, Node b) {

        // Temporarily save the first item's details
        String tempName = a.itemName;
        int tempId = a.itemId;
        int tempQuantity = a.quantity;
        double tempPrice = a.price;

        // Put the second item's details into the first node
        a.itemName = b.itemName;
        a.itemId = b.itemId;
        a.quantity = b.quantity;
        a.price = b.price;

        // Put the saved details into the second node
        b.itemName = tempName;
        b.itemId = tempId;
        b.quantity = tempQuantity;
        b.price = tempPrice;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        InventoryManagement inventory =
                new InventoryManagement();

        // Add some inventory items at the end
        inventory.addAtEnd("Laptop", 101, 5, 55000);
        inventory.addAtEnd("Keyboard", 102, 10, 1500);
        inventory.addAtEnd("Monitor", 103, 7, 12000);

        // Add Mouse at the beginning
        inventory.addAtBeginning("Mouse", 104, 20, 800);

        // Add Printer at position 3
        inventory.addAtPosition("Printer", 105, 4,
                15000, 3);

        // Display all the inventory items
        inventory.displayInventory();

        // Search for an item using its ID
        System.out.println("\nSearching by ID:");
        inventory.searchById(103);

        // Search for an item using its name
        System.out.println("\nSearching by Name:");
        inventory.searchByName("Laptop");

        // Update the quantity of Keyboard
        inventory.updateQuantity(102, 25);

        // Remove Mouse from the inventory
        inventory.removeItem(104);

        // Calculate the total value of all inventory
        inventory.calculateTotalValue();

        // Sort items alphabetically by name
        inventory.sortByName(true);
        inventory.displayInventory();

        // Sort items by price from highest to lowest
        inventory.sortByPrice(false);
        inventory.displayInventory();

        sc.close();
    }
}