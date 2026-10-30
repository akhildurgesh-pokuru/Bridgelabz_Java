package Annotations.CustomAnnotation;

/*
below code demonstrates the
creation og custom annotation and applying to classes
 */

import java.lang.annotation.*;
import java.lang.reflect.*;

// Creating a custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@interface EmployeeInfo {
    String name();
    String department();
}

// Applying annotation to a class
@EmployeeInfo(name = "Akhil", department = "Development")
class Employee {

    // Applying annotation to a method
    @EmployeeInfo(name = "Akhil", department = "Java Development")
    public void employeeDetails() {
        System.out.println("Employee details");
    }

    // Applying annotation to another method
    @EmployeeInfo(name = "Akhil", department = "Testing")
    public void employeeTesting() {
        System.out.println("Employee testing");
    }
}

public class Main {

    public static void main(String[] args) throws Exception {

        Employee emp = new Employee();

        // Calling employee methods
        emp.employeeDetails();
        emp.employeeTesting();

        // Retrieving class annotation
        EmployeeInfo classInfo = Employee.class.getAnnotation(EmployeeInfo.class);

        System.out.println("\nClass Annotation:");
        System.out.println("Name: " + classInfo.name());
        System.out.println("Department: " + classInfo.department());

        // Retrieving method annotations
        Method[] methods = Employee.class.getDeclaredMethods();

        for (Method method : methods) {

            if (method.isAnnotationPresent(EmployeeInfo.class)) {

                EmployeeInfo info = method.getAnnotation(EmployeeInfo.class);

                System.out.println("\nMethod: " + method.getName());
                System.out.println("Name: " + info.name());
                System.out.println("Department: " + info.department());
            }
        }
    }
}
