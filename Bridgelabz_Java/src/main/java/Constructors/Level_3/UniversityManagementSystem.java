/*
 * This program demonstrates constructors, access modifiers, encapsulation,
 * and inheritance using a student management example.
 * The Student class stores the student's roll number, name, and CGPA.
 * The private CGPA is updated through a method instead of accessing it directly.
 * The postGraduateStudent class inherits from Student and uses the parent
 * class constructor to initialize its student details.
 * The program also demonstrates updating the CGPA of existing students
 * and displaying details of a postgraduate student.
 */

package Constructors.Level_3;

class Student {
    public int roll_num;
    protected String name;
    private double cgpa;

    // Default constructor that allows a Student object to be created without values.
    Student() {
    }

    // Constructor used to initialize the student's details.
    Student(int roll_num, String name, double cgpa) {
        this.roll_num = roll_num;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Displays the complete details of the student.
    public void student_details() {
        System.out.println("Student Roll Number: " + roll_num);
        System.out.println("Student Name: " + name);
        System.out.println("Student cgpa: " + cgpa);
    }

    // Updates the student's private CGPA value.
    public void updateCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}

class postGraduateStudent extends Student {

    // Calls the parent class constructor to initialize the student details.
    postGraduateStudent(int roll_num, String name, double cgpa) {
        super(roll_num, name, cgpa);
    }

    // Displays the inherited roll number and name of the postgraduate student.
    public void displaydetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll_num);
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {

        // Creating three student objects with their initial details.
        Student obj = new Student(10169, "Akhil", 9.71);
        Student obj1 = new Student(10180, "Abhishek", 7.9);
        Student obj2 = new Student(10147, "Sabhareesh", 8.5);

        // Displaying the details of all three students.
        obj.student_details();
        System.out.println();

        obj1.student_details();
        System.out.println();

        obj2.student_details();
        System.out.println();

        System.out.println("Results After Updating CGPA");

        // Updating the CGPA of the second student and displaying the new details.
        obj1.updateCgpa(9.8);
        obj1.student_details();

        System.out.println();

        // Updating the CGPA of the third student and displaying the new details.
        obj2.updateCgpa(9.0);
        obj2.student_details();

        System.out.println();

        System.out.println("Post Graduation Student details");

        // Creating a postgraduate student using the child class constructor.
        postGraduateStudent obj3 = new postGraduateStudent(
                10167,
                "Akhil jammisetti",
                9.5
        );

        // Displaying the inherited details of the postgraduate student.
        obj3.displaydetails();
    }
}