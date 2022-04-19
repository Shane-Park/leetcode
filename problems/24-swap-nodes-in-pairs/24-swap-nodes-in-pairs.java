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

    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode root = dummy;
        while (root.next != null && root.next.next != null) {
            swap(root, root.next, root.next.next);
            root = root.next.next;
        }
        return dummy.next;
    }

    private void swap(ListNode cur, ListNode head, ListNode next) {
        head.next = next.next;
        cur.next = next;
        cur.next.next = head;
    }
}