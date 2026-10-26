
/*
 * This program counts how many times each word appears in a sentence.
 * It uses a HashMap to store each word and its corresponding frequency.
 */

package Collections.Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reads a sentence entered by the user.
        System.out.println("Enter the sentence: ");
        String sentence = sc.nextLine();

        // Splits the sentence into individual words.
        String[] words = new String[sentence.split(" ").length];
        words = sentence.split(" ");

        // Stores each word and the number of times it appears.
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {

            // Increases the word's count or sets it to one if it appears for the first time.
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // Displays the words and their frequencies.
        System.out.println(map);
    }
}
