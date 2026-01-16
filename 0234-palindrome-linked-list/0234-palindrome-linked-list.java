/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        // if(head == null | head.next == null) return true;

        ListNode firstHalfEndNode = getMiddleNode(head);
        ListNode secondHalfRevStartNode = reverseLinkedList(firstHalfEndNode.next);

        ListNode p1 = head, p2 = secondHalfRevStartNode;

        while( p2 != null)
        {
            if(p1.val != p2.val)
                return false;
            p1= p1.next;
            p2 = p2.next;
        }

        return true;
    }


    public ListNode getMiddleNode(ListNode head)
    {
        ListNode fast = head.next;
        ListNode slow = head;

        while(fast!= null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public ListNode reverseLinkedList(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head;
        ListNode temp;

        while(curr != null){

            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}