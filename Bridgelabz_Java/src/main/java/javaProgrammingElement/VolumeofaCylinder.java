package javaProgrammingElement;

import java.util.Scanner;

public class VolumeofaCylinder{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();

        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("Volume: " + volume);

        scanner.close();
    }
}
