package Methods.Level1;

/*program to find the maximum number of handshakes
 among N number of students.
 */


import java.util.Scanner;

public class HandShakes {  //main class
    public static void main(String[] args) {  //main method
        Scanner sc = new Scanner(System.in);   //create scanner object for scanner class
        System.out.println("Enter the number of students present in class");
        int n = sc.nextInt();   //Taking input of number of students present in the class
        int result = (n*(n+1))/2;  //calculate the maximum number of handshakes
        System.out.println("Maximum number od handshakes are: "+result);   //prints the result
    }
}
