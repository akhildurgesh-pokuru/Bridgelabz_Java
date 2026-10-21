package RegularExpressions;

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Password");
        String password = sc.next();

        System.out.println(password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[^A-Za-z0-9]).{8,}"));
    }
}
