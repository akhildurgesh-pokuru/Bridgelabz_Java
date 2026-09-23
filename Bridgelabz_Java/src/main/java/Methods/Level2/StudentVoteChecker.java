/*
 * Program to check the voting eligibility of 10 students.
 * The program takes the age of each student as input,
 * checks whether the student is eligible to vote,
 * and finally displays the ages entered for all students.
 */

package Methods.Level2;

import java.util.Scanner;

// Class containing the method to check voting eligibility
class eleigibility{

    // Method to check whether a student is eligible to vote
    public boolean canStudentVote(int age){

        // Check whether the student's age is 18 or above
        if(age>=18){

            // Return true when the student is eligible to vote
            return true;

        }else{

            // Return false when the student is not eligible to vote
            return false;
        }
    }
}

// Main class of the program
public class StudentVoteChecker {

    // Main method where program execution starts
    public static void main(String[] args){

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Create an array to store the ages of 10 students
        int[] ages = new int[10];

        // Create an object of the eleigibility class
        eleigibility obj = new eleigibility();

        // Loop to take the age of 10 students
        for(int i=0;i<10;i++){

            // Ask the user to enter the age of the current student
            System.out.println("Enter the age of student "+(i+1)+": ");

            // Take the age as input from the user
            int age = sc.nextInt();

            // Check whether the entered age is a positive number
            if(age>0) {

                // Store the valid age in the array
                ages[i] = age;

                // Check the voting eligibility of the student
                boolean result = obj.canStudentVote(age);

                // Check the result returned by the method
                if (result) {

                    // Display that the student is eligible to vote
                    System.out.println("Student has Eligibility to Vote");

                } else {

                    // Display that the student is not eligible to vote
                    System.out.println("Student does not has Eligibility to vote");
                }

            }else{

                // Display a message when the entered age is not positive
                System.out.println("Enter the Age in Positive Integer");

                // Repeat the current student input
                i--;
            }
        }

        // Display the ages entered by the user
        System.out.println("Ages of the Student You have Entered are: ");

        // Loop through the ages array
        for(int j=0;j<ages.length;j++){

            // Display the age of each student
            System.out.println("Student-"+(j+1)+" Age: "+ages[j]);
        }
    }
}