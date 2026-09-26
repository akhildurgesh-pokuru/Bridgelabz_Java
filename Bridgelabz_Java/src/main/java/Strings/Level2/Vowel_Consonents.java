package Strings.Level2;

/*
Counting the number of vowels, consonants and other characters in a String
1) converting all the uppercase characters into lowercase characters
2) checking each character and counting vowels, consonants and other characters
3) storing the three counts in an array
4) finally displaying the total vowels, other characters and consonants
 */

import java.util.Scanner;

class counting{
    public int[] vow_con(String text){   //taking string as parameter

        int count_vow=0,count_con=0,other=0,i=0;   //initializing counters for vowels, consonants and other characters
        char[] arr = text.toCharArray();   //converting string into character array

        for(i=0;i<text.length();i++){   //looping through the string
            if(arr[i]>='A' && arr[i]<='Z'){   //checking if character is uppercase
                arr[i] = (char)(arr[i] + 32);   //converting uppercase character into lowercase
            }
        }

        for(i=0;i<arr.length;i++){   //looping through each character

            if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u'){   //checking if character is a vowel
                count_vow++;   //incrementing vowel count

            }else if((arr[i] < 'a' || arr[i]>'z') && (arr[i] < 'A' || arr[i] > 'Z')){   //checking if character is not an alphabet
                other++;   //incrementing other character count

            }else{
                count_con++;   //incrementing consonant count
            }
        }

        int[] freq = new int[3];   //creating array to store vowel, other and consonant counts

        freq[0] = count_vow;   //storing vowel count
        freq[1] = other;   //storing other character count
        freq[2] = count_con;   //storing consonant count

        return freq;   //returning the frequency array
    }
}


public class Vowel_Consonents {   //main class
    public static void main(String[] args){   //main method

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the text");   //taking text as input
        String text = sc.nextLine();

        counting obj = new counting();   //creating object for counting vowels, consonants and other characters
        int[] freq = obj.vow_con(text);   //calculating the frequency of vowels, consonants and other characters

        for(int i=0;i<freq.length;i++){   //looping through the frequency array

            if(i==0){   //checking the vowel count
                System.out.println("total vowels: " + freq[i]);

            }else if(i==1){   //checking the other character count
                System.out.println("total Other: " + freq[i]);

            }else{   //checking the consonant count
                System.out.println("total consonents: " + freq[i]);
            }
        }
    }
}