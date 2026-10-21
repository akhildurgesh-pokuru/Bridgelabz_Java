package Collections;

import java.util.ArrayList;
import java.util.List;

class mangos{
    String name;
    mangos(String name){
        this.name = name;
    }
}

class pineapple{
    String name;
    pineapple(String name){
        this.name = name;
    }
}

class grapes{
    String name;
    grapes(String name){
        this.name = name;
    }
}

class Students{
    int class_number;
    String name;
    Students(int class_number, String name){
        this.class_number = class_number;
        this.name = name;
    }

    public void displayInfo(){
        System.out.println("name: "+name);
        System.out.println("Class Number: "+class_number);
    }
}

class FruitsBox<T>{
    T[] fruits;
    int index;

    FruitsBox(int size){
        fruits = (T[]) new Object[size];
        index = -1;
    }

    public void addFruits(T mango){
        index++;
        fruits[index] = mango;
    }

    public T getFruits(int index){
        return fruits[index];
    }
}

class StudentsBox<T extends Students>{
    List<T> students = new ArrayList<>();

    public void addStudent(T student){
        students.add(student);
    }

    public void displayStudents(){
        for(T student : students){
            student.displayInfo();
        }
    }

}



public class random {
    public static void main(String[] args){
        FruitsBox<mangos> mango_box = new FruitsBox<>(10);
        FruitsBox<grapes> grape_box = new FruitsBox<>(10);

        mango_box.addFruits(new mangos("south mango"));
        mango_box.addFruits(new mangos("north mango"));

        grape_box.addFruits(new grapes("north grapes"));
        grape_box.addFruits(new grapes("south grapes"));

        System.out.println(mango_box.getFruits(0).name);
        System.out.println(grape_box.getFruits(1).name);

        StudentsBox<Students> student = new StudentsBox<>();
        student.addStudent(new Students(12,"akhil"));

        random r = new random();
        r.swap(10,20);

    }

    public <T extends Number> void swap(T a, T b){
        T temp = a;
        a = b;
        b = temp;
        System.out.println("a: "+a+" b: "+b);
    }
}
