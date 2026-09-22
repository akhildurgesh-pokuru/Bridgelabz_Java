package Arrays.Level2;

/*An organization took up an exercise to find the Body Mass Index (BMI) of all the persons in the team.
 For this create a program to find the BMI and display the height, weight, BMI and status of each individual
 */


import java.util.Scanner;

public class CalculateBMI {
    public static void main(String[] args) {     //Main Method present inside the class
        Scanner sc = new Scanner(System.in);    //creating object for scanner class and storing it in reference variable
        int[] weight = new int[3];    //An array for storing weights
        double[] height = new double[3];    //An array for storing heights
        double[] bmi = new double[3];    //An array for storing BMI
        String[] status = new String[3];     //An array for storing Status
        int i;

        //store the weights of persons in weight array
        System.out.println("Enter the weights of persons");
        for(i=0;i<weight.length;i++){
            weight[i] = sc.nextInt();
        }

        //store the heights of persons in height array
        System.out.println("Enter the heights of persons");
        for(i=0;i<height.length;i++){
            height[i] = sc.nextDouble();
        }

        //calculating BMI of each person and storing in BMI array
        for(i=0;i<weight.length;i++){
            bmi[i] = (weight[i]/ (Math.pow(height[i],2)));
        }

        for(i=0;i<status.length;i++){
            if(bmi[i]<=18.4){     //if BMI is less than or equal to 18.4
                status[i] = "Underweight";
            }else if(bmi[i]>=18.5 && bmi[i]<=24.9){     // conditional check if BMI is greater than 18.5 and less than or equal to 24.9
                status[i] = "Normal";
            }else if(bmi[i]>=25.0 && bmi[i]<=39.9){    // conditional check if BMI is greater than 25.0 and less than or equal to 39.9
                status[i] = "OverWeight";
            }else{
                status[i] = "Obese";   //if no condition satisfies then the person is obese
            }
        }

        for(i=0;i<bmi.length;i++){
            System.out.println("weight: "+weight[i]+" height: "+height[i]+" BMI: "+bmi[i]+" status: "+status[i]);  //Finally print the Resultant BMI of each person
        }
    }
}
