
/*
 * This program demonstrates a university course management system using Java Generics.
 * It stores different course types and displays their details using inheritance and wildcards.
 */

package Generics;

import java.util.ArrayList;
import java.util.List;

// Base class containing common information for all course types.
class CourseType {
    int id;
    String name;

    CourseType(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void displayDetails() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
    }
}

// Represents courses that focus on examinations.
class ExamCourse extends CourseType {
    ExamCourse(int id, String name) {
        super(id, name);
    }
}

// Represents courses that focus on assignments.
class AssignmentCourse extends CourseType {
    AssignmentCourse(int id, String name) {
        super(id, name);
    }
}

// Represents courses that focus on research.
class ResearchCourse extends CourseType {
    ResearchCourse(int id, String name) {
        super(id, name);
    }
}

// Generic class that stores CourseType objects and their subclasses.
class Course<T extends CourseType> {
    List<T> courses;

    Course() {
        courses = new ArrayList<>();
    }

    public void addCourse(T course) {
        courses.add(course);
    }

    public void displayDetails() {
        for (T course : courses) {
            course.displayDetails();
            System.out.println();
        }
    }
}

class courses {
    // The wildcard allows this method to display any subtype of CourseType.
    public void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            course.displayDetails();
        }
    }
}

public class UniversityCourseManagementSystem {
    public static void main(String[] args) {
        // Create a course collection and add exam, assignment, and research courses.
        Course<CourseType> exam = new Course<>();
        exam.addCourse(new ExamCourse(112, "Math Exam Course"));
        exam.addCourse(new ExamCourse(134, "Data Structure Exam Guide"));

        exam.addCourse(new AssignmentCourse(100, "Philosophy Assignment course"));
        exam.addCourse(new AssignmentCourse(101, "Nature Behaviour Assignment Course"));

        exam.addCourse(new ResearchCourse(50, "Electrical Circuits Research Course"));
        exam.addCourse(new ResearchCourse(52, "Nano Ai Tech Research Course"));

        // Display the details of all courses in the collection.
        courses course = new courses();
        course.displayCourses(exam.courses);
    }
}
