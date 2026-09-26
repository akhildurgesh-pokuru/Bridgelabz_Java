package Strings.Level1;

/*
Below program demonstrates illiegal state of exception
 */

import java.util.Scanner;

class illiegal{
    public void check(String s1){    //method to perform illiegal exception
        System.out.println("Sub String is: "+s1.substring(0,99));   //prints the exception because given string does not contain 99 digits
    }
}



class handleilliegal{
    public void handle(String s1){   //method to handle illiegal exception
        try{
            System.out.println("Substring is: "+s1.substring(0,99));   //trying to print subsstring from 0 - 99
        }catch (IllegalArgumentException e){    //prints illiegal exception if try block does not exceutes
            System.out.println("Exception is: "+e.getMessage());   //prints the exception message
        } catch (Exception e) {
            System.out.println("Exception is: "+e.getMessage());   //normal exception
        }
    }
}



public class IlliegalExeception {    //msin class
    public static void main(String[] args){   //main method
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");  //taking the input of string from user
        String s1 = sc.next();
        illiegal obj1 = new illiegal();  //creating object for illiegal class
        obj1.check(s1);   //calling method
        handleilliegal obj2 = new handleilliegal(); //creating object for handling illiegal
        obj2.handle(s1);  //calling handling illiegal
    }
}
