package Streams;

import java.util.Arrays;
import java.util.List;

public class PassingStudents {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(35,60,45,90,72,25);

        list.stream()
                .filter(t->t>=45)
                .forEach(System.out::println);
    }
}
