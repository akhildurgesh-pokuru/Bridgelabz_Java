package Methods.Level2;

import java.util.Scanner;

class calculate{
    public int sum(int num){
        int i,sum=0;
        for(i=1;i<=num;i++){
            sum=sum+i;
        }
        return sum;
    }
}

public class SumOfNNaturalNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        calculate obj = new calculate();
        int result = obj.sum(num);
        int result_on_formula = (num*(num+1))/2;
        System.out.println("result: "+result);
        System.out.println("result on formulae: "+result_on_formula);
        if(result==result_on_formula){
            System.out.println("Both are equal");
        }else{
            System.out.println("Both are not equal");
        }
    }
}
