/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode tempB = headB;

        while(headA != null)
        {
            while(tempB != null)
            {
                if(headA == tempB)
                    return headA;
                if(headA.next == tempB.next)
                    return headA.next;
                tempB = tempB.next;
            }
            headA = headA.next;
            tempB= headB;
        }

        return null;
    }
}