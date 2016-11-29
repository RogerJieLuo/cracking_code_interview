package questions_2;

import sun.awt.image.ImageWatched;

import java.util.Stack;

/**
 * Created by jielu_000 on 2016/11/27.
 * Palindrome: Implement a function to check if a linked list is a palindrome.
 */
public class q_2_6 {

    // iterative approach:
    // get the first half nodes and compare with the second half nodes
    boolean isPalindrome(LinkedListNode head){
        LinkedListNode fast = head;
        LinkedListNode slow = head;
        Stack<Integer> stack = new Stack<Integer>();
        while(fast != null & fast.next != null){
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }
        // has odd number of elements, so skip the middle element
        if (fast!=null){
            slow = slow.next;
        }

        while(slow!= null){
            int val = stack.pop().intValue();
            if(val != slow.data){
                return false;
            }
            slow = slow.next;
        }
        return true;
    }

    // reverse the linkedlist and compare it with the original one,
    // if they are the same, then it's palindrome
    boolean isPalindrome2(LinkedListNode head){
        LinkedListNode reversed = reverseAndClone(head);
        return isEqual(head, reversed);
    }
    LinkedListNode reverseAndClone(LinkedListNode node){
        LinkedListNode head = null;
        while(node != null){
            LinkedListNode n = new LinkedListNode(node.data); //clone
            n.next = head;
            head = n;
            node = node.next;
        }
        return head;
    }

    boolean isEqual(LinkedListNode one, LinkedListNode two){
        while(one !=null && two !=null){
            if(one.data != two.data){
                return false;
            }
            one = one.next;
            two = two.next;
        }
        return one == null && two == null;
    }


}
