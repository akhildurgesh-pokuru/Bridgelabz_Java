import java.util.*;

public class QueueOperations {
    public static void main(String[] args){
        Deque<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(0);
        queue.add(30);
        queue.offer(5);
        queue.offer(14);

        queue.poll();
        queue.peek();

        queue.remove();
        //queue.clear();

        queue.remove();
        queue.element();

        queue.addFirst(10);

        queue.addFirst(100);




        Iterator<Integer> it = queue.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
