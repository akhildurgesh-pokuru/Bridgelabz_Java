package Strings.Level2;

/*
Counting the number of vowels, consonants and other characters in a String
1) converting all the uppercase characters into lowercase characters
2) checking each character and counting vowels, consonants and other characters
3) storing the three counts in an array
4) finally displaying the result in a 2D String array
 */

import java.util.Scanner;

class counting1{
    public int[] vow_con(String text){   //taking string as parameter

        int count_vow=0,count_con=0,other=0,i=0;   //initializing counters for vowels, consonants and other characters
        char[] arr = text.toCharArray();   //converting string into character array

        for(i=0;i<text.length();i++){   //looping through the string to convert uppercase characters
            if(arr[i]>='A' && arr[i]<='Z'){   //checking if character is uppercase
                arr[i] = (char)(arr[i] + 32);   //converting uppercase character into lowercase
            }
        }

        for(i=0;i<arr.length;i++){   //looping through each character

            if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u'){   //checking if character is a vowel
                count_vow++;   //incrementing vowel count

            }else if((arr[i] < 'a' || arr[i] > 'z') && (arr[i] < 'A' || arr[i] > 'Z')){   //checking if character is not an alphabet
                other++;   //incrementing other character count

            }else{
                count_con++;   //incrementing consonant count
            }
        }

        int[] freq = new int[3];   //creating array to store vowel, consonant and other counts

        freq[0] = count_vow;   //storing vowel count
        freq[1] = count_con;   //storing consonant count
        freq[2] = other;   //storing other character count

        return freq;   //returning the frequency array
    }
}


public class TwoDimensionVowelConsonent {   //main class
    public static void main(String[] args){   //main method

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the text");   //taking text as input
        String text = sc.nextLine();

        counting1 obj = new counting1();   //creating object for counting vowels and consonants
        int[] freq = obj.vow_con(text);   //calculating vowel, consonant and other counts

        String[][] data = new String[3][2];   //creating 2D array to store character type and count

        data[0][0] = "Vowels";   //storing vowels label
        data[1][0] = "Consonents";   //storing consonants label
        data[2][0] = "Others";   //storing others label

        data[0][1] = String.valueOf(freq[0]);   //storing vowel count
        data[1][1] = String.valueOf(freq[1]);   //storing consonant count
        data[2][1] = String.valueOf(freq[2]);   //storing other character count

        for(int i=0;i<3;i++){   //looping through the rows

            for(int j=0;j<2;j++){   //looping through the columns
                System.out.println(" " + data[i][j]);   //displaying the character type and count
            }

            System.out.println();   //moving to the next row
        }
    }
}