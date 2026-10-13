package Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class remove{
    public void duplicates(List<Integer> list){
        List<Integer> list1 = new ArrayList<>();
        for(Integer i : list){
            if(list1.contains(i)){
                continue;
            }else{
                list1.add(i);
            }
        }
        System.out.print(" "+list1);
    }
}

public class RemoveDuplicates {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        remove obj = new remove();
        obj.duplicates(list);
    }
}
