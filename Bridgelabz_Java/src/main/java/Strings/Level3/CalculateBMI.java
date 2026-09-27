package Strings.Level3;

import java.util.Scanner;

/*
Calculating BMI and finding the BMI status
1) calculating BMI for each person
2) finding the BMI status based on BMI value
3) displaying weight, height, BMI and status
*/

class calculate{
    public int[][] calculate_bmi(int[][] details){ //taking 2D array as parameter

        for(int i=0;i<10;i++){ //looping through each person
            for(int j=0;j<3;j++){ //looping through weight, height and BMI
                if(j==2){ //checking the BMI column
                    details[i][j] = (details[i][j-2])/(details[i][j-1]*details[i][j-1]); //calculating BMI
                }
            }
        }
        return details; //returning calculated details
    }
}


class status{
    public String[] bmi_status(int[][] bmi){ //taking BMI details as parameter
        String[] status = new String[10]; //array to store BMI status
        int k = 0;

        for(int i=0;i<10;i++){ //looping through each person
            for(int j=0;j<3;j++){ //looping through weight, height and BMI
                if(j==2){ //checking the BMI column
                    int bmi_value = bmi[i][j]; //storing BMI value

                    if(bmi_value<=18.4){ //checking for under weight
                        status[k] = "Under Weight";
                        k++;
                    }else if(bmi_value>=18.5 && bmi_value<=24.9){ //checking for normal weight
                        status[k] = "Normal";
                        k++;
                    }else if(bmi_value>=25.0 && bmi_value<=39.9){ //checking for over weight
                        status[k] = "Over Weight";
                        k++;
                    }else{ //checking for obese
                        status[k] = "Obese";
                        k++;
                    }
                }
            }
        }
        return status; //returning BMI status
    }
}

public class CalculateBMI {
    public static void main(String[] args){ //main method
        Scanner sc = new Scanner(System.in);

        int[][] details = new int[10][4]; //2D array to store person details

        System.out.println("Enter the weight and height of each person"); //taking weight and height as input

        for(int i=0;i<10;i++){ //looping through each person
            for(int j=0;j<2;j++){ //taking weight and height
                details[i][j] = sc.nextInt(); //storing input values
            }
        }

        calculate obj = new calculate(); //creating object to calculate BMI
        int[][] bmi = obj.calculate_bmi(details); //calculating BMI

        status obj1 = new status(); //creating object to find BMI status
        String[] status = obj1.bmi_status(bmi); //finding BMI status

        int k=0;

        for(int i=0;i<10;i++){ //looping through each person
            for(int j=0;j<4;j++){ //looping through all details
                if(j==3){ //checking the status column
                    System.out.print(" "+status[k]); //printing BMI status
                    k++;
                }else{
                    System.out.print(" "+bmi[i][j]+" "); //printing weight, height and BMI
                }
            }
            System.out.println();
        }

    }
}