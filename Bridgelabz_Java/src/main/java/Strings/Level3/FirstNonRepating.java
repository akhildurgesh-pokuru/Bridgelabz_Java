
package Strings.Level3;

import java.util.Scanner;

/*
Finding the first non-repeating character from a string
1) finding the length of the string
2) checking the frequency of each character
3) finding the first character whose frequency is one
*/

class find_length1{
    public int length(String s1){ //taking string as parameter
        int count = 0,i=0;

        for(char ch : s1.toCharArray()){ //looping through the string
            count++; //counting each character
        }

        return count; //returning the length
    }
}

class unique1{
    public char[] uniq_char(String s1,int length){ //taking string and length as parameters
        char[] arr = new char[1]; //array to store the first non-repeating character
        int count = 0,k=0;

        for(int i=0;i<length;i++){ //looping through the string
            count = 0;

            for(int j=0;j<length;j++){ //looping through the string to find frequency
                if(s1.charAt(i)==s1.charAt(j)){ //checking whether characters are equal
                    count++; //increasing the frequency
                }
            }

            if(count==1){ //checking whether character occurs only once
                arr[k] = s1.charAt(i); //storing the first non-repeating character
                break; //stopping after finding the first character
            }
        }

        return arr; //returning the character
    }
}

public class FirstNonRepating {
    public static void main(String[] args){ //main method
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String"); //taking string input
        String s1 = sc.next();

        find_length1 obj1 = new find_length1(); //creating object to find length
        int length = obj1.length(s1); //finding the length
        System.out.println(length); //printing the length

        unique1 obj = new unique1(); //creating object to find unique character
        char[] unique = obj.uniq_char(s1,length); //finding first non-repeating character

        for(char c : unique){ //looping through the result
            System.out.print(" " + c); //printing the first non-repeating character
        }
    }
}