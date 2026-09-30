package Arrays.Level2;

/*program to take input marks of students in 3 subjects physics, chemistry, and maths.
Compute the percentage and
then calculate the grade  as per the following guidelines
 */


import java.util.Scanner;

public class StudentGradeSystem {
    public static void main(String[] args) {     //Main Method present inside the class
        Scanner sc = new Scanner(System.in);    //creating object for scanner class and storing it in reference variable
        System.out.print("Enter the number of students");
        int persons = sc.nextInt();
        int[] maths = new int[persons];    //An array for storing math marks
        int[] physics = new int[persons];    //An array for storing phy marks
        int[] chemistry = new int[persons];    //An array for storing chem marks
        int[] percentage = new int[persons];  //An array for storing percentage of students
        int i;

        for (i = 0; i < maths.length; i++) {
            maths[i] = sc.nextInt();    //store the maths marks
            physics[i] = sc.nextInt();  //store the physics marks
            chemistry[i] = sc.nextInt();  //store the chemistry marks
        }

        for (i = 0; i < percentage.length; i++) {
            percentage[i] = (maths[i] + physics[i] + chemistry[i]) / 3;    //calculate percentage for each student
        }

        String[] status = new String[persons];   //declare a status array of type string

        for (i = 0; i < percentage.length; i++) {
            if (percentage[i] <= 39) {  //conditional check percentage greater than or equal to 39
                status[i] = "R";
            } else if (percentage[i] >= 40 && percentage[i] <= 49) { //conditional check for percentage greater than or equal to 40 and less than or equal to 49
                status[i] = "E";
            } else if (percentage[i] >= 50 && percentage[i] <= 59) {  //conditional check for percentage greater than or equal to 50 and less than or equal to 59
                status[i] = "D";
            } else if (percentage[i] >= 60 && percentage[i] <= 69) {  //conditional check for percentage greater than or equal to 60 and less than or equal to 69
                status[i] = "C";
            } else if (percentage[i] >= 70 && percentage[i] <= 79) {  //conditional check for percentage greater than or equal to 70 and less than or equal to 79
                status[i] = "B";
            } else if (percentage[i] >= 80 && percentage[i] <= 89) {  //conditional check for percentage greater than or equal to 80 and less than or equal to 89
                status[i] = "A";
            }
        }

        for(i=0;i<persons;i++){
            System.out.println("Person "+(i+1)+" = Maths Marks: "+maths[i]+" Physics Marks: "+physics[i]+" Chemistry Marks: "+chemistry[i] + " Grade: "+ status[i]);  //Printing the results of each student
        }
    }
}
