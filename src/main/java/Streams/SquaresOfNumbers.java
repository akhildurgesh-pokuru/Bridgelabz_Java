package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class SquaresOfNumbers {
    public static void main(String[] args){

        List<Integer> list = Arrays.asList(10,50,20,40);

        Function<Integer, Integer> number = new Function<>(){

            public Integer apply(Integer integer){
                return integer*integer;
            }
        };

        list.stream()
                .map(number)
                .forEach(System.out::println);

    }
}
