package Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();
        System.out.println("Enter the number");
        int num = sc.nextInt();

        String result = "";
        int i=1;
        while(i<=num){
            result = "";
            int temp = i;
            while(temp!=0){
                int n = temp%2;
                result = result.concat(String.valueOf(n));
                temp = temp/2;
            }
            queue.offer(result);
            i++;
        }

        System.out.println(queue);
    }
}
