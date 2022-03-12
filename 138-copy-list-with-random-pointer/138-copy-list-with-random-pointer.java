/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
  public Node copyRandomList(Node head) {
        Node dummy = new Node(0);
        Node headDummy = new Node(0);
        headDummy.next = head;
        Node originalCur = headDummy.next;
        Node copyCur = dummy;

        Map<Node, Integer> randomIndexMap = new HashMap<>();
        Map<Integer, Node> mapCopy = new HashMap<>();
        int index = 0;

        while (originalCur != null) {
            copyCur.next = new Node(originalCur.val);

            randomIndexMap.put(originalCur, index);
            mapCopy.put(index++, copyCur.next);

            originalCur = originalCur.next;
            copyCur = copyCur.next;
        }

        originalCur = headDummy.next;
        copyCur = dummy.next;
        while (originalCur != null) {
            Integer i = randomIndexMap.get(originalCur.random);
            System.out.println("i = " + i);
            copyCur.random = mapCopy.get(i);
            originalCur = originalCur.next;
            copyCur = copyCur.next;
        }

        return dummy.next;
    }

}