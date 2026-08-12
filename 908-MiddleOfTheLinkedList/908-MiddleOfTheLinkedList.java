// Last updated: 8/12/2026, 3:13:44 PM
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
    public ListNode middleNode(ListNode head) {
        List<ListNode> nodes = new ArrayList<>();
        int length = 0;

        //iterate throught list nodes
        while (head != null) {
            nodes.add(head);
            head = head.next;
            length++;
        }

        return nodes.get(length / 2);
    }
}