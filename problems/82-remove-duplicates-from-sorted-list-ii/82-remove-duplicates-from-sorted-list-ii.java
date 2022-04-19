class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode();
        ListNode node = dummy;

        int[] arr = new int[201];
        while (head != null) {
            arr[head.val + 100]++;
            head = head.next;
        }

        for (int i = 0; i < 201; i++) {
            if (arr[i] == 1) {
                node.next = new ListNode(i - 100);
                node = node.next;
            }
        }

        return dummy.next;
    }
}