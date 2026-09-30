package Methods.Level1;

/*program to find the sum of n natural numbers using loop

 */

import java.util.Scanner;

class sum{
    void calculate_sum(int num){
        int sum = 0;

        while(num!=0){       // while loop initialization for calculating sum
            sum = sum+num;    //sum of the digits
            num--;
        }

        System.out.println("Sum of "+num+" Natural numbers is: "+sum);
    }
}

public class SumOfnNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // creating object for scanner
        System.out.print("Enter the Number");   // Taking input as Number from user
        int num = sc.nextInt();
        sum obj = new sum();   //create object for sum class
        obj.calculate_sum(num);  //call the calculate sum method
    }
}
