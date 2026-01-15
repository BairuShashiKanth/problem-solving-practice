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
        ListNode current = head, LastNodeTemp;

        int listNodeLength = 0;
        while(current != null){
            current = current.next;
            listNodeLength++;
        }

        k%= listNodeLength;

        while(k>0){
            
            current = head;
            while(current.next.next != null)
               current = current.next;
            LastNodeTemp = current.next;
            LastNodeTemp.next = head;
            current.next = null;
            head = LastNodeTemp;
            k--;
        }

        return head;
    }
}