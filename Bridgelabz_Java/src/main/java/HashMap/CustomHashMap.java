/*
 * Program: Custom HashMap Implementation
 * This program creates a simple HashMap using an array and linked list.
 */

package HashMap;

class Node {
    int key;
    String value;
    Node next;

    Node(int key, String value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}

class myHashMap {
    Node[] table;
    int capacity = 5;

    myHashMap() {
        table = new Node[capacity];
    }

    // Converts the key into an array index where we can store the data
    public int getIndex(int key) {
        return Math.abs(key) % capacity;
    }

    // Adds a new key-value pair to the HashMap
    public void put(int key, String value) {
        int index = getIndex(key);

        // If this position is empty, directly store the new node here
        if (table[index] == null) {
            table[index] = new Node(key, value);
            return;
        }

        // There is already something at this index, so we check the linked list
        Node current = table[index];

        while (true) {

            // If the key already exists, update its value
            if (current.key == key) {
                current.value = value;
                return;
            }

            // We reached the last node, so a new node can be added here
            if (current.next == null) {
                break;
            }

            // Move to the next node and continue checking
            current = current.next;
        }

        // Add the new key-value pair at the end of the linked list
        current.next = new Node(key, value);
    }

    // Searches for a key and returns its corresponding value
    public String get(int key) {
        int index = getIndex(key);

        // Start searching from the first node at this index
        Node current = table[index];

        while (current != null) {

            // We found the key, so return its value
            if (current.key == key) {
                return current.value;
            }

            // Key was not found here, so move to the next node
            current = current.next;
        }

        // The key does not exist in the HashMap
        return null;
    }

    // Removes a key-value pair from the HashMap
    public void remove(int key) {
        int index = getIndex(key);

        Node current = table[index];

        // Nothing exists at this index, so there is nothing to remove
        if (current == null) {
            return;
        }

        // If the first node itself contains the key, remove it
        if (current.key == key) {
            table[index] = current.next;
            return;
        }

        // Search through the linked list for the key
        while (current.next != null) {

            // If the next node contains the key, skip that node
            if (current.next.key == key) {
                current.next = current.next.next;
                return;
            }

            // Move forward in the linked list
            current = current.next;
        }
    }
}

public class CustomHashMap {
    public static void main(String[] args) {

        // Create our own HashMap
        myHashMap map = new myHashMap();

        // Add some key-value pairs
        map.put(12, "Akhil");
        map.put(7, "Ravi");
        map.put(15, "Priya");

        // Get values using their keys
        System.out.println(map.get(12));
        System.out.println(map.get(7));
        System.out.println(map.get(15));

        // The key 12 already exists, so its value will be updated
        map.put(12, "Kumar");

        System.out.println(map.get(12));

        // Remove the key 7 from the HashMap
        map.remove(7);

        // Since key 7 was removed, this will print null
        System.out.println(map.get(7));
    }
}