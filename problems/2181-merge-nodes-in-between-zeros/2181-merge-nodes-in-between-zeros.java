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
    public ListNode mergeNodes(ListNode head) {
        List<Integer> list = new ArrayList<>();
        traverse(head.next, list, 0);
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        for (Integer i : list) {
            cur.next = new ListNode(i);
            cur = cur.next;
        }
        return dummy.next;
    }

    private void traverse(ListNode head, List<Integer> list, int sum) {
        if (head.val == 0) {
            list.add(sum);
            sum = 0;
        }
        if (head.next != null) {
            traverse(head.next, list, sum + head.val);
        }
    }
}