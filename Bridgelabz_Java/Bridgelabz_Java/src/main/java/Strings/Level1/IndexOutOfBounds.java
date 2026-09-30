package Strings.Level1;

/*
Below program demonstrates index out of bounds exception
 */

class index{
    public void check(){
        int[] arr = {1,2,3,5,6};    //array of integers
        try{
            System.out.println("character at: "+arr[90]);   //trying to print the element at opth index
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception is: "+e.getMessage());   //handling the type of exception
        }
    }
}

public class IndexOutOfBounds {  //main class
    public static void main(String[] args){  //main method
        index obj = new index();   //creating object for index class
        obj.check();  //calling the check method
    }
}
