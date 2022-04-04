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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode cur = head;
        int index = 0;
        Map<Integer, ListNode> map = new HashMap<>();
        while (cur != null) {
            map.put(++index, cur);
            cur = cur.next;
        }
        int temp = map.get(k).val;
        map.get(k).val = map.get(index - k + 1).val;
        map.get(index - k + 1).val = temp;

        return head;
    }
}