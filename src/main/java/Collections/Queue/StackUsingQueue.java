package Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;

class Operations{
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    public void push(int value){
        queue2.add(value);
        while(!queue1.isEmpty()){
            queue2.add(queue1.poll());
        }
        while(!queue2.isEmpty()){
            queue1.add(queue2.poll());
        }
    }

    public void pop(){
        System.out.println("popped Value: "+queue1.poll());
    }

    public void peek(){
        System.out.println(queue1.peek());
    }
}



public class StackUsingQueue {
    public static void main(String[] args){
        Operations operation = new Operations();
        operation.push(10);
        operation.push(20);
        operation.push(30);
        operation.push(40);
        operation.peek();
        operation.pop();
        operation.peek();
    }
}
