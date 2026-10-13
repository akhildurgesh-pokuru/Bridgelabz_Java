package Collections.Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FrequencyCounter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String sentence = sc.nextLine();
        String[] words = new String[sentence.split(" ").length];
        words = sentence.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for(String word : words){
            map.put(word, map.getOrDefault(word, 0)+1);
        }

        System.out.println(map);
    }
}
