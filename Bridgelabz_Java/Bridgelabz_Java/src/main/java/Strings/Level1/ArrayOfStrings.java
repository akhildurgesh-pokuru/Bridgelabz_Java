package Strings.Level1;
/*
Below Program Perform the Array Index out of bounds Exception with array containing Strings
 */

class Array_Exception{
    public void check(){
        String[] arr = {"akhil","charan","vishruth"};    //Array of Strings
        try{
            System.out.println("character at: "+arr[90]);    //trying to get the element at index 90;
        }catch(ArrayIndexOutOfBoundsException e){    //throwing an exception
            System.out.println("Exception is: "+e.getMessage());   //it returns what type of message does it throws
        }
    }
}

public class ArrayOfStrings {     //main class
    public static void main(String[] args){     //main method
        Array_Exception obj = new Array_Exception();   //create method for Array_Exception class
        obj.check();   //call the method
    }
}
