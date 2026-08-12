// Last updated: 8/12/2026, 3:18:22 PM
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) { //if l1 is smaller
                current.next = l1;//add l1
                l1 = l1.next;
            } else {
                current.next = l2; //if l2 is smaller
                l2 = l2.next;//add l2
            }
            current = current.next;//we have to add next ele to newly added on 
        }

        // Attach remaining nodes
        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }

        return dummy.next;
    }
}
