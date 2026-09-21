package javaControlFlow;

/*Program for Sum of N natural numbers with
formulae (n*(n+1)/2) and while loop computation
 */

import java.util.Scanner;

public class Nnaturalnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // creating object for scanner
        System.out.print("Enter the Number");   // Taking input as Number from user
        int num = sc.nextInt();
        int sum = 0;
        int result1 = num*(num+1)/2;   //calculating sum with help of formulae
        while(num!=0){       // while loop initialization for calculating sum
            sum = sum+num;
            num--;
        }

        if(result1==sum){     //condition to check if both values computes same results
            System.out.print("Both are Equal");
        }else{
            System.out.print("Both are not equal");
        }
    }
}
