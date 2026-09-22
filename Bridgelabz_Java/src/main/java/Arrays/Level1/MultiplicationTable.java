package Arrays.Level1;

/*Below program represents multiplication table of a number.
*/

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {   //Main Method present inside the class
        Scanner sc = new Scanner(System.in);     //creating object for scanner class and storing it in reference variable
        System.out.print("Enter the Number");
        int num = sc.nextInt();    // Taking input as Number from user
        int[] table = new int[11];   // creating an array of size 10
        for(int i=1;i<=10;i++){    // traversing the loop from 1 to 10
            table[i] = num*i;  // printing the result of each iteration
        }
        for(int j=1;j<=10;j++){
            System.out.println(num+" * "+ j + " = " +table[j]);  //printing the results of multiplication stored in table array
        }
    }
}