/*
 * Program to find the youngest and tallest among three friends:
 * Amar, Akbar, and Anthony.
 * The program takes the age and height of each friend as input,
 * stores them in arrays, finds the youngest friend based on age,
 * and finds the tallest friend based on height.
 */

package Methods.Level2;

import java.util.Scanner;

// Class containing methods to find the youngest and tallest friend
class FriendCalculation {

    // Method to find the youngest friend based on age
    public static int findYoungest(int[] ages) {
        // Assume the first friend is the youngest initially
        int youngest = 0;

        // Compare the age of each friend with the current youngest
        for (int i = 1; i < ages.length; i++) {
            // If the current friend's age is smaller, update youngest
            if (ages[i] < ages[youngest]) {
                youngest = i;
            }
        }

        // Return the index of the youngest friend
        return youngest;
    }

    // Method to find the tallest friend based on height
    public static int findTallest(double[] heights) {
        // Assume the first friend is the tallest initially
        int tallest = 0;

        // Compare the height of each friend with the current tallest
        for (int i = 1; i < heights.length; i++) {
            // If the current friend's height is greater, update tallest
            if (heights[i] > heights[tallest]) {
                tallest = i;
            }
        }

        // Return the index of the tallest friend
        return tallest;
    }
}

// Main class of the program
public class FriendDetails {

    // Main method where program execution starts
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner inputReader = new Scanner(System.in);

        // Store the names of the three friends in an array
        String[] friendNames = {"Amar", "Akbar", "Anthony"};

        // Create an array to store the ages of the three friends
        int[] friendAges = new int[3];

        // Create an array to store the heights of the three friends
        double[] friendHeights = new double[3];

        // Loop through the three friends to take their details
        for (int i = 0; i < 3; i++) {

            // Ask the user to enter the age of the current friend
            System.out.println("Enter age of " + friendNames[i]);

            // Store the entered age in the age array
            friendAges[i] = inputReader.nextInt();

            // Ask the user to enter the height of the current friend
            System.out.println("Enter height of " + friendNames[i]);

            // Store the entered height in the height array
            friendHeights[i] = inputReader.nextDouble();
        }

        // Find the index of the youngest friend
        int youngestFriend = FriendCalculation.findYoungest(friendAges);

        // Find the index of the tallest friend
        int tallestFriend = FriendCalculation.findTallest(friendHeights);

        // Display the name of the youngest friend
        System.out.println("Youngest friend: " + friendNames[youngestFriend]);

        // Display the name of the tallest friend
        System.out.println("Tallest friend: " + friendNames[tallestFriend]);
    }
}