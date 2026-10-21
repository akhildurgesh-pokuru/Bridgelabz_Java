package Streams;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EvenNumbers {
    public static void main(String[] args){
        List<Integer> l = Arrays.asList(10,20,30,40);
        long count = l.stream()
                .filter(t->t%2==0)
                .peek(System.out::println)
                .count();


        System.out.println("total count: "+count);
    }
}
