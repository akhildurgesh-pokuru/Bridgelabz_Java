package Extras;


/*
 * This program allows the computer to guess a number between 1 and 100.
 * The user provides feedback, and the computer adjusts its next guess accordingly.
 */

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    static Random random = new Random();

    // Generate a random guess within the given range
    public static int generateGuess(int low, int high) {
        return random.nextInt(high - low + 1) + low;
    }

    // Receive feedback from the user
    public static String getFeedback(Scanner sc) {
        System.out.print("Enter feedback (high/low/correct): ");
        return sc.nextLine().toLowerCase();
    }

    // Determine the next guess based on feedback
    public static void playGame() {

        Scanner sc = new Scanner(System.in);

        int low = 1;
        int high = 100;

        while (low <= high) {

            // Generate the computer's guess
            int guess = generateGuess(low, high);

            System.out.println("Computer guessed: " + guess);

            // Get feedback from the user
            String feedback = getFeedback(sc);

            if (feedback.equals("correct")) {
                System.out.println("Computer guessed your number!");
                break;
            }
            else if (feedback.equals("high")) {
                high = guess - 1;
            }
            else if (feedback.equals("low")) {
                low = guess + 1;
            }
            else {
                System.out.println("Invalid feedback. Try again.");
            }
        }

        if (low > high) {
            System.out.println("Your feedback was inconsistent!");
        }

        sc.close();
    }

    public static void main(String[] args) {
        playGame();
    }
}
