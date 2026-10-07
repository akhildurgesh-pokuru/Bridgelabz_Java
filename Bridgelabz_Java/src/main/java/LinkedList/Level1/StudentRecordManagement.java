package LinkedList;

class Student{
    int roll_num;
    String name;
    int age;
    char grade;
    Student next;

    Student(int roll_num, String name, int age, char grade){
        this.roll_num = roll_num;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}


class StudentOperations{
    Student head = null;
    Student tail = head;

    public void InsertAtBeginning(int roll_num, String name, int age, char grade){
        Student student =  new Student(roll_num,name,age,grade);
        student.next = null;
        if(head==null){
            head = student;
        }else{
            student.next = head;
            head = student;
        }
    }

    public void InsertAtEnd(int roll_num, String name, int age, char grade){
        Student student = new Student(roll_num,name,age,grade);
        student.next = null;

        if(tail==null){
            head = tail = student;
        }else{
            while(tail.next!=null){
                tail =tail.next;
            }
            tail.next = student;
            tail = student;
        }

    }

    public void InsertAtPosition(int roll_num, String name, int age, char grade, int pos){
        Student student = new Student(roll_num,name,age,grade);
        student.next = null;

        if(head==null){
            head=tail=student;
        }else{
            int i=1;
            Student current = head;
            while(i<pos-1){
                current = current.next;
                i++;
            }

            student.next = current.next.next;
            current.next = student;
        }

    }

    public void DeleteByRollNumber(int roll_number){
        Student current = head;

        if(head==null){
            System.out.println("List is Empty");
        }else if(current.roll_num==roll_number){
            head = current.next;
        }else{
            while(current.next.roll_num!=roll_number){
                current = current.next;
            }

            current.next = current.next.next;
        }

    }

    public void SearchByRollNumber(int roll_num){
        Student current = head;

        while(current.roll_num==roll_num){
            System.out.println("= Roll Number: "+current.roll_num);
            System.out.println(" Name: "+current.name);
            System.out.println("Age: "+current.age);
            System.out.println(" grade: "+current.grade);
        }
    }

    public void DisplayStudentRecords(){
        Student current = head;

        if(head==null){
            System.out.println("List is Empty");
        }else{
            while(current.next!=null){
                System.out.println("Roll Number: "+current.roll_num);
                System.out.println(" Name: "+current.name);
                System.out.println("Age: "+current.age);
                System.out.println(" grade: "+current.grade);
                System.out.println();
                current = current.next;
            }
        }
    }

    public void UpdateGrade(int roll_num, char grade){
        Student current = head;

        if(head==null){
            System.out.println("List is empty");
        }else{

            while(current.roll_num==roll_num){
                current.grade = grade;
            }
            System.out.println("Check the Updated Details Below");
            System.out.println("Roll Number: "+current.roll_num);
            System.out.println("Student Name: "+current.name);
            System.out.println("Age: "+current.age);
            System.out.println(" grade: "+current.grade);
            System.out.println();
        }

    }


}


public class StudentRecordManagement {
    public static void main(String[] args){
        StudentOperations student = new StudentOperations();
        student.InsertAtBeginning(169,"Akhil",20,'C');
        student.InsertAtBeginning(180,"Abhishek",21,'A');
        student.InsertAtEnd(182,"hemanth",19,'O');
        student.InsertAtEnd(190,"venky",45,'O');
        student.DisplayStudentRecords();

        student.InsertAtPosition(155,"Vishruth",12,'A',3);
        student.DisplayStudentRecords();

        student.DeleteByRollNumber(169);
        student.DisplayStudentRecords();

        student.SearchByRollNumber(190);
        student.UpdateGrade(180,'B');
        student.DisplayStudentRecords();
    }
}
