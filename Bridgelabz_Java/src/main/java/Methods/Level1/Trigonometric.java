package Methods.Level1;

/*program to calculate various trigonometric functions using Math class
 given an angle in degrees
 */


import java.util.Scanner;


class convert{
    public double[] calculateTrigonometricFunctions(double angle){
        double radian = Math.toRadians(angle);  //convert degrees to radian
        double sin = Math.sin(radian);  //calculate sin for radian
        double cos = Math.cos(radian);  //calculates cos for radian
        double tan = Math.tan(radian);  //calculates tan for radian
        double[] arr = new double[3];   //create array of size 3
        arr[0] = sin;  //store sin
        arr[1] = cos;  //store cos
        arr[2] = tan;  //store tan
        return arr;    //return array
    }
}

public class Trigonometric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // creating object for scanner
        System.out.print("Enter the Degrees");   // Taking input as degrees from user
        double degree = sc.nextInt();
        convert obj = new convert();    //create the object for convert class
        double[] arr = obj.calculateTrigonometricFunctions(degree);  // call the calculate trigonometric functions
        System.out.println("Sin: "+arr[0]);  //prints sin
        System.out.print("Cos: "+arr[1]);  //prints cos
        System.out.println("tan: "+arr[2]);  //prints tan
    }
}
