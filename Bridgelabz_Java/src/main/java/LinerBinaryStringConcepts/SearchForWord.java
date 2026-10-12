package LinerBinaryStringConcepts;

public class SearchForWord {
    public static void main(String[] args){
        String[] sentences = {"Hello world", "Hey Raj", "Hello Ram", "give me some Hello"};
        String word = "Hello";
        for(String sentence : sentences){
            if(sentence.contains(word)){
                System.out.println(sentence);
            }
        }
    }
}
