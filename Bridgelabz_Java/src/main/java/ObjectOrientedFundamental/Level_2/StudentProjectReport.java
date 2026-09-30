/*
 * Project: Student Project Report
 *
 * This program takes student details, displays the information,
 * and calculates the grade based on the marks obtained.
 */

package ObjectOrientedFundamental.Level_2;

import java.util.Scanner;

public class StudentProjectReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));

        // Get student details from the user
        System.out.println("Enter the Student name");
        String name = sc.next();

        System.out.println("Enter the Student roll number");
        int roll = sc.nextInt();

        System.out.println("Enter the Student marks");
        double marks = sc.nextDouble();

        // Create a report object and set the student details
        report obj = new report();
        obj.setName(name);
        obj.setRoll(roll);
        obj.setMarks(marks);

        // Get the stored details and calculate the grade
        name = obj.getName();
        roll = obj.getRoll();
        marks = obj.getMarks();
        char grade = obj.grade_calculation();

        // Display the student report
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.println("Marks: " + marks);

        if(grade == 'F') {
            System.out.println("Student is fail");
        } else {
            System.out.println("Student's Grade is: " + grade);
        }
    }
}

class report {
    String name;
    int roll;
    double marks;

    // Set the student name
    public void setName(String name) {
        this.name = name;
    }

    // Set the student roll number
    public void setRoll(int roll) {
        this.roll = roll;
    }

    // Set the student marks
    public void setMarks(double marks) {
        this.marks = marks;
    }

    // Return the student name
    public String getName() {
        return name;
    }

    // Return the student roll number
    public int getRoll() {
        return roll;
    }

    // Return the student marks
    public double getMarks() {
        return marks;
    }

    // Calculate the grade based on the marks
    public char grade_calculation() {
        if(marks >= 90) {
            return 'A';
        } else if(marks >= 80 && marks < 90) {
            return 'B';
        } else if(marks >= 70 && marks < 80) {
            return 'C';
        } else if(marks >= 60 && marks < 70) {
            return 'D';
        } else if(marks >= 50 && marks < 60) {
            return 'E';
        } else {
            return 'F';
        }
    }
}