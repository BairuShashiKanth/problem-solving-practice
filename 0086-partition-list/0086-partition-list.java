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
    public ListNode partition(ListNode head, int x) {

        if(head == null) return head;
        
        ListNode partition1Head=null,partition1Tail = null,partition2Head=null,partition2Tail = null;
        ListNode curr = head;


        while(curr != null){
            if(curr.val < x)
            {
                
                if(partition1Head == null)
                {
                    partition1Head = curr;
                    partition1Tail = curr;
                }
                else
                {
                    partition1Tail.next = curr;
                    partition1Tail = partition1Tail.next;
                }
            }
            else{
                 
                if(partition2Head == null)
                {    
                    partition2Head = curr;
                    partition2Tail = curr;
                }
                else
                {
                    partition2Tail.next = curr;
                    partition2Tail = partition2Tail.next;
                }
            }
            curr = curr.next;
        }

        if(partition2Tail != null) partition2Tail.next = null; //break existing pointer to ensure no cycle

        if(partition1Head == null) return partition2Head;
        if(partition2Head == null) return partition1Head;
        partition1Tail.next = partition2Head ;
        return partition1Head;
    }
}