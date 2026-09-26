package Strings.Level2;

/*
Comparing the two operations for trimming the string
1) finding the starting and ending index without using built-in trim method
2) creating the substring using charAt() method
3) using the built-in trim method to get the trimmed string
4) finally comparing both the strings using charAt() method
 */

import java.util.Scanner;

class trim{
    public int[] remove(String text){   //taking string as parameter

        int start=0,end=text.length()-1;   //initializing start and end index
        int[] arr = new int[2];   //array to store start and end index

        if(text.length()==0){   //checking if the string is empty
            arr[0] = 0;
            arr[1] = -1;
            return arr;   //returning start and end index
        }

        for(char ch : text.toCharArray()){   //looping through the string to find starting index
            if(ch!=' '){   //checking if character is not a space
                break;   //stopping the loop when first non-space character is found
            }else{
                start++;   //incrementing start index for every leading space
            }
        }

        char[] arr1 = text.toCharArray();   //converting string into character array

        for(int i=text.length()-1;i>=0;i--){   //looping from the end to find ending index
            if(arr1[i]!=' '){   //checking if character is not a space
                break;   //stopping the loop when last non-space character is found
            }else{
                end--;   //decrementing end index for every trailing space
            }
        }

        arr[0] = start;   //storing starting index
        arr[1] = end;   //storing ending index

        return arr;   //returning the start and end index
    }
}

class substring{
    public String string(int[] start_end, String text){   //taking start-end array and string as parameters

        int start = start_end[0];   //getting starting index
        int end = start_end[1];   //getting ending index
        String result = "";   //creating string to store substring

        for(int i=start;i<=end;i++){   //looping from start index to end index
            result = result + text.charAt(i);   //storing each character in the result
        }

        return result;   //returning the created substring
    }
}

class answer{
    public boolean compare(String substring, String result1){   //taking two strings as parameters

        if(substring.length()!=result1.length()){   //checking if both strings have different lengths
            return false;   //returning false if lengths are different
        }

        for(int i=0;i<substring.length();i++){   //looping through both strings
            if(substring.charAt(i)!=result1.charAt(i)){   //checking if characters at same index are different
                return false;   //returning false if any character is different
            }
        }

        return true;   //returning true if all characters are same
    }
}

public class Trim_and_Compare {   //main class
    public static void main(String[] args){   //main method

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the text");   //taking text as input
        String text = sc.nextLine();

        trim obj = new trim();   //creating object for finding start and end index
        int[] start_end = obj.remove(text);   //finding start and end index

        substring obj1 = new substring();   //creating object for substring operation
        String substring = obj1.string(start_end,text);   //creating substring using charAt() method

        System.out.println(substring);   //displaying the substring

        String result1 = text.trim();   //using built-in trim method

        answer obj2 = new answer();   //creating object for comparing strings
        boolean final_result = obj2.compare(substring,result1);   //comparing both strings

        if(final_result){   //checking the final result
            System.out.println("both the operations yeild correct results");
        }else{
            System.out.println("both the operations yeilds incorrect results, please check the logic again");
        }
    }
}