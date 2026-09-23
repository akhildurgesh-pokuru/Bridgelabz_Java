package Methods.Level1;

/*program to divide N number of chocolates among M children.
Print the number of chocolates each child will get and
 also the remaining chocolates
 */

import java.util.Scanner;

class distribute{
    public static int[] findRemainderAndQuotient(int chocolates, int students){
        int child_gets = chocolates/students;   //calculates chocolates that each student get
        int remaining = chocolates%students;   //calculates remaining chocolates
        int[] arr = new int[2];  //create an array to store the child_gets anf remaining
        arr[0] = child_gets;
        arr[1] = remaining;
        return arr;   //return the array
    }
}

public class ChocolatesDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // creating object for scanner
        System.out.print("Enter the Chocolates");   // Taking input as chocolates from user
        int chocolates = sc.nextInt();
        System.out.print("Enter the Students");   // Taking input as students from user
        int students = sc.nextInt();
        int[] arr = distribute.findRemainderAndQuotient(chocolates,students);   //call the remainder and quotient function
        System.out.println("Chocolates each student gets: "+arr[0]); //prints chocolates that each student gets
        System.out.println("Remaining chocolates: "+arr[1]);  //prints remaining chocolates
    }
}
