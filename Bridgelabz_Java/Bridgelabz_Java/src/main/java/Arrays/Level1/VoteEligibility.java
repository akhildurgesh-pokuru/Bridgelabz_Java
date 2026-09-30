package Arrays.Level1;

/*Below program to take user input for the age of all 10 students in a class and
check whether the student can vote depending on his/her age is greater or equal to 18.
 */


import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args){   //Main Method present inside the class
        Scanner sc = new Scanner(System.in);    //creating object for scanner class and storing it in reference variable
        int[] stud_ages = new int[10];    // creating an array of size 10 (defines 10 students in a class)
        int i;
        System.out.print("Enter the ages of students");
        for(i=0;i<stud_ages.length;i++){
            stud_ages[i] = sc.nextInt();      // storing the ages of students in an array
        }
        for(i=0;i<stud_ages.length;i++){
            if(stud_ages[i]>=18){        // condition to check weather the student age is greater than or equal to 18
                System.out.println("Person " + i +"is "+"eligible to vote");   //prints eligible to vote
            }else{
                System.out.println("Person " + i +"is "+"not eligible to vote");   //prints not eligible to vote
            }
        }
    }
}
