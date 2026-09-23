/*
 * Program to calculate the BMI of 10 persons using their weight and height.
 * The program takes the weight and height of each person as input,
 * calculates the BMI, determines the BMI status, and displays the
 * BMI and status for all 10 persons.
 */

package Methods.Level2;

import java.util.Scanner;

// Class containing methods to calculate BMI and determine BMI status
class BMICalculations{

    // Method to calculate the BMI of all 10 persons
    public double[] calculatebmi(double[][] details){

        double weight=0,height=0;

        // Array to store the BMI values of 10 persons
        double[] bmi_array = new double[10];

        // Loop through each person's details
        for(int i=0;i<10;i++){

            // Loop through weight and height values
            for(int j=0;j<2;j++){

                // Get the weight of the person
                if(j==0){
                    weight = details[i][j];

                    // Get the height of the person
                }else if(j==1){
                    height = details[i][j];
                }
            }

            // Calculate BMI using weight and height
            double bmi = weight/(height*height);

            // Store the calculated BMI in the array
            bmi_array[i] = bmi;
        }

        // Return the BMI values of all persons
        return bmi_array;
    }

    // Method to determine the BMI status of each person
    public String[] bmistatus(double[] bmi_array){

        // Array to store the BMI status of 10 persons
        String[] status = new String[10];

        // Loop through all BMI values
        for(int i=0;i<bmi_array.length;i++){

            // Check if BMI is in the underweight range
            if(bmi_array[i]<=18.4){
                status[i] = "Under Weight";

                // Check if BMI is in the normal range
            }else if(bmi_array[i]>=18.5 && bmi_array[i]<=24.5){
                status[i] = "Normal";

                // Check if BMI is in the overweight range
            }else if(bmi_array[i]>=25.0 && bmi_array[i]<=39.9){
                status[i] = "Normal";

                // Check if BMI is 40 or above
            }else if(bmi_array[i]>=40){
                status[i] = "Normal";
            }
        }

        // Return the BMI status array
        return status;
    }
}

// Main class of the program
public class CalculateBMI {

    // Main method where program execution starts
    public static void main(String[] args){

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Create a 2D array to store weight and height of 10 persons
        double[][] details = new double[10][2];

        int i,j;

        // Ask the user to enter weight and height for 10 persons
        System.out.println("Enter the Weight and height of 10 person's");

        // Loop through 10 persons
        for(i=0;i<10;i++){

            // Loop to take weight and height for each person
            for(j=0;j<2;j++){

                // Store the user's input in the details array
                details[i][j] = sc.nextInt();
            }
        }

        // Create an object of BMICalculations class
        BMICalculations obj = new BMICalculations();

        // Calculate BMI values using the calculatebmi method
        double[] bmi_array = obj.calculatebmi(details);

        // Find the BMI status using the bmistatus method
        String[] bmi_status = obj.bmistatus(bmi_array);

        // Loop through the BMI and status arrays
        for(int k=0;k<bmi_array.length;k++){

            // Display the BMI and status of each person
            System.out.println("Person-"+(k+1)+" BMI: "+bmi_array[k]+" BMI_Status: "+bmi_status[k]);
        }
    }
}