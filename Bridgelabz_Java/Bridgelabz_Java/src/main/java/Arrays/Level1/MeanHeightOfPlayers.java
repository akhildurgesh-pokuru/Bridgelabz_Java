package Arrays.Level1;

/*
program to find the mean height of players present in a football team
 */

import java.util.Scanner;

public class MeanHeightOfPlayers {
    public static void main(String[] args) {   //Main Method present inside the class
        Scanner sc = new Scanner(System.in);     //creating object for scanner class and storing it in reference variable
        int[] heights = new int[11];  //creating an array to store the heights of players
        int total = 0;    // for storing total heights summ
        System.out.print("Enter the heights");
        for(int i =0;i<heights.length;i++){
            heights[i] = sc.nextInt();    //store the heights in an array
            total = total+heights[i];    //calculate the total by updating with newly added height
        }

        int mean = total/11;    //calculate the mean of total heights
        System.out.print("Mean Heights of Foot Ball Players is: "+mean);   //Finally printing the mean

    }
}
