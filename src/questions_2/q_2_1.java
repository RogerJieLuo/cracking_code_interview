package questions_2;

import sun.awt.image.ImageWatched;

import java.util.HashSet;
import java.util.LinkedList;

/**
 * Created by jielu_000 on 2016/11/24.
 * Remove Dups: Write code to remove duplicates from an unsorted linked list.
 FOLLOW UP
 How would you solve this problem if a temporary buffr is not allowed?
 */
public class q_2_1 {

    void deleteDups(LinkedListNode n){
        HashSet<Integer> set = new HashSet<Integer>();
        LinkedListNode previous = null;
        while(n!= null){
            if (set.contains(n.data)){
                previous.next = n.next;
            }else{
                set.add(n.data);
                previous = n;
            }
            n=n.next;
        }
    }
    void deleteDups2(LinkedListNode head){
        LinkedListNode current = head;
        while(current !=null){
            /* Remove all future nodes that have the same value*/
            LinkedListNode runner = current;
            while(runner.next != null){
                if(runner.next.data == current.data){
                    runner.next = runner.next.next;
                }else{
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

}
