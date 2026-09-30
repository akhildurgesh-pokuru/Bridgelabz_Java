package Arrays.Level2;

/*program to take a number as input find the frequency of each digit in the number using an array and
 display the frequency of each digit
 */


import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args){       //Main Method present inside the class
        Scanner sc = new Scanner(System.in);   //creating object for scanner class and storing it in reference variable
        System.out.println("Enter the number");
        int number = sc.nextInt();    //Take the input as a number from user
        int length = String.valueOf(number).length();  //Find the length of the number by converting it into string
        int[] arr= new int[length];   // create array to store the digits of a number
        int i=0;
        while(number!=0){      //run the while loop until the number becomes 0
            arr[i] = number%10; //store the last digit
            number = number/10;  //remove the last digit
            i++;
        }
        int[] frequency = new int[10];     //declare the frequency array that stores frequency of the digits
        for(i=0;i<arr.length;i++){
            int digit = arr[i];
            if(digit>=0 && digit<=9) {    // consider only the positive digits
                frequency[digit]++;   //increment the values of digits stored in array
            }
        }

        for(i=0;i<frequency.length;i++){
            if(frequency[i]>0){      //Return the frequency of elements whose frequency is greater than 0
                System.out.println("Frequency of "+i+" is: "+frequency[i]);
            }
        }
    }
}
