package Strings.Level2;

import java.util.Scanner;

// This class finds the total number of words in the given text.
class length{
    public int find_length(String text) {
        int count = 1;

        // We count the spaces because each space separates one word from another.
        for(char ch : text.toCharArray()){
            if(ch==' '){
                count++;
            }
        }
        return count;
    }
}

// This class separates the given text into individual words.
class dimension{
    public String[] words(String text, int len){
        String[] words = new String[len];
        String word = "";
        int i=0;

        // We keep adding characters until a space is found, which means one word is complete.
        for(char ch : text.toCharArray()){
            if(ch!=' '){
                word = word+ch;
            }else{
                // The completed word is stored in the array.
                words[i] = word;
                word = "";
                i++;
            }
        }

        // The last word has no space after it, so it is stored here.
        if(!word.isEmpty()){
            words[i] = word;
        }

        return words;
    }
}

// This class finds the length of each word.
class word_len{
    public int[] lengths(String[] words,int len) {
        int[] length = new int[len];

        // We check each word and store its number of characters.
        for(int i=0;i<words.length;i++){
            int word = words[i].length();
            length[i] = word;
        }
        return length;
    }
}


public class MultiDimArrayWords {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Taking the complete text as input from the user.
        System.out.println("Enter the Text");
        String text = sc.nextLine();   //takes text as the input from user

        // Finding how many words are present in the input text.
        length obj = new length();
        int len = obj.find_length(text);


        // Separating the complete text into individual words.
        dimension obj1 = new dimension();
        String[] words = obj1.words(text,len);  //words

        // Displaying each word separately.
        for(int m=0;m<words.length;m++){
            System.out.println(" "+words[m]);
        }

        // Finding the length of every word.
        word_len obj2 = new word_len();
        int[] lenghts = obj2.lengths(words,len);

        // Displaying the length of each word.
        for(int c=0;c<lenghts.length;c++){
            System.out.println(" "+lenghts[c]);
        }

        String[] lens = new String[len];  //lengts

        // Converting each word length from integer to String.
        for(int i=0;i<lenghts.length;i++){
            lens[i] = String.valueOf(lenghts[i]);
        }

        // Creating a two-dimensional array to keep words and their lengths together.
        String[][] data = new String[len][2];

        int g=0,h=0;

        // Filling the two-dimensional array with words and their corresponding lengths.
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

        // Displaying each word along with its length.
        for(int a=0;a<words.length;a++){
            for(int b=0;b<2;b++){
                System.out.print(" "+data[a][b]+"          ");
            }
            System.out.println();
        }
    }
}