package Strings.Level3;

import java.util.Scanner;

/*
Finding the frequency of characters in a string
1) converting the string into character array
2) finding the frequency using nested loops
3) storing characters and frequencies in a String array
*/

class character_frequency{
    public String[] find_frequency(String value){ //taking string as parameter
        char[] characters = value.toCharArray(); //converting string into character array
        int[] frequency = new int[value.length()]; //array to store frequency

        for(int i=0;i<characters.length;i++){ //looping through each character
            if(characters[i]=='0'){ //checking whether character is already counted
                continue;
            }

            frequency[i] = 1; //initializing frequency to one

            for(int j=i+1;j<characters.length;j++){ //looping to find duplicate characters
                if(characters[i]==characters[j]){ //checking whether characters are equal
                    frequency[i]++; //increasing frequency
                    characters[j] = '0'; //marking duplicate character
                }
            }
        }

        int count = 0;

        for(int i=0;i<frequency.length;i++){ //looping through frequency array
            if(frequency[i]>0){ //checking whether character is counted
                count++;
            }
        }

        String[] result = new String[count*2]; //array to store characters and frequencies
        int k = 0;

        for(int i=0;i<characters.length;i++){ //looping through characters
            if(frequency[i]>0){ //checking whether character has frequency
                result[k] = String.valueOf(characters[i]); //storing character
                result[k+1] = String.valueOf(frequency[i]); //storing frequency
                k = k+2;
            }
        }

        return result; //returning characters and frequencies
    }
}

public class FreqOfCharacters {
    public static void main(String[] args){ //main method
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String"); //taking string input
        String value = sc.next();

        character_frequency obj = new character_frequency(); //creating object
        String[] result = obj.find_frequency(value); //finding frequency

        for(int i=0;i<result.length;i=i+2){ //looping through result
            System.out.println("Character: "+result[i]+" Frequency: "+result[i+1]); //displaying result
        }
    }
}