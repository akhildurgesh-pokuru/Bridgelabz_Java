package Strings.Level2;

/*
Generating ages for 10 students
1) generating random age for each student
2) checking whether each student is eligible to vote or not
3) storing the age and eligibility result in a 2D String array
4) finally displaying the age and voting eligibility of each student
 */

import java.util.Scanner;

class ages{
    public double[] stud_age(){   //method to generate ages of students

        double[] ages = new double[10];   //array to store ages of 10 students

        for(int i=0;i<10;i++){   //looping through each student
            ages[i] = (double)Math.random()*100+1;   //generating random age
        }

        return ages;   //returning the ages array
    }
}

class agesOfStud{
    public String[][] stud_ages(double[] ages){   //taking ages array as parameter

        String[][] data = new String[10][2];   //2D array to store age and voting eligibility

        for(int i=0;i<10;i++){   //looping through each student

            for(int j=0;j<2;j++){   //looping through age and eligibility columns

                if(j==0){   //checking the age column
                    data[i][j] = String.valueOf(ages[i]);   //converting age into String and storing it

                }else{
                    data[i][j] = (Double.parseDouble(data[i][j-1])>=18) ? "True" : "False";   //checking whether student is eligible to vote
                }
            }
        }

        return data;   //returning the student data
    }
}

public class VoteEligibility {   //main class
    public static void main(String[] args){   //main method

        Scanner sc = new Scanner(System.in);

        ages obj = new ages();   //creating object for generating ages
        double[] ages = obj.stud_age();   //generating ages for students

        agesOfStud obj2 = new agesOfStud();   //creating object for checking voting eligibility
        String[][] data = obj2.stud_ages(ages);   //calculating voting eligibility

        for(int i=0;i<10;i++){   //looping through each student

            for(int j=0;j<2;j++){   //looping through age and eligibility
                System.out.println(" " + data[i][j]);   //displaying age and eligibility
            }

            System.out.println();   //moving to the next student
        }
    }
}