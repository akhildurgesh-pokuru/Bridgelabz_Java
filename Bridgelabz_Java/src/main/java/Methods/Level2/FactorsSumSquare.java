package Methods.Level2;

import java.util.Scanner;

class operations{

    public static int[] factors(int number){
        int[] factors = new int[10];
        int j=0;
        for(int i=1;i<number;i++){
            if(number%i==0){
                factors[j] = i;
                j++;
            }
        }
        return factors;
    }

    public static int sum(int[] factors){
        int sum = 0;
        for(int i=0;i<factors.length;i++){
            sum = sum+factors[i];
        }
        return sum;
    }

    public static int square(int[] factors){
        int[] squares = new int[10];
        int sum = 0;
        for(int i=0;i<factors.length;i++){
            squares[i] = (int) Math.pow(factors[i],2);
            sum = sum + squares[i];
        }
        return sum;
    }

    public static int products(int[] factors){
        int product = 1;
        for(int i=0;i<factors.length;i++){
            if(factors[i]!=0) {
                product = product * factors[i];
            }else{
                continue;
            }
        }
        return product;
    }

}

public class FactorsSumSquare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int[] factors = operations.factors(number);
        int sum = operations.sum(factors);
        int square_sum = operations.square(factors);
        int product_sum = operations.products(factors);
        System.out.println("****Factors of the Number****");
        for(int i=0;i<factors.length;i++){
            System.out.print(" "+factors[i]);
        }
        System.out.println();
        System.out.println("Sum of the factors: "+sum);
        System.out.println("Sum of Squares of Factors: "+square_sum);
        System.out.println("Product of Factors: "+product_sum);
    }
}
