
/*
 * This program rotates the elements of an array by a specified number of positions.
 * It uses the reversal technique to rearrange the elements and displays the result.
 */

package Collections.List;

import java.util.Scanner;

class rotate {

    // Rotates the array by reversing the entire array and then its individual parts.
    public void rotated_list(int[] arr, int rotations) {
        rotateTheList(arr, 0, arr.length-1);
        rotateTheList(arr, 0, rotations-1);
        rotateTheList(arr, rotations, arr.length-1);

        // Prints the array after rotation.
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }

    }

    // Reverses the elements within the specified low and high indices.
    public void rotateTheList(int[] arr, int low, int high) {
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};

        // Reads how many positions the array should be rotated.
        System.out.println("Enter the number of rotations to be happen");
        int rotations = sc.nextInt();

        // Creates the rotation object and performs the operation.
        rotate obj = new rotate();
        obj.rotated_list(arr, rotations);
    }
}
