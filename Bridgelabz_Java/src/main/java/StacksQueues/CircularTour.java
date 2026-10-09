/*
 * Problem: Find the starting petrol pump from which a vehicle can complete a circular tour.
 * Approach: Track the current petrol balance and reset the starting point whenever the balance becomes negative.
 */

package StacksQueues;

class CircularTour {

    // Finds the petrol pump from which the complete tour is possible
    static int findStart(int[] petrol, int[] distance) {

        // Stores the possible starting petrol pump
        int start = 0;

        // Stores the petrol balance from the current starting point
        int balance = 0;

        // Stores the total petrol balance for the complete journey
        int total = 0;

        // Check every petrol pump
        for (int i = 0; i < petrol.length; i++) {

            // Petrol available after travelling to the next pump
            balance += petrol[i] - distance[i];

            // Keep track of the total petrol available for the whole tour
            total += petrol[i] - distance[i];

            // If we don't have enough petrol, this starting point cannot work
            if (balance < 0) {

                // Try the next petrol pump as the new starting point
                start = i + 1;

                // Start checking the balance again from zero
                balance = 0;
            }
        }

        // If total petrol is less than total distance, completing the tour is impossible
        if (total < 0) {
            return -1;
        }

        // Return the starting petrol pump index
        return start;
    }


    public static void main(String[] args) {

        // Petrol available at each petrol pump
        int[] petrol = {4, 6, 7, 4};

        // Distance required to reach the next petrol pump
        int[] distance = {6, 5, 3, 5};

        // Find the petrol pump from where the journey can start
        int result = findStart(petrol, distance);

        // Print the starting petrol pump index
        System.out.println(result);
    }
}