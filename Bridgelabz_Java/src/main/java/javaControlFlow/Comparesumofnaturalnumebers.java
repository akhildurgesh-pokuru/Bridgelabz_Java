package javaControlFlow;

/*Program for comparing sum of n natural numbers with
formulae and for loop computation and
checking weather they both compute equal results
 */

import java.util.Scanner;

public class Comparesumofnaturalnumebers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // creating object for scanner
        System.out.print("Enter the Number");   // Taking input as Number from user
        int num = sc.nextInt();
        int sum = 0;
        int result1 = num * (num + 1) / 2;   //calculating sum with help of formulae
        for(int i=num; i>0;i--){    // Foor loop initialization for calculating sum
            sum = sum + i;
        }


        if (result1 == sum) {     //condition to check if both values computes same results
            System.out.print("Both are Equal");
        } else {
            System.out.print("Both are not equal");
        }
    }
}
