package Arrays.Level1;

/*program to find the multiplication table of a number entered by the user from 6 to 9 and
 display the result
 */


import java.util.Scanner;

public class MultiplicationTableFrom6To9 {
    public static void main(String[] args) {   //Main Method present inside the class
        Scanner sc = new Scanner(System.in);     //creating object for scanner class and storing it in reference variable
        System.out.print("Enter the Number");
        int num = sc.nextInt();    // Taking input as Number from user
        int[] table = new int[4];   // creating an array of size 10
        int j = 0,k=6;
        for(int i=6;i<=9;i++) {    // traversing the loop from 6 to 9
            table[j] = num * i;   //storing result in an array
            j++;     // incrementing j for adding next integer in next index
        }
        for(j=0;j<table.length;j++){    // travesrsing loop through table array
            System.out.println(num+" * "+ k + " = " +table[j]);  //priting the result for each iteration
            k++;
        }
    }
}
