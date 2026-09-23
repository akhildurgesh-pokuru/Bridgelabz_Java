package Methods.Level2;

import java.util.Scanner;

class NumberCalculation {

    public static boolean checkPositive(int numberValue) {
        return numberValue >= 0;
    }

    public static boolean checkEven(int numberValue) {
        return numberValue % 2 == 0;
    }

    public static int compareNumbers(int firstValue, int secondValue) {
        if (firstValue > secondValue) {
            return 1;
        } else if (firstValue == secondValue) {
            return 0;
        } else {
            return -1;
        }
    }
}

public class NumberAnalysis {

    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        int[] numberList = new int[5];

        for (int index = 0; index < numberList.length; index++) {
            System.out.println("Enter number " + (index + 1));
            numberList[index] = inputReader.nextInt();
        }

        for (int index = 0; index < numberList.length; index++) {

            if (NumberCalculation.checkPositive(numberList[index])) {

                System.out.println(numberList[index] + " is positive");

                if (NumberCalculation.checkEven(numberList[index])) {
                    System.out.println(numberList[index] + " is even");
                } else {
                    System.out.println(numberList[index] + " is odd");
                }

            } else {
                System.out.println(numberList[index] + " is negative");
            }
        }

        int comparisonResult = NumberCalculation.compareNumbers(
                numberList[0],
                numberList[numberList.length - 1]
        );

        if (comparisonResult == 1) {
            System.out.println("First element is greater than last element");
        } else if (comparisonResult == 0) {
            System.out.println("First element is equal to last element");
        } else {
            System.out.println("First element is less than last element");
        }
    }
}