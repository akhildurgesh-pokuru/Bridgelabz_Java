package javaProgrammingElement;

import java.util.Scanner;

public class AreaofaCircle {
    public static void main(String[] args) {
        final double pie = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter radius");
        int radius = sc.nextInt();
        System.out.println(pie*(radius*radius));
    }
}
