package LinerBinaryStringConcepts;

public class ConcatenateUsingStringBuffer {
    public static void main(String[] args){
        String[] words = {"akhil", "is", "a", "good", "boy"};
        StringBuffer sb = new StringBuffer();

        for(String word : words){
            sb.append(word);
        }

        System.out.println("Concatenated String: "+sb);
    }
}
