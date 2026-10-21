package Collections;

import java.util.ArrayList;

class Almonds{
    String name;
    Almonds(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Almond- name: "+name+" ";
    }
}

class Cashew{
    String name;
    Cashew(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Cashew- name: "+name+" ";
    }
}

class Box<T> {
    T[] dryfruits;
    int index;
     Box(int size){
        this.dryfruits = (T[]) new Object[size];
        this.index = 0;
    }

    public void add(T almond){
        dryfruits[index] = almond;
        index++;
    }

    public T get(int index){
        return dryfruits[index];
    }
}



public class Mian {
    public static void main(String[] args){

       Box<Almonds> almond_box = new Box<>(5);
       almond_box.add(new Almonds("badam"));
       almond_box.add(new Almonds("geedi"));

       Box<Cashew> cashew_box = new Box<>(5);
       cashew_box.add(new Cashew("cherry"));
       cashew_box.add(new Cashew("seed"));

       System.out.println(almond_box.get(1));
       System.out.println(cashew_box.get(0));

       swap(10,20);
       swap("hello", "world");

       ArrayList<Integer> arr = new ArrayList<>();

    }

    public static <T> void swap(T i, T j){
        T temp = i;
        i = j;
        j = temp;
        System.out.println("i: "+i);
        System.out.println("j: "+j);
    }
}
