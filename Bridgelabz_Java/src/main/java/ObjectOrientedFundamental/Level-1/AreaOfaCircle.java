
import java.util.Scanner;


public class AreaOfaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the circle");
        double radius = sc.nextDouble();

        circle obj = new circle(radius);

       double area =  obj.result();

       System.out.println(area);

       
    }
}



class circle{
   private final double radius;
     circle(double radius){
        this.radius = radius;
    }

    public double result(){
        double area = 3.14 * radius * radius;
        return area;
    }

}

