package Collections.List;

import java.util.LinkedList;

class list{
    int data;
    list next;

    list(int x){
        this.data = x;
        this.next = null;
    }
}


class reverseOperations{
    list head = null, current = null;

    public int[] arraylist(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right --;
        }

        return arr;
    }

    public void createLinkedList(int x){
        list newnode = new list(x);
        if(head == null){
           current =  head = newnode;
        }else{
            current.next = newnode;
            current = newnode;
        }
    }

    public void reverseLinkedList(){
         list prev = null, curr = head, next = null;
         while(curr!=null){
             next = curr.next;
             curr.next = prev;
             prev = curr;
             curr = next;
         }

         head = prev;

         list temp = head;
         while(temp!=null){
             System.out.print(" "+temp.data);
             temp = temp.next;
         }
         System.out.println();
    }

}


public class ReverseList {
    public static void main(String[] args){
        reverseOperations list = new reverseOperations();
        int[] arr = {1,2,3,4,5};
        list.arraylist(arr);

        for(int i : arr){
            System.out.print(" "+i);
        }

        System.out.println();

        list.createLinkedList(10);
        list.createLinkedList(20);
        list.createLinkedList(30);

        list.reverseLinkedList();

    }
}
