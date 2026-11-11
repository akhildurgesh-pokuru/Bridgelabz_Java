package java.RunTimeAnalysis;


/*
 * This program compares FileReader and InputStreamReader for reading large files.
 * It measures the execution time required to read the entire file using buffers.
 */

import java.io.*;
import java.util.Scanner;

public class FileReadingComparison {

    // Read file using FileReader
    public static long readUsingFileReader(String filePath) throws IOException {

        long characters = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            char[] buffer = new char[8192];

            int count;

            // Read characters using a buffer
            while ((count = br.read(buffer)) != -1) {
                characters += count;
            }
        }

        return characters;
    }

    // Read file using InputStreamReader
    public static long readUsingInputStreamReader(String filePath)
            throws IOException {

        long characters = 0;

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(filePath)))) {

            char[] buffer = new char[8192];

            int count;

            // Read bytes and convert them into characters
            while ((count = br.read(buffer)) != -1) {
                characters += count;
            }
        }

        return characters;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get file path from the user
        System.out.print("Enter file path: ");
        String filePath = sc.nextLine();

        try {

            // Measure FileReader execution time
            long start = System.nanoTime();

            long fileReaderCount = readUsingFileReader(filePath);

            long end = System.nanoTime();

            double fileReaderTime = (end - start) / 1_000_000.0;

            // Measure InputStreamReader execution time
            start = System.nanoTime();

            long inputStreamCount = readUsingInputStreamReader(filePath);

            end = System.nanoTime();

            double inputStreamTime = (end - start) / 1_000_000.0;

            // Display comparison results
            System.out.println("\nFileReader Characters: " + fileReaderCount);
            System.out.println("FileReader Time: " + fileReaderTime + " ms");

            System.out.println("\nInputStreamReader Characters: " + inputStreamCount);
            System.out.println("InputStreamReader Time: " + inputStreamTime + " ms");

        }
        catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        sc.close();
    }
}

