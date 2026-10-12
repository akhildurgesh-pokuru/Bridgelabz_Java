package LinerBinaryStringConcepts;


/*
below program performs the linear search algorithm for
finding the negative number in the array
 */

public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {2,6,13,75,1,-9,4,0,1}; // array of integers with negative integer
        for (int j : arr) {   //traverse the loop through the array
            if (j < 0) {  //condition to check if element is less than zero
                System.out.println(j);  //printing the element
                break;  //exit from loop
            }
        }
    }
}
