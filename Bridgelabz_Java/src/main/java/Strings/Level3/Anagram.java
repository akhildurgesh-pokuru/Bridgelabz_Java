package Strings.Level3;

import java.util.Scanner;

class anagram_check{
    public boolean check(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        int arr1count = 0;
        int arr2count = 0;

        for(int i=0;i<s1.length();i++){

            char ch = arr1[i];

            for(int j=0;j<s1.length();j++){
                if(ch==arr1[j]){
                    arr1count++;
                }
            }

            for(int k=0;k<s1.length();k++){
                if(ch==arr2[k]){
                    arr2count++;
                }
            }

            if(arr1count!=arr2count){
                return false;
            }
        }

        return true;
    }
}


public class Anagram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String-1");
        String s1 = sc.next();
        System.out.println("Enter the String-2");
        String s2 = sc.next();

        anagram_check obj = new anagram_check();
        boolean value = obj.check(s1,s2);

        if(value){
            System.out.println("Both are anagrams");
        }else{
            System.out.println("Both are not anagrams");
        }

    }
}
