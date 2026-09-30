package Methods.Level1;

/*program to check whether a number is positive, negative, or zero

 */

import java.util.Scanner;

class poneze{
    public int check(int s1) {   //created check method
        if (s1 == 0) {       //check if input number is zero
            return 0;
        } else if (s1 > 1) {   //checks if input number is greater than 1
            return 1;
        }

        return -1;   //else it states as negative  number
    }
}

public class PosNegZero {   //main class
    public static void main(String[] args) {  //main mathod
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");   //Taking input as number from user
        int s1 = sc.nextInt();
        poneze obj = new poneze();   //creating object for poneze class
        int result = obj.check(s1);    //calling the check method
        System.out.println("number you have entered is: "+result);  //printing the result
    }
}
