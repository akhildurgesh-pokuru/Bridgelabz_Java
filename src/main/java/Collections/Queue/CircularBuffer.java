package Collections.Queue;


class circularArray{
    int[] queue = new int[3];
    int front = -1, rear = -1;

    public void push(int value){
        if(front==-1){
            front++;
            rear++;
            queue[rear] = value;
        }

        if(rear!=2){
            rear++;
            queue[rear] = value;
        }else{
            int temp = front;
            while(temp!=rear){
                queue[temp] = queue[temp+1];
                temp++;
            }
            queue[temp] = value;
        }
    }

    public void display(){
        for (int j : queue) {
            System.out.print(" " + j);
        }
    }
}


public class CircularBuffer {
    public static void main(String[] args){
        circularArray array = new circularArray();
        array.push(10);
        array.push(20);
        array.push(30);
        array.push(40);
        array.push(50);

        array.display();
    }
}
