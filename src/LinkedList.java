import sun.awt.image.ImageWatched;

/**
 * Created by jielu_000 on 2016/11/14.
 */
public class LinkedList {
    int size = 0;
    Node head = null;
    public LinkedList(){
        head = null;
    }
    public static void main(String []args){
        LinkedList l = new LinkedList();
        l.append(1);
        l.append(2);
        l.print();

    }
    public void append(int d){
        Node cur = head;
        Node n = new Node(d);

        if (head == null){
            head = new Node(d);
        }else{
            while(cur.next != null){
                if (cur.val == d){
                    // value already exist, return nothing
                    System.out.println("Value: "+d+" already exist");
                }else {
                    cur = cur.next;
                }
            }
            cur.next = n;
        }
    }

    void delete(int d){
        Node cur = head;
        Node pre = head;
        if(cur == null){
            // it's empty, nout found
        }else {
            while (cur.next != null) {
                if(cur.val == d){
                    pre.next = cur.next;
                }else{
                    cur = cur.next;
                }
            }
            if(cur.val == d){
                pre.next = cur.next;
            }else{
                // not found
            }
        }
    }

    public void print(){
        Node cur = head;
        if (cur == null){
            System.out.print("Null ");
        }else {
            while (cur.next != null) {
                System.out.print(cur.val + " -> ");
                cur = cur.next;
            }
        }
    }

    class Node{
        int val;
        Node next = null;

        public Node(int d) {
            val = d;
            next = null;
        }
    }
}
