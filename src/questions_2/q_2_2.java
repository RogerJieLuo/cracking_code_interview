package questions_2;

/**
 * Created by jielu_000 on 2016/11/26.
 */
public class q_2_2 {

    int printKthToLast(LinkedListNode head, int k){
        if (head == null){
            return 0;
        }
        int index = printKthToLast(head.next, k)+1;
        if (index == k){
            System.out.println(k+"th to last node is "+head.data);
        }
        return index;
    }

    LinkedListNode nthToLast(LinkedListNode head, int k){
        LinkedListNode p1 = head;
        LinkedListNode p2 = head;

        // Move p1 k nodes into the list.
        for (int i=0;i<k;i++){
            if(p1== null) return null;
            p1 = p1.next;
        }

        // Move them at the same pace, when p1 hits the end, p2 will be at the right element
        while(p1!= null){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }
}
