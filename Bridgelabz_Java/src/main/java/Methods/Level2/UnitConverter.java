package Methods.Level2;

import java.util.Scanner;

class converter_operations{

    public static double kilometerConverter(double kilometer){
        return kilometer*0.621371;
    }

    public static double milesConverter(double miles){
        return miles*1.60934;
    }

    public static double meterConverter(double meters){
        return meters*3.28084;
    }

    public static double feetConverter(double feet){
        return feet*0.3048;
    }


}

public class UnitConverter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Kilometers to convert it to miles");
        double kilometers = sc.nextInt();
        System.out.println("Enter the Miles to convert to Kilometers");
        double miles = sc.nextInt();
        System.out.println("Enter the Meters to convert it to feet");
        double meters =sc.nextInt();
        System.out.println("Enter the feet to convert it to meters");
        double feet = sc.nextInt();

        double con_miles = converter_operations.kilometerConverter(kilometers);
        double con_kilo = converter_operations.milesConverter(miles);
        double con_feet = converter_operations.meterConverter(meters);
        double con_meters = converter_operations.feetConverter(feet);

        System.out.println("converted miles: "+con_miles);
        System.out.println("converted kilo: "+con_kilo);
        System.out.println("converted feet: "+con_feet);
        System.out.println("converted meters: "+con_meters);
    }
}
