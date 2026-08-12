// Last updated: 8/12/2026, 3:17:01 PM
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
//since constraints for value are -10^5 <= Node.val <= 10^5
//then I use 1_000_000 as indicator that this node has been
//visited
public class Solution {
    public boolean hasCycle(ListNode head) {
        while (head != null) {
            if (head.val == 1_000_000) return true;
            head.val = 1_000_000;
            head = head.next;
        }
        return false;
    }
}