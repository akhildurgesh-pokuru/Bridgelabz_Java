package Methods.Level1;

/*program calculate the wind chill temperature given the temperature and wind speed

 */

import java.util.Scanner;

class wind{
    public double calculateWindChill(double temperature, double windSpeed){
        double result = 35.74+0.6215*temperature+(0.4275*temperature-35.75)*(Math.pow(windSpeed,0.16)); //calculates the wind chill
        return result;  //return the windchill
    }

}

public class WindChill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // creating object for scanner
        System.out.print("Enter the Temperature");   // Taking input as temperature from user
        int temp = sc.nextInt();
        System.out.print("Enter the WindSpeed");   // Taking input as windspeed from user
        int wind_speed = sc.nextInt();
        wind obj = new wind();  //create the object of wind class as it is not the non static method
        double windchill = obj.calculateWindChill(temp,wind_speed);  //call the calculatewindchill method
        System.out.println("WindChill is: "+windchill);  //prints windchill
    }
}
