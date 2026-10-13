package Collections.Set;

import java.util.HashSet;
import java.util.Set;

class check{
    public void checkSets(Set<Integer> set, Set<Integer> set1){
        boolean result = true;
        for(Integer i : set){
            if(!set1.contains(i)){
                result = false;
                break;
            }
        }

        if(result){
            System.out.println("Sets are equal");
        }else{
            System.out.println("Sets are not equal");
        }
    }
}

public class TwoSetsEqual {
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        Set<Integer> set1 = new HashSet<>();
        set1.add(3);
        set1.add(2);
        set1.add(1);

        check obj = new check();
        obj.checkSets(set, set1);
    }
}
