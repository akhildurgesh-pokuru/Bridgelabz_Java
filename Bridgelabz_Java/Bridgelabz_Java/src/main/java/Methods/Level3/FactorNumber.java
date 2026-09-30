/*
 * Program to find and analyze the factors of a number.
 * The program finds the factors, greatest factor, sum and product of factors,
 * product of cubes of factors, and checks whether the number is perfect,
 * abundant, deficient, or strong.
 */

package Methods.Level3;

import java.util.Scanner;

class FactorAnalysis {

    // Counts the number of factors of the given number
    public static int countFactors(int number) {
        int count = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        return count;
    }

    // Finds and stores all proper factors in an array
    public static int[] findFactors(int number) {
        int count = countFactors(number);
        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // Finds the greatest factor from the factors array
    public static int findGreatestFactor(int[] factors) {
        int greatest = factors[0];

        for (int i = 1; i < factors.length; i++) {
            if (factors[i] > greatest) {
                greatest = factors[i];
            }
        }

        return greatest;
    }

    // Finds the sum of all factors
    public static int findFactorSum(int[] factors) {
        int sum = 0;

        for (int i = 0; i < factors.length; i++) {
            sum = sum + factors[i];
        }

        return sum;
    }

    // Finds the product of all factors
    public static int findFactorProduct(int[] factors) {
        int product = 1;

        for (int i = 0; i < factors.length; i++) {
            product = product * factors[i];
        }

        return product;
    }

    // Finds the product of the cubes of all factors
    public static double findCubeProduct(int[] factors) {
        double product = 1;

        for (int i = 0; i < factors.length; i++) {
            product = product * Math.pow(factors[i], 3);
        }

        return product;
    }

    // Checks whether the number is a perfect number
    public static boolean checkPerfect(int number, int[] factors) {
        return findFactorSum(factors) == number;
    }

    // Checks whether the number is an abundant number
    public static boolean checkAbundant(int number, int[] factors) {
        return findFactorSum(factors) > number;
    }

    // Checks whether the number is a deficient number
    public static boolean checkDeficient(int number, int[] factors) {
        return findFactorSum(factors) < number;
    }

    // Finds the factorial of a digit
    public static int findFactorial(int number) {
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }

    // Checks whether the number is a strong number
    public static boolean checkStrong(int number) {
        int original = number;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum = sum + findFactorial(digit);
            number = number / 10;
        }

        return sum == original;
    }
}

public class FactorNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = sc.nextInt();

        // Find all proper factors of the number
        int[] factors = FactorAnalysis.findFactors(number);

        int greatest = FactorAnalysis.findGreatestFactor(factors);
        int sum = FactorAnalysis.findFactorSum(factors);
        int product = FactorAnalysis.findFactorProduct(factors);
        double cubeProduct = FactorAnalysis.findCubeProduct(factors);

        boolean perfect = FactorAnalysis.checkPerfect(number, factors);
        boolean abundant = FactorAnalysis.checkAbundant(number, factors);
        boolean deficient = FactorAnalysis.checkDeficient(number, factors);
        boolean strong = FactorAnalysis.checkStrong(number);

        System.out.println("Factors:");

        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }

        System.out.println();
        System.out.println("Greatest Factor: " + greatest);
        System.out.println("Sum of Factors: " + sum);
        System.out.println("Product of Factors: " + product);
        System.out.println("Product of Cubes of Factors: " + cubeProduct);
        System.out.println("Is Perfect Number: " + perfect);
        System.out.println("Is Abundant Number: " + abundant);
        System.out.println("Is Deficient Number: " + deficient);
        System.out.println("Is Strong Number: " + strong);
    }
}