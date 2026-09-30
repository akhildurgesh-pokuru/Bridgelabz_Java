/*
 * Program to find the shortest, tallest, and mean height
 * of 11 players in a football team.
 * The heights are randomly generated between 150 cm and 250 cm.
 */

package Methods.Level3;

class FootballCalculation {

    // Generates random heights for all players
    public static int[] generateHeights(int size) {
        int[] heights = new int[size];

        for (int i = 0; i < size; i++) {
            heights[i] = (int)(Math.random() * 101) + 150;
        }

        return heights;
    }

    // Finds the sum of all player heights
    public static int findSum(int[] heights) {
        int sum = 0;

        for (int i = 0; i < heights.length; i++) {
            sum = sum + heights[i];
        }

        return sum;
    }

    // Calculates the mean height of the players
    public static double findMean(int sum, int size) {
        return (double) sum / size;
    }

    // Finds the shortest player height
    public static int findShortest(int[] heights) {
        int shortest = heights[0];

        for (int i = 1; i < heights.length; i++) {
            shortest = Math.min(shortest, heights[i]);
        }

        return shortest;
    }

    // Finds the tallest player height
    public static int findTallest(int[] heights) {
        int tallest = heights[0];

        for (int i = 1; i < heights.length; i++) {
            tallest = Math.max(tallest, heights[i]);
        }

        return tallest;
    }
}

public class FootBallTeamHeight {

    public static void main(String[] args) {

        // Generate heights for 11 football players
        int[] heights = FootballCalculation.generateHeights(11);

        // Display the generated heights
        System.out.println("Heights of 11 players:");

        for (int i = 0; i < heights.length; i++) {
            System.out.println("Player-" + (i + 1) + ": " + heights[i] + " cm");
        }

        int sum = FootballCalculation.findSum(heights);
        double mean = FootballCalculation.findMean(sum, heights.length);
        int shortest = FootballCalculation.findShortest(heights);
        int tallest = FootballCalculation.findTallest(heights);

        System.out.println("Sum of heights: " + sum + " cm");
        System.out.println("Mean height: " + mean + " cm");
        System.out.println("Shortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
    }
}