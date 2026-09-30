package Strings.Level2;

/*
Generating marks for 10 students in 3 subjects
1) generating random marks for each student
2) calculating total, average and percentage
3) finding the grade based on percentage
4) finally displaying the marks, average, percentage and grade
 */

import java.util.Scanner;

class marks{
    public double[][] stud_marks(){   //method to generate marks for students

        double[][] marks = new double[10][3];   //2D array to store marks of 10 students in 3 subjects

        for(int i=0;i<10;i++){   //looping through each student
            for(int j=0;j<3;j++){   //looping through each subject
                marks[i][j] = (double) Math.random()*100+1;   //generating random marks
            }
        }

        return marks;   //returning the marks array
    }
}


class calculations{
    public double[][] calculate(double[][] marks){   //taking marks array as parameter

        double[][] results = new double[10][3];   //2D array to store total, average and percentage

        for(int i=0;i<10;i++){   //looping through each student

            for(int j=0;j<3;j++){   //looping through the three calculations

                if(j==0){   //calculating total marks
                    results[i][j] = marks[i][j] + marks[i][j+1] + marks[i][j+2];

                }else if(j==1){   //calculating average marks
                    results[i][j] = results[i][j-1] / 3;

                }else if(j==2){   //calculating percentage
                    results[i][j] = ((results[i][j-2]) / 300) * 100;
                }
            }
        }

        return results;   //returning the calculated results
    }
}


class grades{
    public String[] stud_grades(double[][] operations){   //taking calculated results as parameter

        String[] grades = new String[10];   //array to store grades of 10 students
        int k=0;

        for(int i=0;i<10;i++){   //looping through each student

            for(int j=0;j<3;j++){   //looping through total, average and percentage

                if(j==2){   //checking only the percentage

                    double percentage = operations[i][j];   //storing percentage in a variable

                    if(percentage<=39.0){   //checking if percentage is below 40
                        grades[k] = "R";
                        k++;

                    }else if(percentage>=40 && percentage<=49){   //checking percentage between 40 and 49
                        grades[k] = "E";
                        k++;

                    }else if(percentage>=50 && percentage<=59){   //checking percentage between 50 and 59
                        grades[k] = "D";
                        k++;

                    }else if(percentage>=60 && percentage<=69){   //checking percentage between 60 and 69
                        grades[k] = "C";
                        k++;

                    }else if(percentage>=70 && percentage<=79){   //checking percentage between 70 and 79
                        grades[k] = "B";
                        k++;

                    }else if(percentage>=80 && percentage<=89){   //checking percentage between 80 and 89
                        grades[k] = "A";
                        k++;
                    }
                }
            }
        }

        return grades;   //returning the grades array
    }
}


public class StudentGrades {   //main class
    public static void main(String[] args){   //main method

        Scanner sc = new Scanner(System.in);

        marks obj = new marks();   //creating object for generating marks
        double[][] marks = obj.stud_marks();   //generating marks for students

        calculations obj1 = new calculations();   //creating object for calculations
        double[][] operations = obj1.calculate(marks);   //calculating total, average and percentage

        grades obj2 = new grades();   //creating object for finding grades
        String[] stud_grades = obj2.stud_grades(operations);   //finding grades based on percentage


        int k=0;

        for(int i=0;i<10;i++){   //looping through each student

            for(int j=0;j<4;j++){   //looping through total, average, percentage and grade

                if(j==3){   //checking the grade column
                    System.out.print(" " + stud_grades[k]);   //displaying the grade
                    k++;

                }else{
                    System.out.print(" " + operations[i][j] + "   ");   //displaying total, average and percentage
                }
            }

            System.out.println();   //moving to the next student
        }
    }
}