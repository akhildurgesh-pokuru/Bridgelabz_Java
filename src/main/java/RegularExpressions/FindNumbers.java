package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindNumbers {
    public static void main(String[] args){
        String sen = "i am 19 years old and i born in 2005";
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(sen);

        while(m.find()){
            System.out.println(m.group());
        }
    }
}
