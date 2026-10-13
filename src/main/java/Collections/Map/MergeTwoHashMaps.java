package Collections.Map;

import java.util.HashMap;

public class MergeTwoHashMaps {
    public static void main(String[] args){
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        map1.put("mango",10);
        map1.put("banana",5);

        map2.put("guava",7);
        map2.put("banana",10);

        HashMap<String, Integer> result = new HashMap<>();
        for(String fruit : map1.keySet()){
            result.put(fruit, result.getOrDefault(fruit,0)+map1.get(fruit));
        }
        for(String fruit : map2.keySet()){
            result.put(fruit, result.getOrDefault(fruit,0)+map2.get(fruit));
        }

        System.out.println(result);
    }
}



