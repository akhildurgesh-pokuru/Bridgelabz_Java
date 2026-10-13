package Collections.Set;


import java.util.*;

public class ConvertSetToSortedList {
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        set.add(20);
        set.add(10);
        set.add(50);
        set.add(30);

        List<Integer> list = new ArrayList<>(new TreeSet<>(set));

        System.out.println(list);
    }
}
