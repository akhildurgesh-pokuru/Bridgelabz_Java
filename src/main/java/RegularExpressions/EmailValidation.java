package RegularExpressions;

import java.util.Scanner;

public class EmailValidation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Email");
        String email = sc.next();

        System.out.println(email.matches(("^[?=.*A-Za-z0-9.-_+]+@[?=.*A-Za-z0-9.-_+]+\\.[A-Za-z]{2,}$")));
    }
}
