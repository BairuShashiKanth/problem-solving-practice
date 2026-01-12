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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int length=0;
        ListNode temp = head;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        temp = head;

        for(int i=0;i< length - n -1; i++){
            temp = temp.next;
        }

        
        
        if(length - n == 0)
            head = head.next;
        else if(temp.next != null)
        {
            if(temp.next.next!= null)
                temp.next = temp.next.next;
            else 
                temp.next = null;
        }
            
        
        return head;
    }
}