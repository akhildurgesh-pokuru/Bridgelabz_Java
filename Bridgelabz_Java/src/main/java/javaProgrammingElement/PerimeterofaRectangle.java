package javaProgrammingElement;

import java.util.Scanner;

public class PerimeterofaRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();

        double perimeter = 2 * (length + width);
        System.out.println("Perimeter: " + perimeter);

        scanner.close();
    }
}