package Collections.Set;

import java.util.HashSet;
import java.util.Set;

class Operations{
    public void union(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> union = new HashSet<>(set2);
        union.addAll(set1);

        System.out.println(union);
    }
    public void intersection(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection);
    }
}

public class UnionIntersection {
    public static void main(String[] args){
        Set<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);

        Set<Integer> set2 = new HashSet<>();
        set2.add(30);
        set2.add(40);
        set2.add(50);

        Operations operations = new Operations();
        operations.union(set1, set2);
        operations.intersection(set1, set2);
     }
}
