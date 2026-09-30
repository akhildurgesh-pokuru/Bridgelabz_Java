package Arrays.Level2;

/*program using multi-dimensional array to store height, weight, and BMI in
2D array for all the persons
 */


import java.util.Scanner;

public class MultiDimensionBMI {
    public static void main(String[] args) {     //Main Method present inside the class
        Scanner sc = new Scanner(System.in);    //creating object for scanner class and storing it in reference variable
        System.out.println("Enter the number of persons");
        int number = sc.nextInt();
        int[][] persondata = new int[number][3];   //initializing 2D array with alias persondata
        int i,j;
        System.out.println("Enter the Personal Details (Weight,Height) and BMI as 0: ");
        for(i=0;i<number;i++){
            for(j=0;j<3;j++){
                persondata[i][j] = sc.nextInt();  //storing the person data in the 2D array with weight,height,and BMI
            }
        }

        int weight = 0;
        int height = 0;

        double[] bmi = new double[number];    //initialize BMI array with double datatype
        for(i=0;i<number;i++){
            for(j=0;j<3;j++){
                if(j==0){           //for weight take the first value from 2D array
                    weight = persondata[i][j];
                }else if(j==1){       //for height take the second value from 2D array
                    height = persondata[i][j];   //for
                }else if(j==2){     //Calculate BMI for each of the person
                    bmi[i] = (double) weight /(height*height);
                }
            }
        }

        for(i=0;i<bmi.length;i++){
            System.out.println("BMI of person " +(i+1)+" : "+bmi[i]);  //prints the BMI for each person
        }

    }
}
