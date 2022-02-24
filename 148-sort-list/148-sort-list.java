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
    public ListNode sortList(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        list.sort(Comparator.comparingInt(a -> a));
        for (Integer i : list) {
            cur.next = new ListNode(i);
            cur = cur.next;
        }

        return dummy.next;

    }
}