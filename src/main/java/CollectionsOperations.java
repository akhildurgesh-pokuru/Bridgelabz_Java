import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsOperations {
    public void main(String[] args){
        Collection<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);

        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(10);
        numbers1.add(24);
        numbers1.add(11);
        //Collections.shuffle(numbers1);
        Collections.swap(numbers1,0,2);
        System.out.println(numbers1);


    }
}
