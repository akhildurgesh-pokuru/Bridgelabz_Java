package RegularExpressions;

import java.util.Scanner;

public class UserRegistrationForm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //first name
        System.out.println("Enter the First Name: ");
        String first_name = sc.next();
        System.out.println("First Name result: "+first_name.matches("[A-Z][a-z]{2,}"));

        //last name
        System.out.println("Enter the Last Name: ");
        String last_name = sc.next();
        System.out.println("Last Name result: "+last_name.matches("[A-Z][a-z]{2,}"));

        //email
        System.out.println("Enter the Email: ");
        String email = sc.next();
        System.out.println("Email result: "+email.matches("[a-z]+\\.[a-z]+@[a-z]+\\.[a-z]+"));

        //mobile number
        System.out.println("Enter the Mobile Number: ");
        String number = sc.next();
        System.out.println("Mobile Number result: "+number.matches("[0-9]{2}[ ][0-9]{10}"));
        System.out.println();

        //password
        System.out.println("Password: ");
        String password = sc.next();
        System.out.println("Password: "+password.matches(".*[A-Z].*"));
    }
}
