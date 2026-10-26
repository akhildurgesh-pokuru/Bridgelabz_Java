
/*
 * This program demonstrates Java generics using fruit boxes and student collections.
 * It also demonstrates bounded generics, retrieving stored objects, and swapping numbers.
 */

package Collections;

import java.util.ArrayList;
import java.util.List;

class mangos {
    String name;

    mangos(String name) {
        this.name = name;
    }
}

class pineapple {
    String name;

    pineapple(String name) {
        this.name = name;
    }
}

class grapes {
    String name;

    grapes(String name) {
        this.name = name;
    }
}

// Stores student details and provides a method to display them.
class Students {
    int class_number;
    String name;

    Students(int class_number, String name) {
        this.class_number = class_number;
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("name: " + name);
        System.out.println("Class Number: " + class_number);
    }
}

// A generic box that can store different types of fruit.
class FruitsBox<T> {
    T[] fruits;
    int index;

    FruitsBox(int size) {
        fruits = (T[]) new Object[size];
        index = -1;
    }

    // Adds a fruit to the next available position.
    public void addFruits(T mango) {
        index++;
        fruits[index] = mango;
    }

    // Returns the fruit stored at the specified position.
    public T getFruits(int index) {
        return fruits[index];
    }
}

// Restricts the box to Students objects or their subclasses.
class StudentsBox<T extends Students> {
    List<T> students = new ArrayList<>();

    // Adds a student to the list.
    public void addStudent(T student) {
        students.add(student);
    }

    // Displays the details of every student in the list.
    public void displayStudents() {
        for (T student : students) {
            student.displayInfo();
        }
    }

}

public class FruitsProblem {
    public static void main(String[] args) {

        // Creates separate generic boxes for mangoes and grapes.
        FruitsBox<mangos> mango_box = new FruitsBox<>(10);
        FruitsBox<grapes> grape_box = new FruitsBox<>(10);

        // Adds mangoes and grapes to their respective boxes.
        mango_box.addFruits(new mangos("south mango"));
        mango_box.addFruits(new mangos("north mango"));

        grape_box.addFruits(new grapes("north grapes"));
        grape_box.addFruits(new grapes("south grapes"));

        // Retrieves and prints fruit names from the specified positions.
        System.out.println(mango_box.getFruits(0).name);
        System.out.println(grape_box.getFruits(1).name);

        // Creates a student box and adds a student to it.
        StudentsBox<Students> student = new StudentsBox<>();
        student.addStudent(new Students(12, "akhil"));

        // Creates an object to call the swap method.
        FruitsProblem r = new FruitsProblem();
        r.swap(10, 20);

    }

    // Accepts only Number types and swaps the local parameter values.
    public <T extends Number> void swap(T a, T b) {
        T temp = a;
        a = b;
        b = temp;
        System.out.println("a: " + a + " b: " + b);
    }
}
