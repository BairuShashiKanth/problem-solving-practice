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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultList = new ListNode(),temp;
        int sum,l1Value,l2Value,result,prevCarryDigit = 0;
        
        
        temp = resultList;
        
        while (l1 != null || l2 != null || prevCarryDigit>0)
        {
            l1Value = (l1 != null) ? l1.val : 0;
            l2Value = (l2 != null) ? l2.val : 0;
            sum = l1Value + l2Value + prevCarryDigit;
            result = (sum) % 10 ;
            System.out.println("result:"+result);
 
            temp.next = new ListNode(result);
            temp = temp.next;
            
            prevCarryDigit=sum/10;

            if (l1 != null ) l1 = l1.next;
            if (l2 != null ) l2 = l2.next;
        }

        return resultList.next;
    }
}