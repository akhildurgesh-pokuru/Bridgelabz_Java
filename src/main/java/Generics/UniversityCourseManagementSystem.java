package Generics;

import java.util.ArrayList;
import java.util.List;

class CourseType{
    int id;
    String name;

    CourseType(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void displayDetails(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
    }
}

class ExamCourse extends CourseType{
    ExamCourse(int id, String name){
        super(id, name);
    }
}

class AssignmentCourse extends CourseType{
    AssignmentCourse(int id, String name){
        super(id, name);
    }
}

class ResearchCourse extends CourseType{
    ResearchCourse(int id, String name){
        super(id, name);
    }
}

class Course<T extends CourseType>{
    List<T> courses;
    Course(){
        courses = new ArrayList<>();
    }

    public void addCourse(T course){
        courses.add(course);
    }

    public void displayDetails(){
        for(T course : courses){
            course.displayDetails();
            System.out.println();
        }
    }
}

class courses{
    public void displayCourses(List<? extends CourseType> courses){
        for(CourseType course : courses){
            course.displayDetails();
        }
    }
}



public class UniversityCourseManagementSystem {
    public static void main(String[] args){
        Course<CourseType> exam = new Course<>();
        exam.addCourse(new ExamCourse(112,"Math Exam Course"));
        exam.addCourse(new ExamCourse(134,"Data Structure Exam Guide"));

        exam.addCourse(new AssignmentCourse(100,"Philosophy Assignment course"));
        exam.addCourse(new AssignmentCourse(101,"Nature Behaviour Assignment Course"));

        exam.addCourse(new ResearchCourse(50,"Electrical Circuits Research Course"));
        exam.addCourse(new ResearchCourse(52,"Nano Ai Tech Research Course"));

        courses course = new courses();
        course.displayCourses(exam.courses);
    }
}
