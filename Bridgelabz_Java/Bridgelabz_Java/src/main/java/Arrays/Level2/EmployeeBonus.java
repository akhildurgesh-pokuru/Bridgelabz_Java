package Arrays.Level2;

/*program to find the bonus of 10 employees based on their years of service and
the total bonus amount the company Zara has to pay,
along with the old and new salary.
5% for Employees who have greater than 5yrs experience
2% for Employees who have less than 5yrs experience
 */

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args){    //Main Method present inside the class
        Scanner sc = new Scanner(System.in);     //creating object for scanner class and storing it in reference variable
        int[] year = new int[10];   //create an array to store ages of size 10
        int[] salary = new int[10];   //create an array to store salaries of size 10
        int i,j,k;
        System.out.println("Enter the years of experience of each employee: ");
        for(i=0;i<year.length;i++){
            year[i] = sc.nextInt();   //storing the years of experience of each employee
        }
        System.out.println("Enter the salaries of each employee: ");
        for(j=0;j<salary.length;j++){
            salary[j] = sc.nextInt();     //storing the salaries of each employee
        }

        int sal;
        double bonus;
        int[] result = new int[10];
        for(k = 0;k<year.length;k++){
            if(year[k]>5){       //condition check for experience greater than 5
                sal = salary[k];
                bonus = 0.05 * salary[k];    //calculating bonus for 5%
                result[k] = (int) (bonus+sal);   //adding bonus+old salary to result array
            }else{
                sal = salary[k];
                bonus = 0.02 * salary[k];     //calculating bonus for 2%
                result[k] = (int) (bonus+sal);  //adding bonus+old salary to result array
            }
        }

        for(k=0;k<result.length;k++){
            System.out.print(" "+result[k]);   //Displaying the new salary of each employee
        }
    }
}
