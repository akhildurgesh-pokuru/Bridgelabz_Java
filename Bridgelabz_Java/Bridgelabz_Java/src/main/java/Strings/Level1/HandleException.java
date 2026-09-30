package Strings.Level1;

/*
Below code demonstrates Null pointer exception program
 */

class nullpointer{
    public void nullexception(){
        String text = null;     //assigned initially text is null
        System.out.println(text.length());   //finding the length but it gives an exception of null pointer
    }
}

class handling_null_pointer{
    public void handling(){   //handling method
        String text = null;    //initially string is null
        try{
            System.out.println("text length: "+text.length());  //trying to find the length of text
        }catch(NullPointerException e){   //ocuurs when program has occuring null pointer exception
            System.out.println("Exception is: "+e.getMessage());  //printing to read what type of exception
        } catch (RuntimeException e) {  //it states on runtime exception
            throw new RuntimeException(e);   //throwing runtime exception
        }
    }
}

public class HandleException {   //main class
    public static void main(String[] args){  //main method
        nullpointer obj = new nullpointer();   //creating object of null pointer class
        obj.nullexception();  //calling the method
        handling_null_pointer obj1 = new handling_null_pointer();  //creating object for handling null pointer
        obj1.handling();  //calling handling method
    }
}
