package LinerBinaryStringConcepts;

/*
Below program perform to find the unique characters in the string
using hashset anf string builder
 */

import java.util.HashSet;

public class RemoveDuplicated {
    public static void main(String[] args){
        String word = "Hello world";   //string to remove suplicates
        StringBuilder sb = new StringBuilder();  //string builder for storing unique characters
        HashSet<Character> set = new HashSet<>();  //to check weather characters are present in hash set or not

        for(char ch : word.toCharArray()){  //looping through each character
            if(!set.contains(ch)){  //if set does not contain then add to sb
                sb.append(ch);
            }
            set.add(ch);  //add the character to hashset
        }

        System.out.println(sb);
    }
}
