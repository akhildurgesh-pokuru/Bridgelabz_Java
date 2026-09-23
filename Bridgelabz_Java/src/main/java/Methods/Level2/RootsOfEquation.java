package Methods.Level2;

import java.util.Scanner;

class findingroots{
    public int[] roots(int a, int b,int c){
        int delta = (b*b)+ 4 * a * c;
        int[] roots = new int[2];
        if(delta>0){
            roots[0] = (int) (-b + Math.sqrt(delta))/(2*a);
            roots[1] = (int) (-b - Math.sqrt(delta))/(2*a);
        }else if(delta==0){
            roots[0] = -b/(2*a);
        }
        return roots;
    }

}


public class RootsOfEquation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the Values of b: ");
        int b = sc.nextInt();
        System.out.println("Enter the Values of c: ");
        int c = sc.nextInt();
        findingroots obj = new findingroots();
        int[] roots = obj.roots(a,b,c);
        System.out.println("View the roots below");
        for(int i=0;i<roots.length;i++){
            System.out.print(" "+roots[i]);
        }
    }
}
