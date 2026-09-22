package Arrays.Level1;
/* program to save odd and even numbers into odd and even arrays between 1 to the number entered by the user.
Finally, print the odd and even numbers array
 */


import java.util.Scanner;

public class EvenOddArrays {
    public static void main(String[] args) {   //Main Method present inside the class
        Scanner sc = new Scanner(System.in);     //creating object for scanner class and storing it in reference variable
        System.out.println("Enter the integer");
        int num = sc.nextInt();
        int[] even_arr = new int[num/2+1];    //creating even array
        int[] odd_arr = new int[num/2+1];     //creating an odd array
        int a=0,b=0;   //declaring increment variables for even and odd array
        for(int i=1;i<=num;i++){
            if(i%2==0){    //check even or odd and
                even_arr[a] = i;  // store even numbers in even array
                a++;
            }else{
                odd_arr[b] = i;    //store odd numers in odd array
                b++;
            }
        }

        System.out.println("Even Array Elements");
        for(a=0;a<even_arr.length;a++){
            System.out.print(" "+even_arr[a]);    //print the even numbers
        }
        System.out.println();
        System.out.println("Odd Array Elements");
        for(b=0;b<odd_arr.length;b++){
            System.out.print(" "+odd_arr[b]);     //print the odd numbers
        }
    }
}
