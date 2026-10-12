package LinerBinaryStringConcepts;

public class RotationPoint {
    public static void main(String[] args){
        int[] arr = {40, 50, 60, 70, 10, 20, 30};
        int left = 0;
        int right = arr.length-1;
        int mid = 0;

        while(left < right){
            mid = (left+right)/2;
            if(arr[mid]>arr[right]){
                left = mid+1;
            }else{
                right = mid;
            }
        }

        System.out.println("Index: "+arr[mid]);
    }
}
