/*
 * Program: Custom HashMap Implementation
 * This program creates a simple HashMap using an array and linked list.
 */

package HashMap;

class Node {
    int key;
    String value;
    Node next;

    Node(int key, String value){
        this.key = key;
        this.value = value;
        this.next = null;
    }
}

class HashMap{

    Node[] arr;
    int capacity;

    HashMap(int capacity){
        this.arr = new Node[capacity];
        this.capacity = capacity;
    }

    public int get_index(int key){
        return key%capacity;
    }

    public void put(int key, String value){
        int index = get_index(key);
        if(arr[index]==null){
            arr[index] = new Node(key,value);
        }

        Node current = arr[index];
        while(true){
            if(current.key == key){
                current.value = value;
                return;
            }

            if(current.next==null){
                break;
            }

            current = current.next;
        }

        current.next = new Node(key,value);
    }

    public String get(int key){
        int index = get_index(key);
        Node current = arr[index];
        while(current!=null){
            if(current.key == key){
                return current.value;
            }else{
                current = current.next;
            }
        }
        return null;
    }

    public void remove(int key){
        int index = get_index(key);
        Node current = arr[index];
        if(current==null){
            return;
        }

        if(current.key == key){
            arr[index] = current.next;
        }

        while(current.next!=null){
            current = current.next;
            if(current.next.key==key){
                current.next = current.next.next;
                break;
            }
        }
    }

}





public class CustomHashMap {
    public static void main(String[] args) {

        // Create our own HashMap
        HashMap map = new HashMap(5);

        // Add some key-value pairs
        map.put(12, "Akhil");
        map.put(7, "Ravi");
        map.put(15, "Priya");

        // Get values using their keys
        System.out.println(map.get(12));
        System.out.println(map.get(7));
        System.out.println(map.get(15));

        // The key 12 already exists, so its value will be updated
        map.put(12, "Kumar");

        System.out.println(map.get(12));

        // Remove the key 7 from the HashMap
        map.remove(7);

        // Since key 7 was removed, this will print null
        System.out.println(map.get(7));
    }
}