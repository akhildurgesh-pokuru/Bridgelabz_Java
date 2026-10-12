package LinerBinaryStringConcepts;

public class PeakElementInArray {
    public static void main(String[] args){
        int[] arr = {1, 3, 8, 6, 4, 2};
        int left = 0;
        int right = arr.length-1;
        int mid = 0;
                while(left<right){
                    mid = (left+right)/2;

                    if(arr[mid]<arr[mid+1]){
                        left = mid+1;
                    }else{
                        right = mid;
                    }
                }

                if(mid==0 && (right==arr.length-1)){
                    System.out.println("No element found");
                }else{
                    System.out.println("Peak element is : "+arr[mid]);
                }

    }
}
