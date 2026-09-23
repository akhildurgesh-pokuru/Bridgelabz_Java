package Methods.Level1;

/*program to find the smallest and the largest of the 3 numbers

 */

import java.util.Scanner;

class find{
    public static int[] search(int number1, int number2, int number3){
        int small = Math.min(number3,Math.min(number1,number2));  //finds the minimum number
        int large = Math.max(number3,Math.max(number1,number2));   //finds the maximum number
        int[] arr = new int[2];  //creates the array of size 2
        arr[0] = small;  //stores small number
        arr[1] = large;  //stores large number
        return arr;  //returns array
    }

}

public class SmallestAmongThree {  //main class
    public static void main(String[] args) {  //main method
        Scanner sc = new Scanner(System.in);    // creating object for scanner
        System.out.print("Enter the First number");   // Taking input1 from user
        int num1 = sc.nextInt();
        System.out.print("Enter the second number");  // Taking input2 from user
        int num2 = sc.nextInt();
        System.out.print("Enter the third Number");   // Taking input3 from user
        int num3 = sc.nextInt();
        int[] arr = find.search(num1,num2,num3);   //call the search method
        System.out.println("Smallest Number: "+arr[0]);  //prints the smallest number
        System.out.println("Largest Number: "+arr[1]);   //prints the largest number
    }
}
