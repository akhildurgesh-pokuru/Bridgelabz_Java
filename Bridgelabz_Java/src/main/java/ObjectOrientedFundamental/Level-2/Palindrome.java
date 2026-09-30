import java.util.Scanner;

public class Palindrome{
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the String");
        String word = sc.next();

        check obj = new check();
        boolean result = obj.palindrome_check(word);

        if(result){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not a palindrome");
        }

    }
}

class check{
    public boolean palindrome_check(String word){
        int i=0;
        int j=word.length()-1;
        boolean result = true;
        while(i<j){
            if(word.charAt(i)!=word.charAt(j)){
                result = false;
                break;
            }else{
                i++;
                j--;
            }
        }
       return result;
    }
}