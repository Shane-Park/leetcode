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
public static ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        if(head== null) {
            return null;
        }
        set.add(head);
        while(head.next != null) {
            if(!set.add(head.next)) {
                return head.next;
            }
            head = head.next;
        }
        return null;
    }
}