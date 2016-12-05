package questions_2;

/**
 * Created by jielu_000 on 2016/12/2.
 */
public class q_2_8 {
    LinkedListNode FindBeginning(LinkedListNode head){
        LinkedListNode slow = head;
        LinkedListNode fast = head;

        while(slow != null && fast !=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                break;
            }
        }

        if (slow == null || fast == null){
            return null;
        }

        slow = head;
        while(slow!= fast){
            slow = slow.next;
            fast = fast.next;
        }

        return fast;
    }
}
