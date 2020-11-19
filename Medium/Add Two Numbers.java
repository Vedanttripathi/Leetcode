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
        ListNode curr = new ListNode(0);
        ListNode lsum = curr;
        int carry = 0;
        
        
        while(l1 != null || l2 != null)
        {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + carry;
            carry = sum / 10;
            
            // ListNode node = new ListNode(sum % 10);
            curr.next = new ListNode(sum % 10);
            
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            
            curr = curr.next;
        }
            
        if (carry > 0) {
            // ListNode node = new ListNode(carry);
            curr.next = new ListNode(carry);
            // curr = curr.next;
        }
           
        return lsum.next;
    }
}
