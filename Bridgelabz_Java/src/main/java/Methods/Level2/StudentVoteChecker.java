package Methods.Level2;

import java.util.Scanner;

class eleigibility{
    public boolean canStudentVote(int age){
        if(age>=18){
            return true;
        }else{
            return false;
        }
    }
}

public class StudentVoteChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        eleigibility obj = new eleigibility();
        for(int i=0;i<10;i++){
            System.out.println("Enter the age of student "+(i+1)+": ");
            int age = sc.nextInt();
            if(age>0) {
                ages[i] = age;
                boolean result = obj.canStudentVote(age);
                if (result) {
                    System.out.println("Student has Eligibility to Vote");
                } else {
                    System.out.println("Student does not has Eligibility to vote");
                }
            }else{
                System.out.println("Enter the Age in Positive Integer");
                i--;
            }
        }

        System.out.println("Ages of the Student You have Entered are: ");
        for(int j=0;j<ages.length;j++){
            System.out.println("Student-"+(j+1)+" Age: "+ages[j]);
        }
    }
}
