package javaProgrammingElement;

import java.util.Scanner;

public class CelsiustoFahrenheit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter celsius");
        int Celsius = sc.nextInt();
        int Fahrenheit = (Celsius * 9/5) + 32;
        System.out.print(Fahrenheit);
    }
}
