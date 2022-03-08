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
        if (head == null)
            return false;

        ListNode jump = head;

        while (jump.next != null && jump.next.next != null) {
            head = head.next;
            jump = jump.next.next;
            if (head == jump) return true;
        }
        return false;
    }
}