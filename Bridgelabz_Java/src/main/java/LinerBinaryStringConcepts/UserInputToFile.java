package LinerBinaryStringConcepts;

import java.io.*;

public class UserInputToFile {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));

        String input;

        System.out.println("Enter text (type exit to stop):");

        while ((input = br.readLine()) != null) {
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            bw.write(input);
            bw.newLine();
        }

        bw.close();
        System.out.println("Data saved successfully.");
    }
}
