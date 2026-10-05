package ObjectModeling;

import java.util.ArrayList;
import java.util.List;

class Employees{
    int emp_id;
    String emp_name;

    Employees(int emp_id,String name){
        this.emp_id=emp_id;
        this.emp_name = name;
    }

    public void displayEmployeedetails(){
        System.out.println("Employee Name: "+emp_name);
        System.out.println("Employee id: "+emp_id);
        System.out.println();
    }

}

class Departments{
    String dept_name;
    List<Employees> employee;

    Departments(String dept_name){
        this.dept_name = dept_name;
        this.employee = new ArrayList<>();

        employee.add(new Employees(122,"Akhil"));
        employee.add(new Employees(311,"Charan"));
    }

    public void employeedetails() {
        System.out.println("Department : "+dept_name);

        for (Employees employ : employee) {
            employ.displayEmployeedetails();
        }
    }
}

class Company{
    String company_name;
    List<Departments> department;
    Company(String company_name){
        department = new ArrayList<>();
        department.add(new Departments("HR"));
        department.add(new Departments("Developing"));
        department.add(new Departments("Testing"));
    }

    void disCompany(){
        System.out.println("Company: "+company_name);

        for(Departments department : department){
            department.employeedetails();
        }
    }
}



public class CompanyManagementSystem {
    public static void main(String[] args){
        Company company = new Company("Akhil Technology");

        company.disCompany();
    }
}
