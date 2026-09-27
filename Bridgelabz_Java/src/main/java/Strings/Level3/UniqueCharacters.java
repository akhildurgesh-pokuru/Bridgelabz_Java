package Strings.Level3;

import java.util.Scanner;

/*
Finding unique characters from a string
1) finding the length of the string
2) finding the frequency of each character
3) storing characters whose frequency is one
*/

class find_length{
    public int length(String s1){ //taking string as parameter
        int count = 0,i=0;

        for(char ch : s1.toCharArray()){ //looping through the string
            count++; //counting each character
        }

        return count; //returning the length
    }
}

class unique{
    public char[] uniq_char(String s1,int length){ //taking string and length as parameters
        char[] arr = new char[length]; //character array to store unique characters
        int count = 0,k=0;

        for(int i=0;i<length;i++){ //looping through the string
            count = 0;

            for(int j=0;j<length;j++){ //looping through the string to find frequency
                if(s1.charAt(i)==s1.charAt(j)){ //checking whether characters are equal
                    count++; //increasing the frequency
                }
            }

            if(count==1){ //checking whether character occurs only once
                arr[k] = s1.charAt(i); //storing unique character
                k++;
            }
        }

        char[] result = new char[k]; //array to store only unique characters

        for(int i=0;i<k;i++){ //looping through unique characters
            result[i] = arr[i]; //storing unique characters
        }

        return result; //returning unique characters
    }
}

public class UniqueCharacters {
    public static void main(String[] args){ //main method
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String"); //taking string input
        String s1 = sc.next();

        find_length obj1 = new find_length(); //creating object to find length
        int length = obj1.length(s1); //finding the length
        System.out.println(length); //printing the length

        unique obj = new unique(); //creating object to find unique characters
        char[] unique = obj.uniq_char(s1,length); //finding unique characters

        for(char c : unique){ //looping through unique characters
            System.out.print(" " + c); //printing unique characters
        }
    }
}