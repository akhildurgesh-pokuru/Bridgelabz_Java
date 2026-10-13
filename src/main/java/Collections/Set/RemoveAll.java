package Collections.Set;

import java.util.HashSet;
import java.util.Set;

class difference{
    public void minus(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> diff1 = new HashSet<>(set1);
        diff1.removeAll(set2);

        Set<Integer> diff2 = new HashSet<>(set2);
        diff2.removeAll(set1);

        diff1.addAll(diff2);

        System.out.println(diff1);
    }
}


public class RemoveAll {
    public static void main(String[] args){
        Set<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);

        Set<Integer> set2 = new HashSet<>();
        set2.add(30);
        set2.add(40);
        set2.add(50);

        difference obj = new difference();
        obj.minus(set1,set2);
    }
}
