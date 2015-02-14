package reversList;

/**
 * Created by Admin on 30.11.14.
 */
public class Node {
    Node head;
    Type value;
    Node next;

    public Node(){
        this.head = null;
        this.value = null;
        this.next = null;
    }
    public Node(Object obj){
        value = new Type(obj);
    }
    public void add(Object obj){
        if (head == null){
            head = new Node(obj);
        }
        value = new Type(obj);
        next = new Node(obj);
    }
    public void show(){
        while(next != null){
            System.out.println(value);
        }
    }
}
