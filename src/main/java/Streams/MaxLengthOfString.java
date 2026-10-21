package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class MaxLengthOfString {
    public static void main(String[] args){
        List<String> li = Arrays.asList("akhil","durgesh");

        String word = String.valueOf(li.stream()
                        .max(Comparator.comparingInt(String::length)));

                System.out.println(word);

    }
}
