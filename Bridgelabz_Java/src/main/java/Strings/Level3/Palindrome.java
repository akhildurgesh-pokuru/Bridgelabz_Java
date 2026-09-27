package Strings.Level3;

import java.util.Scanner;

/*
Checking whether a string is palindrome
1) storing the string characters in a character array
2) comparing characters from both ends
3) checking whether the string is palindrome or not
*/

class palindrome_check{
    public boolean check(String s){ //taking string as parameter
        char[] arr = new char[s.length()]; //character array to store string characters

        for(int i=0;i<s.length();i++){ //looping through the string
            arr[i] = s.charAt(i); //storing each character in the array
        }

        boolean result = true;
        int left = 0;
        int right = arr.length-1;

        while(left<right){ //checking characters from both ends
            if(arr[left]!=arr[right]){ //checking whether characters are different
                result = false;
                break; //stopping when characters are different
            }
            left++;
            right--;
        }

        return result; //returning palindrome result
    }
}

public class Palindrome {
    public static void main(String[] args){ //main method
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: "); //taking string input
        String s = sc.next();

        palindrome_check obj = new palindrome_check(); //creating object
        boolean result = obj.check(s); //checking whether string is palindrome

        if(result){ //checking result
            System.out.println("Yeah! the string is palindrome");
        }else{
            System.out.println("nope! the string is not palindrome");
        }
    }
}