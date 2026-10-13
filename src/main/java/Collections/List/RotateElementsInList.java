package Collections.List;

import java.util.Scanner;

class rotate{
    public void rotated_list(int[] arr, int rotations){
        rotateTheList(arr, 0, arr.length-1);
        rotateTheList(arr, 0, rotations-1);
        rotateTheList(arr, rotations, arr.length-1);

        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }

    }

    public void rotateTheList(int[] arr, int low, int high){
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}


public class RotateElementsInList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Enter the number of rotations to be happen");
        int rotations = sc.nextInt();
        rotate obj = new rotate();
        obj.rotated_list(arr, rotations);
    }
}
