/*
 * Program to demonstrate a University Student Management System
 * using final, static, this, and instanceof concepts in Java.
 */

package ThisStaticFinal;

class university {
    // final roll number cannot be changed after initialization.
    final int roll_number;

    // Static variable is shared by all university objects.
    static String university_name = "SRM University";

    // Keeps track of the total number of students created.
    static int total_students;

    String student_name;
    char grade;

    university(int roll_number, String student_name, char grade) {
        // Initialize student details using the current object.
        this.roll_number = roll_number;
        this.student_name = student_name;
        this.grade = grade;

        // Increase the total student count when a new object is created.
        total_students++;
    }

    // Static method displays the total number of students.
    public static void total_Students() {
        System.out.println("Total Students: " + total_students);
    }

    // Display the details of a particular student.
    public void students() {
        System.out.println("University name: " + university_name);
        System.out.println("Roll Number: " + roll_number);
        System.out.println("Student Name: " + student_name);
        System.out.println("Grade: " + grade);
    }
}

public class UniversityStudentManagement {
    public static void main(String[] args) {

        // Create two university student objects.
        university obj = new university(10169, "Akhil", 'O');
        university obj1 = new university(10180, "Abhishek", 'A');

        // Display details of the first student.
        obj.students();
        System.out.println();

        // Display details of the second student.
        obj1.students();
        System.out.println();

        // Call the static method using the class name.
        university.total_Students();

        System.out.println();

        // Check whether obj is an instance of the university class.
        if (obj instanceof university) {
            System.out.println("Yes obj is instance of university");
        }
    }
}