package Streams;

import java.util.Arrays;
import java.util.List;

public class SelectAndNultiply {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(10,50,20,70,45);
        list.stream()
                .filter(t->t>20)
                .map(t->t*2)
                .forEach(System.out::println);
    }
}
