package Strings.Level2;
/*
program to split the text into words and find the shortest and
 longest strings in a given text

 */

import java.util.Scanner;

// This class finds how many words are present in the given text.
class length1{
    public int find_length(String text) {
        int count = 1;

        // We check each character and increase the count whenever we find a space.
        for(char ch : text.toCharArray()){
            if(ch==' '){
                count++;
            }
        }
        return count;
    }
}

// This class separates the complete text into individual words.
class dimension1{
    public String[] words(String text, int len){
        String[] words = new String[len];
        String word = "";
        int i=0;

        // We build one word character by character until a space is found.
        for(char ch : text.toCharArray()){
            if(ch!=' '){
                word = word+ch;
            }else{
                // Once a space is found, the completed word is stored in the array.
                words[i] = word;
                word = "";
                i++;
            }
        }

        // The last word does not have a space after it, so we store it separately.
        if(!word.isEmpty()){
            words[i] = word;
        }

        return words;
    }
}

// This class finds the length of every word.
class word_len1{
    public int[] lengths(String[] words,int len) {
        int[] length = new int[len];

        // We go through every word and store its length in the corresponding position.
        for(int i=0;i<words.length;i++){
            int word = words[i].length();
            length[i] = word;
        }
        return length;
    }
}

// This class finds the largest and smallest word lengths.
class min_max{
    public int[] min_max_len(String[] words, int[] lenghts){
        int largest=1,smallest=1;
        int[] min_max = new int[2];

        // We compare each word length to find the largest and smallest values.
        for(int i=0;i<lenghts.length;i++){
            largest = Math.max(largest,lenghts[i]);
            smallest = Math.min(smallest,lenghts[i]);
        }

        min_max[0] = largest;
        min_max[1] = smallest;

        return min_max;
    }
}


public class MinandMaxLength {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Taking the complete text from the user.
        System.out.println("Enter the Text");
        String text = sc.nextLine();   //takes text as the input from user

        // Finding the total number of words in the given text.
        length1 obj = new length1();
        int len = obj.find_length(text);


        // Separating the text into individual words.
        dimension1 obj1 = new dimension1();
        String[] words = obj1.words(text,len);  //words


        // Displaying all the words obtained from the input.
        System.out.println("Below results are Words");
        for(int m=0;m<words.length;m++){
            System.out.print(" "+words[m]);
        }

        // Finding the length of each word.
        word_len1 obj2 = new word_len1();
        int[] lenghts = obj2.lengths(words,len);

        System.out.println();

        // Displaying the length of every word.
        System.out.println("Below results are the lenghts of each words");
        for(int c=0;c<lenghts.length;c++){
            System.out.print(" "+lenghts[c]);
        }

        // Converting the integer lengths into String values.
        String[] lens = new String[len];  //lengts

        for(int i=0;i<lenghts.length;i++){
            lens[i] = String.valueOf(lenghts[i]);
        }

        // Finding the largest and smallest word lengths.
        min_max obj3 = new min_max();
        int[] min_max = obj3.min_max_len(words,lenghts);

        // Creating a two-dimensional array to store each word along with its length.
        String[][] data = new String[len][2];

        int g=0,h=0;

        // Storing each word and its corresponding length together.
        for(int k=0;k<words.length;k++){
            for(int l=0;l<2;l++){
                if(l==0){
                    data[k][l] = words[g];
                    g++;
                }else{
                    data[k][l] = lens[h];
                    h++;
                }
            }
        }

        System.out.println();

        // Displaying every word together with its length.
        System.out.println("below results are words and their lenghts");
        for(int a=0;a<words.length;a++){
            for(int b=0;b<2;b++){
                System.out.print(" "+data[a][b]+"          ");
            }
            System.out.println();
        }

        // Displaying the largest and smallest word lengths.
        System.out.println("Below results are largest and smallest lenghts");
        for(int p=0;p<min_max.length;p++){
            System.out.print(" "+ min_max[p]);
        }
    }
}