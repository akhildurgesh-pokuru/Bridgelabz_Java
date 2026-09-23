/*
 * Program to generate employee personal details, calculate salary hike
 * based on experience, and display the final salary details.
 */

package Methods.Level3;

import java.util.Scanner;


class performOperations{

    // Method to generate random salary and experience details for 10 employees
    public double[][] personal_details(){
        double[][] details = new double[10][2];
        for(int i=0;i<10;i++){
            for(int j=0;j<2;j++){
                if(j==0){
                    details[i][j] = (double) Math.random()*100000+1;
                }else{
                    details[i][j] = (double) Math.random()*20+1;
                }
            }
        }
        return details;
    }

    // Method to calculate the new salary and hike amount
    public double[][] hiking(double[][] personal_details){
        double[][] hike = new double[10][3];
        double old_salary = 0;
        for(int i=0;i<10;i++){
            for(int j=0;j<3;j++){
                if(j==0){
                    if(personal_details[i][j+1]>=5){
                        double bonus = 0.05 * personal_details[i][j];
                        old_salary = personal_details[i][j];
                        hike[i][j] = bonus+personal_details[i][j];
                    }else{
                        double bonus = 0.02 * personal_details[i][j];
                        old_salary = personal_details[i][j];
                        hike[i][j] = bonus+personal_details[i][j];
                    }
                }else if(j==1){
                    hike[i][j] = personal_details[i][j];
                }else{
                    hike[i][j] = hike[i][0] - old_salary;
                }
            }
        }
        return hike;
    }

    // Method to create the final employee details
    public double[][] total(double[][] personal_details, double[][] hike_details){
        double[][] final_details = new double[10][3];
        for(int i=0;i<10;i++){
            for(int j=0;j<3;j++){
                if(j==0){
                    final_details[i][j] = personal_details[i][j];
                }else if(j==1){
                    final_details[i][j] = hike_details[i][0];
                }else{
                    final_details[i][j] = hike_details[i][2];
                }
            }
        }
        return final_details;
    }

}

public class Salaryhike {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Create object and generate all employee details
        int[][] details = new int[10][2];
        performOperations obj = new performOperations();
        double[][] personal_details = obj.personal_details();
        double[][] hike_details = obj.hiking(personal_details);
        double[][] total_details = obj.total(personal_details,hike_details);

        // Display personal salary and experience details
        System.out.println("*****Salary Details of Employees*****");

        System.out.println("Personal Details of Employees");
        for(int i=0;i<10;i++){
            for(int j=0;j<2;j++){
                System.out.print(" "+personal_details[i][j]);
            }
            System.out.println();
        }

        // Display new salary, experience and hike amount
        System.out.println("Hiking Details of Employees");
        for(int i=0;i<10;i++){
            for(int j=0;j<3;j++){
                System.out.print(" "+hike_details[i][j]);
            }
            System.out.println();
        }

        // Display the final salary details
        System.out.println("Final Details of Employees");
        for(int i=0;i<10;i++){
            for(int j=0;j<3;j++){
                System.out.print(" "+total_details[i][j]);
            }
            System.out.println();
        }


    }
}