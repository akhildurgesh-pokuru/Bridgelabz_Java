
/*
 * This program demonstrates an AI-driven resume screening concept using Java Generics.
 * It stores different job roles and displays their details using bounded types and wildcards.
 */

package Generics;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

// Base class that stores common details for different job roles.
class JobRole {
    String name;
    String role;

    JobRole(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + " Role: " + role);
        System.out.println();
    }
}

// Each subclass represents a specific job role.
class SoftwareEngineer extends JobRole {
    SoftwareEngineer(String name, String role) {
        super(name, role);
    }
}

class DataScientist extends JobRole {
    DataScientist(String name, String role) {
        super(name, role);
    }
}

class ProductManager extends JobRole {
    ProductManager(String name, String role) {
        super(name, role);
    }
}

// Bounded generic class that accepts only JobRole types or their subclasses.
class Resume<T extends JobRole> {
    List<T> resumes;

    Resume() {
        resumes = new ArrayList<>();
    }

    public void addResume(T resume) {
        resumes.add(resume);
    }
}

class displayResume {
    // The wildcard allows a list containing any type that extends JobRole.
    public void resumes_present(List<? extends JobRole> resumes) {
        for (JobRole resume : resumes) {
            resume.displayDetails();
        }
    }
}

public class AIDrivenResumeScreening {
    public static void main(String[] args) {
        // Create a resume collection and add candidates from different job roles.
        Resume<JobRole> jobRoleResume = new Resume<>();
        jobRoleResume.addResume(new SoftwareEngineer("akhil", "Software Developer"));
        jobRoleResume.addResume(new DataScientist("Charan", "Data Scientist"));
        jobRoleResume.addResume(new ProductManager("Vishruth", "Product Manager"));

        // Display the details of all candidates in the collection.
        displayResume resume = new displayResume();
        resume.resumes_present(jobRoleResume.resumes);
    }
}
