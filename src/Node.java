/**
 * Created by jielu_000 on 2016/11/19.
 */
public class Node {
    int val;
    Node next;
    public Node(int d){
        val = d;
        next = null;
    }
    public static void main(String []args){
        Node a = new Node(1);
        System.out.print(a.val);
    }
}
