package Collections.List;

class Node{
    int value;
    Node next;

    Node(int value){
        this.value = value;
        this.next = null;
    }
}

class find{
    Node head = null, tail = null;
    public void addNodes(int value){
        Node newnode = new Node(value);
        if(head==null){
            head = tail = newnode;
        }else{
            tail.next = newnode;
            tail = newnode;
        }
    }

    public void findNthNode(int n){
        Node fast = head;
        for(int i=0;i<n;i++){
            if(fast==null){
                return;
            }
            fast = fast.next;
        }

        Node slow = head;
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }

        System.out.println(n+ "th Node is: "+slow.value);
    }


}


public class FindingNthElementFromEnd {
    public static void main(String[] args){
        find obj = new find();
        obj.addNodes(10);
        obj.addNodes(20);
        obj.addNodes(30);
        obj.addNodes(40);
        obj.addNodes(50);

        obj.findNthNode(3);
    }
}
