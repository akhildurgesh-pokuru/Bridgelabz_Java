package Strings.Level1;

/*
program to demonstrate NumberFormatException
 */

import java.util.Scanner;

class integer{
    public void check(String s1){
        System.out.println("Integer is: "+Integer.parseInt(s1));  //converting string to integer , it results number format exception
    }

}

class handling_integer {
    public void check(String s1){  //taking parameter as string
        try{
            System.out.println("Integer is: "+Integer.parseInt(s1));   //trying to convert string into integer
        }catch (NumberFormatException e){  //handling number format exception
            System.out.println("Exception is: "+e.getMessage());//printing the exception from number format exception
        } catch (RuntimeException e) {
            throw new RuntimeException(e);   //throwing runtime error
        }
    }

}

public class NumberException {    //main class
    public static void main(String[] args){  //main method
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");  //taking the string as an input
        String s1 = sc.next();
        integer obj1 = new integer();  //creating object for integer class
        obj1.check(s1);  //calling the check object
        handling_integer obj2 = new handling_integer();   //creating object for handling integer
        obj2.check(s1);  //calling the check object
    }
}
