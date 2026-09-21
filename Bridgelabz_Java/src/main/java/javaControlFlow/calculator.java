package javaControlFlow;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get inputs for variables
        System.out.print("Enter first number: ");  //Taking input1 as first number
        double first = scanner.nextDouble();

        System.out.print("Enter second number: ");  // Taking input2 as second number
        double second = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");  // Taking input3 as operator
        String op = scanner.next();

        System.out.print("Enter loop count limit (number): ");   // Taking the loop count
        int number = scanner.nextInt();

        // Run a for loop from i = 1 to i < number
        for (int i = 1; i < number; i++) {
            System.out.print("Loop iteration " + i + " - ");

            // Perform operations using switch...case based on 'op'
            switch (op) {
                case "+":      // for Addition operation
                    System.out.println("Result: " + (first + second));
                    break;
                case "-":     // for Subtraction operation
                    System.out.println("Result: " + (first - second));
                    break;
                case "*":     // for multiplication operation
                    System.out.println("Result: " + (first * second));
                    break;
                case "/":     // performing integer division operation
                    if (second != 0) {
                        System.out.println("Result: " + (first / second));
                    } else {
                        System.out.println("Error: Division by zero");
                    }
                    break;
                default:
                    System.out.println("Invalid Operator");
                    // Breaking the loop early since the operator won't change
                    i = number;
                    break;
            }
        }


    }
}
