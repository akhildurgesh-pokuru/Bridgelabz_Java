package Methods.Level3;
/*program to find the 3 points that are collinear using the slope formulae and
area of triangle formulae. check  A (2, 4), B (4, 6) and C (6, 8) are Collinear for sampling.
 */


import java.util.Scanner;

class check{


    public boolean collinearcheck(int x1,int y1,int x2,int y2,int x3,int y3){
        int ab = (y2-y1)/(x2-x1);   //calculate slope of ab
        int bc = (y3-y2)/(x3-x2);   //calculate slope of bc
        int ac = (y3-y1)/(x3-x1);   //calculate slope of ac
        if(ab==bc && ab==ac && bc==ac){    //check if slopes are equal
            return true;   //returns true
        }else{
            return false;   //returns false
        }
    }

    public boolean collinearcheck_using_traingle_formulae(int x1,int y1,int x2,int y2,int x3,int y3){
        int area = (int)  (0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)));  //triangle formulae calculation
        if(area==0){   //check if area is equal to zero
            return true;   //returns zero if true
        }
        return false;  //returns false if not equal to zero
    }
}

public class CollinearCheck {   //main class
    public static void main(String[] args){  //main method of main class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x1 value: ");   //take x1 input from user
        int x1 = sc.nextInt();
        System.out.println("Enter the y1 value: ");   //take y1 input from user
        int y1 = sc.nextInt();
        System.out.println("Enter the x2 value: ");   //take x2 input from user
        int x2 = sc.nextInt();
        System.out.println("Enter the y2 value: ");   //take y2 input from user
        int y2 = sc.nextInt();
        System.out.println("Enter the x3 value: ");   //take x3 input from user
        int x3 = sc.nextInt();
        System.out.println("Enter the y3 value: ");   //take y3 input from user
        int y3 = sc.nextInt();
        check obj = new check();
        boolean result = obj.collinearcheck(x1,y1,x2,y2,x3,y3);  //call the collinearcheck method
        boolean formuale_result = obj.collinearcheck_using_traingle_formulae(x1,y1,x2,y2,x3,y3);  // call the collinesr check method by using traingle formulae
        System.out.println("Have a Look at Results Below");
        System.out.println("Result with slopes: "+result);   //result with slopes calculation
        System.out.println("Result with Traingle Formulae: "+formuale_result);   //results with triangle formulae calculation
    }
}
