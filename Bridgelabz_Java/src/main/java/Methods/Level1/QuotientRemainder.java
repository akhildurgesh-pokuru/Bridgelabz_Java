package Methods.Level1;

/*program to take 2 numbers and print their quotient and reminder

 */

import java.util.Scanner;

class division{
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int remainder = number%divisor;   //calculates remainder
        int quotient = number/divisor;    //calculates quotient
        int[] arr = new int[2];   //declare array of size 2
        arr[0] = remainder;   //store remainder in oth index
        arr[1] = quotient;    //store quotient in 1st index
        return arr;   //return array
    }
}

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // creating object for scanner
        System.out.print("Enter the number");   // Taking input as number from user
        int number = sc.nextInt();
        System.out.print("Enter the divisor");   // Taking input as divisor from user
        int divisor = sc.nextInt();
        int[] result = division.findRemainderAndQuotient(number,divisor);   // call the find remainder and quotient method
        System.out.println("Remainer is: "+result[0]);  //prints remainder
        System.out.println("Quotient is: "+result[1]);  //prints quotient
    }
}