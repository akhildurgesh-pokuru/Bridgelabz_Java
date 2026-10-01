/*
 * This program demonstrates how a static variable can be shared
 * by multiple objects of the same class.
 * It creates two course objects with different course details,
 * while both objects use the same institute name.
 * The program then updates the static institute name using a static method.
 * Since the institute name is shared, the updated name is reflected
 * for both course objects.
 */

package Constructors.Level_2;

class course {
    String course_name;
    int duration;
    double fee;
    static String institute_name = "SRM IST";

    // Constructor used to initialize the details of each course.
    course(String course_name, int duration, double fee) {
        this.course_name = course_name;
        this.duration = duration;
        this.fee = fee;
    }

    // Displays the details of the course along with the common institute name.
    public void display_course_details() {
        System.out.println("Course Name: " + course_name);
        System.out.println("Duration: " + duration);
        System.out.println("Fee: " + fee);
        System.out.println("Institute Name: " + institute_name);
    }

    // Updates the institute name shared by all course objects.
    public static void updateInstituteName(String institute_name) {
        course.institute_name = institute_name;
    }
}

public class CourseManagement {
    public static void main(String[] args) {

        // Creating two courses with different course details.
        course obj = new course("Java Programming", 5, 45000.0);
        course obj1 = new course("Python Programming", 6, 60000);

        // Displaying the details of both courses before updating the institute name.
        obj.display_course_details();
        System.out.println();

        obj1.display_course_details();
        System.out.println();

        System.out.println("After Updating Institute Name");

        // Updating the static institute name, which affects both course objects.
        course.updateInstituteName("Saveetha University");

        // Displaying the course details again to show the updated institute name.
        obj.display_course_details();
        System.out.println();

        obj1.display_course_details();
    }
}