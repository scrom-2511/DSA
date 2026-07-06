// https://leetcode.com/problems/add-two-numbers/
// https://takeuforward.org/data-structure/add-two-numbers-represented-as-linked-lists/

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
        ListNode ans = new ListNode(0);
        ListNode head = ans;
        boolean carry = false;

        while (l1 != null || l2 != null || carry == true) {
            int l1Val = l1 == null ? 0 : l1.val;
            int l2Val = l2 == null ? 0 : l2.val;

            int sum = l1Val + l2Val;

            if(carry) sum += 1;
            if(sum > 9) {
                carry = true;
            } else {
                carry = false;
            }

            ListNode ansCurr = new ListNode(sum % 10);
            ans.next = ansCurr;
            ans = ans.next;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }

        return head.next;
    }
}
