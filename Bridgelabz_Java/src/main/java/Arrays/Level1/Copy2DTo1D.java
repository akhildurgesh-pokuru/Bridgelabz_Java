package Arrays.Level1;

import java.util.Scanner;

public class Copy2DTo1D {
    public static void main(String[] args) {   //Main Method present inside the class
        Scanner sc = new Scanner(System.in);     //creating object for scanner class and storing it in reference variable
        int[][] twodarray = new int[3][3];
        int i,j;
        System.out.print("Enter the values to store in 2D array");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                twodarray[i][j] = sc.nextInt();
            }
        }

        int a = 0;
        int[] singlearray = new int[3*3];
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                singlearray[a] = twodarray[i][j];
                a++;
            }
        }

        for(a=0;a< singlearray.length;a++){
            System.out.print(" "+singlearray[a]);
        }
    }
}
