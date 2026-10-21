package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Slalaries {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("Akhil", "durgesh", "charan", "vishruth");
        l.stream()
                .map(name -> name.toUpperCase())
                .forEach(System.out::println);
    }
}
