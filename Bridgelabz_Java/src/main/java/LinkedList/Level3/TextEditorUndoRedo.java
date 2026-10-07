/*
 * This program implements an undo and redo feature for a text editor using a doubly linked list.
 * It stores text states and allows the user to move backward and forward between previous changes.
 */

package LinkedList.Level3;

import java.util.LinkedList;

// Node class representing one saved text state
class TextState {

    String text;

    // Points to the previous text state
    TextState prev;

    // Points to the next text state
    TextState next;

    // Constructor to initialize the text state
    TextState(String text) {
        this.text = text;

        // Initially, there is no previous or next state
        this.prev = null;
        this.next = null;
    }
}

// Class containing text editor operations
class TextEditor {

    // Head points to the oldest text state
    TextState head = null;

    // Tail points to the latest text state
    TextState tail = null;

    // Current points to the text state currently being viewed
    TextState current = null;

    // Stores the number of states currently in history
    int size = 0;

    // Maximum number of states that can be stored
    int maxHistory = 10;

    // Adds a new text state to the history
    public void addState(String text) {

        // Create a new node for the new text
        TextState newState = new TextState(text);

        // If this is the first text state
        if (head == null) {

            // Head, tail, and current all point to the new state
            head = tail = current = newState;

            // There is only one state in the history
            size = 1;
            return;
        }

        // If current has a next state, it means redo history exists
        if (current.next != null) {

            // Remove the redo history by disconnecting the next node
            current.next = null;

            // Current becomes the last state
            tail = current;

            // Reset the size before recounting the remaining states
            size = 0;

            // Start from the head to count all remaining states
            TextState temp = head;

            // Traverse the list and count each state
            while (temp != null) {
                size++;
                temp = temp.next;
            }
        }

        // Connect the new state to the current state
        newState.prev = current;

        // Connect the current state to the new state
        current.next = newState;

        // Move current to the newly added state
        current = newState;

        // The new state becomes the latest state
        tail = newState;

        // Increase the history size
        size++;

        // Check whether the history limit has been exceeded
        if (size > maxHistory) {

            // Remove the oldest state
            head = head.next;

            // The new head should not have a previous state
            head.prev = null;

            // Decrease the history size
            size--;
        }
    }

    // Moves to the previous text state
    public void undo() {

        // Undo is not possible if there is no previous state
        if (current == null || current.prev == null) {
            System.out.println("Nothing to undo");
            return;
        }

        // Move current one step backward
        current = current.prev;
    }

    // Moves to the next text state
    public void redo() {

        // Redo is not possible if there is no next state
        if (current == null || current.next == null) {
            System.out.println("Nothing to redo");
            return;
        }

        // Move current one step forward
        current = current.next;
    }

    // Displays the text at the current state
    public void displayCurrentState() {

        // Check whether there is any text state
        if (current == null) {
            System.out.println("No text available");
            return;
        }

        // Display the current text
        System.out.println("Current Text: " + current.text);
    }
}

// Main class for the Text Editor Undo and Redo program
public class TextEditorUndoRedo {

    public static void main(String[] args) {

        // Create a TextEditor object
        TextEditor editor = new TextEditor();

        // Add different text states to the editor
        editor.addState("Hello");
        editor.addState("Hello Akhil");
        editor.addState("Hello Akhil Durgesh");
        editor.addState("Hello Akhil Durgesh!");

        // Display the latest text
        editor.displayCurrentState();

        // Move one step backward using undo
        editor.undo();
        editor.displayCurrentState();

        // Move another step backward using undo
        editor.undo();
        editor.displayCurrentState();

        // Move one step forward using redo
        editor.redo();
        editor.displayCurrentState();

        // Add a new text state
        editor.addState("Hello Akhil Kumar");
        editor.displayCurrentState();

        // Try to move forward using redo
        editor.redo();
    }
}