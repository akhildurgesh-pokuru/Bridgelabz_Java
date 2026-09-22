package Arrays.Level2;

/*program to store the marks of the students in physics, chemistry, and maths
in a 2D array and
then compute the percentage and grade
 */

import java.util.Scanner;

public class MultiDimentionalStudentGradeSystem {
    public static void main(String[] args) {     //Main Method present inside the class
        Scanner sc = new Scanner(System.in);    //creating object for scanner class and storing it in reference variable
        System.out.println("Enter the number of Students");
        int students = sc.nextInt();
        int[][] markdetails = new int[students][3];   //initializing 2D array with alias marks details
        int i,j,k=0,mat=0,phy=0,chem=0;
        System.out.print("Enter the students Marks (Maths,Physics,Chemistry)");
        for(i=0;i<students;i++){
            for(j=0;j<3;j++){
                markdetails[i][j] = sc.nextInt();  // storing marks of each subjects in 2D array
            }
        }
        String[] status = new String[students];   //create an array to store status Grades of each student
        for(i=0;i<students;i++){
            for(j=0;j<3;j++){
                if(j==0){
                    mat = markdetails[i][j];  //extract math marks
                }else if(j==1){
                    phy = markdetails[i][j];  //extract physics marks
                }else{
                    chem = markdetails[i][j];  //extract chemistry marks
                }
            }
            int percentage = (int) (mat+phy+chem)/3;    //calculate the percentage of each marks
            if (percentage <= 39) {  //if percentage is less than or equal to 39
                status[i] = "R";
            } else if (percentage >= 40 && percentage <= 49) {  //conditional check for percentage is greater than or equal to 40 and less than or equal to 49
                status[i] = "E";
            } else if (percentage >= 50 && percentage <= 59) {   //conditional check for percentage is greater than or equal to 50 and less than or equal to 59
                status[i] = "D";
            } else if (percentage >= 60 && percentage <= 69) {  //conditional check for percentage is greater than or equal to 60 and less than or equal to 69
                status[i] = "C";
            } else if (percentage >= 70 && percentage <= 79) {   //conditional check for percentage is greater than or equal to 70 and less than or equal to 79
                status[i] = "B";
            } else if (percentage >= 80 && percentage <= 89) {   //conditional check for percentage is greater than or equal to 80 and less than or equal to 89
                status[i] = "A";
            }
        }

        for(i=0;i<students;i++){
            System.err.println("Person: "+(i+1)+" = "+"Grade Status: "+status[i]);  //printing the results for each student
        }
    }
}
