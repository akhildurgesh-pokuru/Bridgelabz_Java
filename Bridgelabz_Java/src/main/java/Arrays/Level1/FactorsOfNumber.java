package Arrays.Level1;

import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {   //Main Method present inside the class
        Scanner sc = new Scanner(System.in);     //creating object for scanner class and storing it in reference variable
        System.out.print("Enter the number");
        int num = sc.nextInt();
        int j=0;
        int[] factors = new int[10];
        for(int i=1;i<num;i++){
            if(num%i==0){
                factors[j] = i;
                j++;
            }
        }

        for(j=0;j<factors.length;j++){
            System.out.print(" "+factors[j]);
        }
    }
}