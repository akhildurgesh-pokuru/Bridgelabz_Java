package ObjectOrientedFundamental;

import java.util.Scanner;

class employee{

    private int id;
    private String name;
    private double salary;

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public double getSalary(){
        return this.salary;
    }


}


public class EmployeeDetails {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of employee");
        String name = sc.next();

        System.out.println("Enter the id of employee");
        int id = sc.nextInt();

        System.out.println("Enter the salary of employee");
        double salary = sc.nextDouble();

        employee obj = new employee();
        obj.setId(id);
        obj.setName(name);
        obj.setSalary(salary);

        System.out.println("Employee ID: "+obj.getId());
        System.out.println("Employee Name: "+obj.getName());
        System.out.println("Employee Salary: "+obj.getSalary());

    }
}
