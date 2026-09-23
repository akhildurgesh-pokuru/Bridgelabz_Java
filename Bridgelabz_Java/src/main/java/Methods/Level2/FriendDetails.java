package Methods.Level2;

import java.util.Scanner;

class FriendCalculation {

    public static int findYoungest(int[] ages) {
        int youngest = 0;

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngest]) {
                youngest = i;
            }
        }

        return youngest;
    }

    public static int findTallest(double[] heights) {
        int tallest = 0;

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallest]) {
                tallest = i;
            }
        }

        return tallest;
    }
}

public class FriendDetails {

    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        String[] friendNames = {"Amar", "Akbar", "Anthony"};
        int[] friendAges = new int[3];
        double[] friendHeights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + friendNames[i]);
            friendAges[i] = inputReader.nextInt();

            System.out.println("Enter height of " + friendNames[i]);
            friendHeights[i] = inputReader.nextDouble();
        }

        int youngestFriend = FriendCalculation.findYoungest(friendAges);
        int tallestFriend = FriendCalculation.findTallest(friendHeights);

        System.out.println("Youngest friend: " + friendNames[youngestFriend]);
        System.out.println("Tallest friend: " + friendNames[tallestFriend]);
    }
}
