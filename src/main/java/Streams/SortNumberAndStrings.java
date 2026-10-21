package Streams;

import java.util.Arrays;
import java.util.List;

public class SortNumberAndStrings {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(10,30,20,40);
        List<String> words = Arrays.asList("akhil","charan","vishruth");

        list.stream()
                .sorted()
                .forEach(System.out::println);


        words.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
