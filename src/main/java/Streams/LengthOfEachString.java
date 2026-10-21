package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class LengthOfEachString {
    public static void main(String[] args){
        List<String> list = Arrays.asList("akhil","durgesh","vishruth");

        Function<String , Integer> f = new Function<String, Integer>(){
            public Integer apply(String word){
                return word.length();
            }
        };

        list.stream()
                .map(f)
                .forEach(System.out::println);
    }
}
