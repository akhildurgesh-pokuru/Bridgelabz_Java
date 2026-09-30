package Arrays.Level2;

/*program to take a number as input and reverse the number.
To do this, store the digits of the number in an array and
display the array in reverse order
 */

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {     //Main Method present inside the class
        Scanner sc = new Scanner(System.in);    //creating object for scanner class and storing it in reference variable
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int size = String.valueOf(Math.abs(num)).length();  //calculate the length of the numbers
        int[] arr = new int[size];   //declare an array of size
        int i=0;

        //Storing the digits in an array
        while(num!=0){
            arr[i] = num%10;  //Store last digit in an array
            num = num/10;   //remove the last element
            i++;
        }

        //printing the results After Reversing
        for(i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }

    }
}
