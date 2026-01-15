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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null || head.next == null || k == 0) return head;
        ListNode tail = head, newTail, newHead;

        int length = 1;
        while(tail.next != null){
            tail = tail.next;
            length++;
        }

        k%=length;

        if ( k == 0 ) return head;
        
        tail.next = head; //making it a circular linkedList.

        int stepsToNewHead = length - k ;
        newTail = tail;
        while(stepsToNewHead-- > 0)
            newTail = newTail.next;
        
        newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}