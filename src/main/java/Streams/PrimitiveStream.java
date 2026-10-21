package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class PrimitiveStream {
    public static void main(String[] args){
        // IntStream.range(1,100).filter(t->t%2==0).forEach(System.out::println);

        //IntStream.rangeClosed(1,100).filter(t->t%2==0).forEach(System.out::println);

        // IntStream.iterate(1,t->t+2).forEach(System.out::println);

        //IntStream.iterate(1,t->t+2).limit(10).forEach(System.out::println);

        //IntStream.iterate(1,t->t<=50,t->t+2).forEach(System.out::println);

        //IntStream.iterate(1,t->t+3).limit(50).skip(10).forEach(System.out::println);

        //IntStream it1 = IntStream.range(1,100).filter(t->t%2==0);
        //IntStream it2 = IntStream.iterate(1,t->t+2).limit(10);

        //int[] array = IntStream.concat(it1,it2).distinct().limit(10).toArray();

        //int[] array = {1,2,4,2,3,5};
        //Arrays.stream(array).distinct().forEach(System.out::println);

        //int[] array = {1,2,5,3,25,1,5,1,2,4,2};
        //Arrays.stream(array).distinct().limit(4).forEach((System.out::println));

        //int[] arr = Arrays.stream(array).filter(t->t%2==0).filter(t->t>=10).distinct().skip(2).limit(3).toArray();

        //for(int i=0;i<arr.length;i++){
          //  System.out.println(arr[i]);
       // }

        /*
        Predicate<String> p = new Predicate<String>() {

            @Override
            public boolean test(String s) {
                if(s.charAt(0) == 'S'){
                    return true;
                }
                return false;
            }
        };

        List<String> l = Arrays.asList("Surat","Shillong","Srinagar","Secunderabad","Surat","Salem");
        l.stream().distinct().filter(p).map(t->t.toUpperCase()).skip(1).forEach(System.out::println);
         */


        /*
        String sentence = "Stream operations are powerful";
        int[] a = sentence.chars().skip(5).distinct().toArray();
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
       */


        /*
        List<String> s = Arrays.asList("Prabhas","Mahesh","Charan","Allu Arjun","Balaya","Jr NTR");
        s.stream().filter(t->t.length()>=4 && t.length()<=7).distinct().map(String::toLowerCase).sorted().forEach(System.out::println);

         */

        List<String> s = Arrays.asList("Prabhas","Mahesh","Charan","Allu Arjun","Balaya","Jr NTR");
        s.stream().map(t->t.toUpperCase()).skip(3).distinct().limit(5).forEach(System.out::println);
    } 
}
