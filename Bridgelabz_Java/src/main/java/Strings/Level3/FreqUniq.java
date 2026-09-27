package Strings.Level3;

import java.util.Scanner;

/*
Finding unique characters and frequency of characters from a string
1) finding characters which occur only once
2) finding frequency of each character
3) storing character and frequency in a 2D array
*/

class unique_char{
    public char[] uniq(String value){ //taking string as parameter
        char[] arr = new char[value.length()]; //character array to store unique characters
        int count=0,k=0;

        for(int i=0;i<value.length();i++){ //looping through the string
            count = 0;

            for(int j=0;j<value.length();j++){ //looping through the string to find frequency
                if(value.charAt(i)==value.charAt(j)){ //checking whether characters are equal
                    count++; //increasing the frequency
                }
            }

            if(count==1){ //checking whether character occurs only once
                arr[k] = value.charAt(i); //storing unique character
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

public class FreqUniq {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string"); //taking string input
        String value = sc.next();

        unique_char obj = new unique_char(); //creating object
        char[] arr = obj.uniq(value); //finding unique characters

        for(int i=0;i<arr.length;i++){ //looping through unique characters
            System.out.print(" "+arr[i]); //printing unique characters
        }

        System.out.println();

        int[] freq = new int[256]; //array to store frequency of ASCII characters

        for(int i=0;i<value.length();i++){ //looping through the string
            freq[value.charAt(i)]++; //increasing frequency of character
        }

        String[][] data = new String[256][2]; //2D array to store character and frequency
        int row = 0;

        for(int j=0;j<256;j++){ //looping through ASCII values
            if(freq[j]>=1){ //checking whether character is present
                data[row][0] = String.valueOf((char) j); //storing character
                data[row][1] = String.valueOf(freq[j]); //storing frequency
                row++;
            }
        }

        for(int k=0;k<row;k++){ //looping through stored rows
            for(int l=0;l<2;l++){ //looping through two columns
                System.out.print(" "+data[k][l]); //printing character and frequency
            }
            System.out.println();
        }
    }
}