package Methods.Level1;
/*program to find the maximum number of handshakes
among N number of students.
 */


import java.util.Scanner;

class handshakes{  //created handshakes class
    public void calculate(int n){  //create calculate method
        int result = (n*(n+1))/2;   //calculate the maximum number of handshakes
        System.out.println("Maximum number od handshakes are: "+result);  //prints the result
    }
}



public class NumberOfHandShakes {
    public static void main(String[] args){  //main method
        Scanner sc = new Scanner(System.in);  //create scanner object for scanner class
        System.out.println("Enter the number of students present in class");
        int students = sc.nextInt();    //Taking input as number of students present in the class
        handshakes hs = new handshakes();  //create the object for handshakes class
        hs.calculate(students);  //call the calculate method
    }
}
