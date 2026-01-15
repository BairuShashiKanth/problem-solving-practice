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
        
        if(head == null || head.next == null) return head;
        ListNode current = head, lastNodeTemp, newHead;

        int listNodeLength = 0;
        while(current != null){
            current = current.next;
            listNodeLength++;
        }

        k%= listNodeLength;
        if ( k == 0 ) return head;
        current = head;

        for(int i=0;i<listNodeLength-k-1;i++){
            current = current.next;
        }
        lastNodeTemp = current;
        newHead = current.next;
        while(current.next != null){
            current = current.next;
        }

        current.next = head;
        head = newHead;
        lastNodeTemp.next = null;

        return head;
    }
}