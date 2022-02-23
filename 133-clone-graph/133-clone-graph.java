/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
public Node cloneGraph(Node node) {
        return node == null ? null : clone(node, new HashMap<>());
    }

    private Node clone(Node node, Map<Integer, Node> map) {

        Node clone = map.get(node.val);
        if (clone != null)
            return clone;

        clone = new Node(node.val);
        map.put(node.val, clone);

        for (Node neighbor : node.neighbors) {
            clone.neighbors.add(clone(neighbor, map));
        }

        return clone;
    }
}