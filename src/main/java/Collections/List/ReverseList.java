
/*
 * This program demonstrates reversing an array and a singly linked list.
 * It uses a two-pointer approach for the array and pointer manipulation for the linked list.
 */

package Collections.List;

import java.util.LinkedList;

class list {
    int data;
    list next;

    list(int x) {
        this.data = x;
        this.next = null;
    }
}

class reverseOperations {
    list head = null, current = null;

    // Reverses the array by swapping elements from both ends.
    public int[] arraylist(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        return arr;
    }

    // Creates a new node and adds it to the end of the linked list.
    public void createLinkedList(int x) {
        list newnode = new list(x);
        if (head == null) {
            current = head = newnode;
        } else {
            current.next = newnode;
            current = newnode;
        }
    }

    // Reverses the linked list by changing the direction of its links.
    public void reverseLinkedList() {
        list prev = null, curr = head, next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Updates the head to point to the new first node.
        head = prev;

        // Prints the linked list after reversing it.
        list temp = head;
        while (temp != null) {
            System.out.print(" " + temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

}

public class ReverseList {
    public static void main(String[] args) {
        reverseOperations list = new reverseOperations();
        int[] arr = {1, 2, 3, 4, 5};

        // Reverses the array and prints its elements.
        list.arraylist(arr);

        for (int i : arr) {
            System.out.print(" " + i);
        }

        System.out.println();

        // Creates a linked list containing three nodes.
        list.createLinkedList(10);
        list.createLinkedList(20);
        list.createLinkedList(30);

        // Reverses the linked list and displays the result.
        list.reverseLinkedList();

    }
}
