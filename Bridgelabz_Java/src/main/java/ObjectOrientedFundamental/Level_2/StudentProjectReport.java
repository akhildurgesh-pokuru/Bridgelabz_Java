import java.util.Scanner;

public class StudentProjectReport{
    public static void main(String[] args){
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter the Student name");
        String name = sc.next();
        System.out.println("Enter the Student roll number");
        int roll = sc.nextInt();
        System.out.println("Enter the Student marks");
        double marks = sc.nextDouble();

        report obj = new report();
        obj.setName(name);
        obj.setRoll(roll);
        obj.setMarks(marks);

        name = obj.getName();
        roll = obj.getRoll();
        marks = obj.getMarks();
        char grade = obj.grade_calculation();

        System.out.println("Name: "+name);
        System.out.println("Roll Number: "+roll);
        System.out.println("Marks: "+marks);

        if(grade=='F'){
            System.out.println("Student is fail");
        }else{
            System.out.println("Student's Grade is: "+grade);
        }


    }
}

class report{
    String name;
    int roll;
    double marks;


    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int roll){
        this.roll = roll;
    }

    public void setMarks(double marks){
        this.marks = marks;
    }

    public String getName(){
        return name;
    }

    public int getRoll(){
        return roll;
    }

    public double getMarks(){
        return marks;
    }



    public char grade_calculation(){
        if(marks>=90){
            return 'A';
        }else if(marks>=80 && marks<90){
            return 'B';
        }else if(marks>=70 && marks<80){
            return 'C';
        }else if(marks>=60 && marks<70){
            return 'D';
        }else if(marks>=50 && marks<60){
            return 'E';
        }else{
            return 'F';
        }
    }


}