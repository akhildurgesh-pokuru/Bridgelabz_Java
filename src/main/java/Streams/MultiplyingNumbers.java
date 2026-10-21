package Streams;

import java.util.Arrays;
import java.util.List;

public class MultiplyingNumbers {
    public static void main(String[] args){
        List<Integer> l = Arrays.asList(10,20,30,40);
                l.stream()
                .map(t->t*2)
                .forEach(System.out::println);
    }
}
