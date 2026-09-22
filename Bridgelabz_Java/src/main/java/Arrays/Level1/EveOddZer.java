package Arrays.Level1;

/*Write a program to take user input for 5 numbers and check whether a number is
positive,  negative, or zero.
 Further for positive numbers check if the number is even or odd.
 Finally compare the first and last elements of the array and display if they equal, greater or less
 */


import java.util.Scanner;

public class EveOddZer {
    public static void main(String[] args){     //Main Method present inside the class
        Scanner sc = new Scanner(System.in);    //creating object for scanner class and storing it in reference variable
        int i;
        int[] arr = new int[5];    //creating an array of size 5
        System.out.print("Enter the Numbers");
        for(i=0;i<5;i++){
            arr[i] = sc.nextInt();     //Storing the numbes in an array of size 5
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]>0){         // condition for checking if number is greater then zero
                if(arr[i]%2==0){      // condition for checking if number is Even or odd
                    System.out.println(arr[i]+" is Positive and it is Even Integer");   // prints even if condition satisfies
                }else{
                    System.out.println(arr[i]+" is Positive and it is Odd Integer");   //prints odd if condition not satisfies
                }
            }else if(arr[i]==0){      // checking weather the number is Zero
                System.out.println("Number is zero");
            }else if(arr[i]<0){     // checking weather number is negative
                System.out.println("Number is Negative");
            }
        }

        if(arr[0]==arr[arr.length-1]){   //condition for checking weather first and last elements are same
            System.out.println("First and Last Elements are Equal");
        }else{
            System.out.println("First and Last Elements are not Equal");
        }
    }
}
