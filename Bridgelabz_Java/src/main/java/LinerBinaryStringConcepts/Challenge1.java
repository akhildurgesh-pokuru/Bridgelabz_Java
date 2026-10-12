package LinerBinaryStringConcepts;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Challenge1 {
    public static void main(String[] args) throws IOException {
        int n = 1000000;

        long start = System.nanoTime();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append("hello ");
        }

        long builderTime = System.nanoTime() - start;

        start = System.nanoTime();
        StringBuffer sf = new StringBuffer();

        for (int i = 0; i < n; i++) {
            sf.append("hello ");
        }

        long bufferTime = System.nanoTime() - start;

        System.out.println("StringBuilder time: " + builderTime / 1_000_000.0 + " ms");
        System.out.println("StringBuffer time: " + bufferTime / 1_000_000.0 + " ms");

        String file = "large.txt";

        start = System.nanoTime();
        long fileReaderWords = countWords(new FileReader(file));
        long fileReaderTime = System.nanoTime() - start;

        start = System.nanoTime();
        long inputStreamWords = countWords(
                new InputStreamReader(
                        new FileInputStream(file), StandardCharsets.UTF_8));
        long inputStreamTime = System.nanoTime() - start;

        System.out.println("FileReader word count: " + fileReaderWords);
        System.out.println("FileReader time: " + fileReaderTime / 1_000_000.0 + " ms");

        System.out.println("InputStreamReader word count: " + inputStreamWords);
        System.out.println("InputStreamReader time: " + inputStreamTime / 1_000_000.0 + " ms");
    }

    static long countWords(Reader reader) throws IOException {
        long count = 0;

        try (BufferedReader br = new BufferedReader(reader)) {
            String line;

            while ((line = br.readLine()) != null) {
                String trimmed = line.trim();

                if (!trimmed.isEmpty()) {
                    count += trimmed.split("\\s+").length;
                }
            }
        }

        return count;
    }
}