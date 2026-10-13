package Collections.List;

import java.util.HashMap;
import java.util.Map;

class frequency{
    public Map<String, Integer> stringFrequency(String[] arr, Map<String, Integer> freq_map){
        for(String fruit : arr){
            freq_map.put(fruit, freq_map.getOrDefault(fruit,0)+1);
        }
        return freq_map;
    }
}

public class StringFrequency {
    public static void main(String[] args){
        String[] arr = {"apple", "banana", "apple", "cherry", "cherry"};
        Map<String, Integer> freq_map = new HashMap<>();
        frequency freq = new frequency();
        freq_map = freq.stringFrequency(arr, freq_map);

        System.out.println(freq_map);
    }
}
