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
  public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> q = new PriorityQueue();
        for (ListNode list : lists) {
            while (list != null) {
                q.offer(list.val);
                list = list.next;
            }
        }

        ListNode root = new ListNode();
        ListNode cur = root;

        while (!q.isEmpty()) {
            cur.next = new ListNode(q.poll());
            cur = cur.next;
        }
        return root.next;
    }
}