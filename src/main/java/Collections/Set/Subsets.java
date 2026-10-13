package Collections.Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Subsets {
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>(Arrays.asList(10,20,30,40,50));
        Set<Integer> set1 = new HashSet<>(Arrays.asList(20,30));

        if(set.containsAll(set1)){
            System.out.println("It is a sub set");
        }else{
            System.out.println("It is not a sub set");
        }

    }
}
