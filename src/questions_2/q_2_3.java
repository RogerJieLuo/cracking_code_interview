package questions_2;

/**
 * Created by jielu_000 on 2016/11/26.
 * Delete Middle Node: Implement an algorithm to delete a node in the middle (i.e., any node but
 the fist and last node, not necessarily the exact middle) of a singly linked list, given only access to
 that node.
 EXAMPLE
 lnput:the node c from the linked list a->b->c->d->e->f
 Result: nothing is returned, but the new linked list looks like a - >b- >d- >e- >f
 */
public class q_2_3 {
    boolean deleteNode(LinkedListNode n){
        if (n == null || n.next == null){
            return false;
        }
        LinkedListNode next = n.next;
        n.data = next.data;
        n.next = next.next;
        return true;
    }

}
