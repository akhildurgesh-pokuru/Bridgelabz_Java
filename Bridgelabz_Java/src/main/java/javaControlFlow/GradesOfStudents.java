package javaControlFlow;

/*program to input marks and 3 subjects physics, chemistry and maths.
 Compute the percentage and
 then calculate the grade
 */

import java.util.Scanner;

public class GradesOfStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   // creating scanner object with reference variable
        System.out.print("Enter the Maths marks");    // Taking input as Maths marks from user
        int math_marks = sc.nextInt();
        System.out.print("Enter the Physics marks");    // Taking input as Physics marks from user
        int phy_marks = sc.nextInt();
        System.out.print("Enter the Chemistry marks");    // Taking input as Chemistry marks from user
        int chem_marks = sc.nextInt();

        int totalpercentage = (math_marks+phy_marks+chem_marks)/3;

        if (totalpercentage <= 39) {    // percentage below or equal to 39%
            System.out.println("Remedial Standards");    // these are remedial students
        } else if (totalpercentage >= 40 && totalpercentage <= 49) {    // percentage between 40% and 49%
            System.out.println("Level 1 - too below agency normalized standards");   // these are too below agency normalized students
        } else if (totalpercentage >= 50 && totalpercentage <= 59) {  //percentage between 50% and 59%
            System.out.println("Level 1 - well below agency normalized standards");  // these are well below agency normalized standards
        } else if (totalpercentage >= 60 && totalpercentage <= 69) {     //percentage between 60% and 69%
            System.out.println("Level 2 - below, but approaching agency-normalized standards ");  // these are below but approaching agency-normalized standards
        } else if (totalpercentage >= 70 && totalpercentage <= 79) {    // percentage between 70% and 79%
            System.out.println("Level 3 - At agency normalized standards");   // these are At agency normalized standards
        } else if (totalpercentage >= 80) {   // percenatge greater 80 and equal to 80
            System.out.println("Level 4 - Above agency normalized standards");   // these are above agency normalized standards
        }
    }
}
