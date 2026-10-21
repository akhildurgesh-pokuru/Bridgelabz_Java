package Generics;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

class JobRole{
    String name;
    String role;

    JobRole(String name, String role){
        this.name = name;
        this.role = role;
    }

    public void displayDetails(){
        System.out.println("Name: "+name+" Role: "+role);
        System.out.println();
    }

}

class SoftwareEngineer extends JobRole{
    SoftwareEngineer(String name, String role){
        super(name, role);
    }
}

class DataScientist extends JobRole{
    DataScientist(String name, String role){
        super(name, role);
    }
}

class ProductManager extends JobRole{
    ProductManager(String name, String role){
        super(name, role);
    }
}

class Resume<T extends JobRole>{
    List<T> resumes;
    Resume(){
        resumes = new ArrayList<>();
    }

    public void addResume(T resume){
        resumes.add(resume);
    }
}

class displayResume{
    public void resumes_present(List<? extends JobRole> resumes){
        for(JobRole resume : resumes){
            resume.displayDetails();
        }
    }
}

public class AIDrivenResumeScreening {
    public static void main(String[] args){
        Resume<JobRole> jobRoleResume = new Resume<>();
        jobRoleResume.addResume(new SoftwareEngineer("akhil","Software Developer"));
        jobRoleResume.addResume(new DataScientist("Charan","Data Scientist"));
        jobRoleResume.addResume(new ProductManager("Vishruth","Product Manager"));

        displayResume resume = new displayResume();
        resume.resumes_present(jobRoleResume.resumes);
    }
}
