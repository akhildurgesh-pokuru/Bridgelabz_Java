package Strings.Level2;

import java.util.Arrays;
import java.util.Scanner;

class text{
    public int length(String sen){
        sen = sen.trim();
        int count=1;
        for(char ch : sen.toCharArray()){
            if(ch==' '){
                count++;
            }
        }
        return count;
    }
}

class text1{
    public String[] length1(String sen, int length,int total_length){
        String[] words = new String[length];
        int i=0,len=0;
        String word = "";
        for(char ch : sen.toCharArray()){
            if(ch!=' '){
                word = word+ch;
            }else{
                words[i] = word;
                word = "";
                i++;
            }
        }

        if(!word.isEmpty()){
            words[i] = word;
        }

        return words;
    }
}

class find__length{
    public int len(String sen){
        int count = 0;
        for(char ch : sen.toCharArray()){
            count++;
        }
        return count;
    }
}



public class SplitTextLength {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Text");
        String sen = sc.nextLine();
        text obj = new text();
        int length = obj.length(sen);
        find__length obj2 = new find__length();
        int total_length = obj2.len(sen);
        text1 obj1 = new text1();
        String[] words = obj1.length1(sen,length,total_length);

        for(int j=0;j<words.length;j++){
            System.out.print(" "+words[j]);
        }
        System.out.println();
        System.out.println(length);
        System.out.println(total_length);

        String[] split_words = sen.trim().split(" ");

        boolean result = Arrays.equals(split_words,words);
        System.out.println(result);


        if(result){
            System.out.println("Both Operations yeild correct results");
        }else{
            System.out.println("Both operations yeild different answers, check logic");
        }
    }
}
