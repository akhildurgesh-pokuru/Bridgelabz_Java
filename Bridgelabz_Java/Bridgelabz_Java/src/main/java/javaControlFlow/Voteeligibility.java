package javaControlFlow;

/*Checking weather a person is
eligible to vote in elections
 */
import java.util.Scanner;

public class Voteeligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // creating object for scanner
        System.out.print("Enter the Age");   // Taking Age as input from user
        int age = sc.nextInt();
        if(age>=18){   //condition weather the person's age is greater than or equal to 18
            System.out.print("The Person's age is: "+age+" and he/she is Eligible to vote");   // printing yes if person's age is greater than 18 or 18
        }else{
            System.out.print("The Person's age is: "+age+" and he/she is Not Eligible to vote");   // printing No as person'd age is not greater than or equal to 18
        }
    }
}
