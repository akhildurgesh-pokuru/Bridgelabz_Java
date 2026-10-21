package RegularExpressions;

import java.util.Scanner;

public class PostalPinCode {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pin");
        String pin = sc.next();
        if(pin.matches("^\\d{4,6}$")){
            System.out.println("A valid PIN");
        }else{
            System.out.println("Not a Valid PIN");
        }
    }
}
