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
 public ListNode rotateRight(ListNode head, int k) {
        if (head == null)
            return null;
        if (k == 0)
            return head;

        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        k %= list.size();

        ListNode dummy = new ListNode();
        ListNode cur = dummy;

        for (int i = list.size() - k; i < 2 * list.size() - k; i++) {
            cur.next = new ListNode(list.get(i % list.size()));
            cur = cur.next;
        }

        return dummy.next;

    }
}