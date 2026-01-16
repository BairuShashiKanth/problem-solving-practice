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
        
        ArrayList<Integer> arrayList = new ArrayList();
        ListNode curr = head;

        while(curr != null){
            arrayList.add(curr.val);
            curr = curr.next;
        }

        int front = 0;
        int back = arrayList.size() - 1;

        while(front<back){
            if(!(arrayList.get(front) == arrayList.get(back)))
                return false;
            front++;
            back--;
        }

        return true;
    }
}