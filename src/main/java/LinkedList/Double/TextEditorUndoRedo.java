package LinkedList.Double;

/*
This program implements text editor undo and redo using a doubly linked list.
It stores text states, moves backward or forward through edits, and keeps only the latest ten states.
*/

public class TextEditorUndoRedo {

    static class Node {
        String text;
        Node prev, next;

        Node(String text) {
            this.text = text;
        }
    }

    Node head, current;
    int size = 0;
    static final int LIMIT = 10;

    // Save a new state after an editing action.
    void addState(String text) {
        Node n = new Node(text);

        // New edits remove the redo history after the current state.
        if (current != null) {
            Node discarded = current.next;

            while (discarded != null) {
                size--;
                discarded = discarded.next;
            }

            current.next = null;
        }

        if (current == null) {
            head = current = n;
        } else {
            current.next = n;
            n.prev = current;
            current = n;
        }

        size++;

        // Remove the oldest states when the limit is exceeded.
        while (size > LIMIT) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // Undo moves to the previous saved state.
    void undo() {
        if (current != null && current.prev != null)
            current = current.prev;
        else
            System.out.println("Nothing to undo");
    }

    // Redo moves to the next saved state.
    void redo() {
        if (current != null && current.next != null)
            current = current.next;
        else
            System.out.println("Nothing to redo");
    }

    // Display the currently active text.
    void displayCurrent() {
        if (current == null)
            System.out.println("Editor is empty");
        else
            System.out.println("Current Text: " + current.text);
    }

    // Display all stored states from oldest to newest.
    void displayAll() {
        Node c = head;

        while (c != null) {
            String marker = c == current ? " <-- Current" : "";
            System.out.println(c.text + marker);
            c = c.next;
        }
    }

    public static void main(String[] args) {
        TextEditorUndoRedo editor = new TextEditorUndoRedo();

        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");

        editor.displayCurrent();

        editor.undo();
        editor.displayCurrent();

        editor.redo();
        editor.displayCurrent();

        System.out.println("All States:");
        editor.displayAll();
    }
}
