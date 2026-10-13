package Collections.Map;

import java.util.HashMap;
import java.util.Set;

public class KeyWithHighestValue {
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple",1);
        map.put("banana",2);
        map.put("mango",10);
        map.put("orange",5);

        int highest = Integer.MIN_VALUE;
        for(int value : map.values()){
            highest = Math.max(value, highest);
        }

        for(String fruit : map.keySet()){
            if(map.get(fruit) == highest){
                System.out.println(fruit + " "+highest);
                break;
            }
        }
    }
}
