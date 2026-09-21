package javaControlFlow;

/*
 * Program to find the youngest and tallest
 * friend among Amar, Akbar and Anthony.
 */

import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amar's age: ");
        int amarAge = sc.nextInt();

        System.out.print("Enter Akbar's age: ");
        int akbarAge = sc.nextInt();

        System.out.print("Enter Anthony's age: ");
        int anthonyAge = sc.nextInt();

        System.out.print("Enter Amar's height: ");
        double amarHeight = sc.nextDouble();

        System.out.print("Enter Akbar's height: ");
        double akbarHeight = sc.nextDouble();

        System.out.print("Enter Anthony's height: ");
        double anthonyHeight = sc.nextDouble();

        // Find the youngest friend
        if (amarAge <= akbarAge && amarAge <= anthonyAge) {
            System.out.println("Youngest: Amar");
        } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
            System.out.println("Youngest: Akbar");
        } else {
            System.out.println("Youngest: Anthony");
        }

        // Find the tallest friend
        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
            System.out.println("Tallest: Amar");
        } else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
            System.out.println("Tallest: Akbar");
        } else {
            System.out.println("Tallest: Anthony");
        }

        sc.close();
    }
}
