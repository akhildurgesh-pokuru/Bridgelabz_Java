package LinerBinaryStringConcepts;

import java.io.*;

public class WordCount {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));

        String target = "to";
        String line;
        int count = 0;

        while ((line = br.readLine()) != null) {
            String[] words = line.split("\\W+");

            for (String word : words) {
                if (word.equalsIgnoreCase(target)) {
                    count++;
                }
            }
        }

        br.close();
        System.out.println("Word count: " + count);
    }
}