package Methods.Level1;

/*An athlete runs in a triangular park with sides provided as input by the user in meters.
If the athlete wants to complete a 5 km run,
then how many rounds must the athlete complete
 */


import java.util.Scanner;


class calculate_distance{
    void distance(int s1, int s2, int s3, int distance){  //created distance method
        int perimeter = s1+s2+s3;  //calculates the perimeter
        double rounds = (double) distance /perimeter;  //calculates number of rounds should athlete run
        System.out.println("The Athlete should run "+rounds+" rounds to complete his distance");  //prints how many rounds do athlete run
    }
}

public class AthleteRuns {  //main class
    public static void main(String[] args) {   // main method
        Scanner sc = new Scanner(System.in);  //creating object for scanner class
        System.out.println("Enter the Sides of a Triangle");
        int s1 = sc.nextInt();   //first side distance of triangle
        int s2 = sc.nextInt();   //second side distance of triangle
        int s3 = sc.nextInt();   //third side distance of triangle
        System.out.println("Enter the Distance(in KM) that Athlete wants to run");
        int distance = sc.nextInt();   //Taking input distance from user
        calculate_distance cd = new calculate_distance();   //create the object for calculate distance class
        cd.distance(s1,s2,s3,distance);  // call the distance method
    }
}
