package Arrays.Level1;

/*Write a program to store multiple values in an array up to a maximum of 10 or
until the user enters a 0 or a negative number.
Show all the numbers as well as the sum of all numbers
 */


import java.util.Scanner;

public class TerminateIfZeroIsEntered {
    public static void main(String[] args) {   //Main Method present inside the class
        Scanner sc = new Scanner(System.in);     //creating object for scanner class and storing it in reference variable
        boolean value = true;    // boolean value for first conditional true in while loop
        double total = 0;     // stores the total sum result
        int[] arr = new int[10];   //creating array of size 10
        int i=0;
        while(value){    // initialization of loop for each user input
            System.out.println("Enter the number");
            int num = sc.nextInt();      // storing the user input
            if(num==0 || num<0){     // condition to check weather number is zero or negative
                System.err.println("Not a Positive Integer");    // if condition satisfies it prints not a positive integer
                for(int j : arr){
                    System.out.print(" "+j);
                }
                System.out.println();
                System.out.println("Total Result: "+total);   // prints total sum result
                System.exit(1);  // finally exits the block
            }else{
                arr[i] = num;     // if condition not satisfies then add the element to array
                i++;
                total = total+num;    // add the number to total varible for updating the sum
            }
        }
    }
}
