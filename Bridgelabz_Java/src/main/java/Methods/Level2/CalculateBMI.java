package Methods.Level2;

import java.util.Scanner;


class BMICalculations{
    public double[] calculatebmi(double[][] details){
        double weight=0,height=0;
        double[] bmi_array = new double[10];
        for(int i=0;i<10;i++){
            for(int j=0;j<2;j++){
                if(j==0){
                    weight = details[i][j];
                }else if(j==1){
                    height = details[i][j];
                }
            }
            double bmi = weight/(height*height);
            bmi_array[i] = bmi;
        }
        return bmi_array;
    }

    public String[] bmistatus(double[] bmi_array){
        String[] status = new String[10];
        for(int i=0;i<bmi_array.length;i++){
            if(bmi_array[i]<=18.4){
                status[i] = "Under Weight";
            }else if(bmi_array[i]>=18.5 && bmi_array[i]<=24.5){
                status[i] = "Normal";
            }else if(bmi_array[i]>=25.0 && bmi_array[i]<=39.9){
                status[i] = "Normal";
            }else if(bmi_array[i]>=40){
                status[i] = "Normal";
            }
        }

        return status;
    }
}

public class CalculateBMI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[][] details = new double[10][2];
        int i,j;
        System.out.println("Enter the Weight and height of 10 person's");
        for(i=0;i<10;i++){
            for(j=0;j<2;j++){
                details[i][j] = sc.nextInt();
            }
        }
        BMICalculations obj = new BMICalculations();
        double[] bmi_array = obj.calculatebmi(details);
        String[] bmi_status = obj.bmistatus(bmi_array);
        for(int k=0;k<bmi_array.length;k++){
            System.out.println("Person-"+(k+1)+" BMI: "+bmi_array[k]+" BMI_Status: "+bmi_status[k]);
        }
    }
}
