package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountUpperLowerNumber {
    public static void main(String[] args){
        String sentence = "i am a good Boy and i am 18 years Old";
        int lower=0,upper=0,number=0;
        Matcher m = Pattern.compile("\\d+").matcher(sentence);
        Matcher m1 = Pattern.compile("[a-z]").matcher(sentence);
        Matcher m2 = Pattern.compile("[A-Z]").matcher(sentence);

        while(m.find()){
            number++;
        }

        while(m1.find()){
            lower++;
        }

        while(m2.find()){
            upper++;
        }

        System.out.println("Number: "+number);
        System.out.println("Lower: "+lower);
        System.out.println("Upper: "+upper);
    }
}
