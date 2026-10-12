package LinerBinaryStringConcepts;

/*
Below program performs binary search for particular array
to find out the target element
 */

class Search{
    public int binary(int[] arr, int target){
        int low = 0;  //low pointer points to first element in array
        int high = arr.length-1;   //high pointer points to last element in array

        while(low<high){
            int mid = (low+high)/2;   //finding mid element
            if(arr[mid]==target){  //if mid is equal to target return mid;
                return mid;
            }

            if(target>mid){   //if target id greater than mid , them make low pointer point to mid+1 element
                low = mid+1;
            }else{
                high = mid-1;  //else high points to mid-1
            }

        }
        return 0;  //if element not found returns 0;
    }
}

public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {1,4,4,6,7,9,12,16,19};  //sorted array
        int target = 16; //target element
        Search search = new Search();
        System.out.println(search.binary(arr, target));   //calling binary method
    }
}
