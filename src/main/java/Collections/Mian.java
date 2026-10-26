
/*
 * This program demonstrates Java generics by storing different types of dry fruits in generic boxes.
 * It also demonstrates overriding toString(), retrieving objects, and using a generic swap method.
 */

package Collections;

import java.util.ArrayList;

class Almonds {
    String name;

    Almonds(String name) {
        this.name = name;
    }

    // Returns the almond's name in a readable format.
    @Override
    public String toString() {
        return "Almond- name: " + name + " ";
    }
}

class Cashew {
    String name;

    Cashew(String name) {
        this.name = name;
    }

    // Returns the cashew's name in a readable format.
    @Override
    public String toString() {
        return "Cashew- name: " + name + " ";
    }
}

// A generic box that can store objects of a specified type.
class Box<T> {
    T[] dryfruits;
    int index;

    Box(int size) {
        this.dryfruits = (T[]) new Object[size];
        this.index = 0;
    }

    // Adds a dry fruit to the next available position in the box.
    public void add(T almond) {
        dryfruits[index] = almond;
        index++;
    }

    // Returns the dry fruit stored at the specified position.
    public T get(int index) {
        return dryfruits[index];
    }
}

public class Mian {
    public static void main(String[] args) {

        // Creates a box that stores Almonds objects.
        Box<Almonds> almond_box = new Box<>(5);
        almond_box.add(new Almonds("badam"));
        almond_box.add(new Almonds("geedi"));

        // Creates a separate box that stores Cashew objects.
        Box<Cashew> cashew_box = new Box<>(5);
        cashew_box.add(new Cashew("cherry"));
        cashew_box.add(new Cashew("seed"));

        // Retrieves and prints dry fruits from the specified positions.
        System.out.println(almond_box.get(1));
        System.out.println(cashew_box.get(0));

        // Calls the generic swap method with integers and strings.
        swap(10, 20);
        swap("hello", "world");

        ArrayList<Integer> arr = new ArrayList<>();

    }

    // Swaps two local variable values and prints the resulting values.
    public static <T> void swap(T i, T j) {
        T temp = i;
        i = j;
        j = temp;
        System.out.println("i: " + i);
        System.out.println("j: " + j);
    }
}
