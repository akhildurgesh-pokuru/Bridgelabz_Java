package Arrays.Level2;

/*program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and
 the tallest among the friends based on their heights
 */


import java.util.Arrays;
import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {     //Main Method present inside the class
        Scanner sc = new Scanner(System.in);    //creating object for scanner class and storing it in reference variable
        int[] age = new int[3];      //creating array for storing ages
        int[] height = new int[3];   //creating array for storing heights
        int i, j, k;
        System.out.println("Enter the Ages of 3 people");
        for(i=0;i<age.length;i++){
            age[i] = sc.nextInt();    //storing the ages in an ages array
        }
        System.out.print("Enter the heights of 3 people");
        for(i=0;i<height.length;i++){
            height[i] = sc.nextInt();   //storing heights in an heights array
        }

        System.out.println("Youngest among three is: "+Arrays.stream(age).min().getAsInt());   //finding and printing lowest age among all friends
        System.out.print("Tallest among three is: "+Arrays.stream(height).max().getAsInt());   //finding and printing highest cm height among all friends
    }
}
