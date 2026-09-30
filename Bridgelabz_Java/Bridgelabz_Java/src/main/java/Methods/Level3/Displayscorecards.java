/*
 * Program to generate marks for students in Physics, Chemistry and Maths,
 * calculate total, average, percentage and display the grade.
 */

package Methods.Level3;

import java.util.Random;
import java.util.Scanner;

class StudentMarks {

    // Method to generate random marks for all students
    public static int[][] generateMarks(int students) {
        Random random = new Random();
        int[][] marks = new int[students][3];

        for (int i = 0; i < students; i++) {
            marks[i][0] = random.nextInt(51) + 50;  //student 1 marks
            marks[i][1] = random.nextInt(51) + 50;   //student 2 marks
            marks[i][2] = random.nextInt(51) + 50;  //student 3 marks
        }

        return marks;
    }

    // Method to calculate total, average and percentage
    public static double[][] calculateResults(int[][] marks) {
        double[][] results = new double[marks.length][3];

        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];

            double average = total / 3.0;
            double percentage = total / 3.0;

            results[i][0] = Math.round(total * 100.0) / 100.0;  // calculates total
            results[i][1] = Math.round(average * 100.0) / 100.0;   //calculates average
            results[i][2] = Math.round(percentage * 100.0) / 100.0;  //calculates percentage
        }

        return results;
    }

    // Method to find grade based on percentage
    public static char findGrade(double percentage) {
        if (percentage >= 80) {   //if percentage greater than or equal to 80
            return 'A';
        } else if (percentage >= 70) {  // if percentage greater or equal to then 70
            return 'B';
        } else if (percentage >= 60) {  // if percentage greater or equal to then 60
            return 'C';
        } else if (percentage >= 50) {  // if percentage greater or equal to then 50
            return 'D';
        } else if (percentage >= 40) {  // if percentage greater or equal to then 40
            return 'E';
        } else {
            return 'R';  //else it returns R grade
        }
    }

    // Method to display student scorecard
    public static void displayScorecard(int[][] marks, double[][] results) {
        System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(
                    (i + 1) + "\t" +
                            marks[i][0] + "\t" +
                            marks[i][1] + "\t\t" +
                            marks[i][2] + "\t" +
                            results[i][0] + "\t" +
                            results[i][1] + "\t" +
                            results[i][2] + "\t\t" +
                            findGrade(results[i][2])
            );
        }
    }
}

public class Displayscorecards {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number of students as input
        System.out.println("Enter number of students:");
        int students = sc.nextInt();

        int[][] marks = StudentMarks.generateMarks(students);

        double[][] results = StudentMarks.calculateResults(marks);

        StudentMarks.displayScorecard(marks, results);
    }
}