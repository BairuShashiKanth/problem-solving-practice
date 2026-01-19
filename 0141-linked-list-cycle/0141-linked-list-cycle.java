/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        

        if(head == null || head.next == null) return false;

        ListNode curr = head;
        HashSet<ListNode> set = new HashSet();

        while(curr!= null){

            if(set.contains(curr)) return true;
            set.add(curr);
           
            curr = curr.next;
        }

        return false;
    }
}