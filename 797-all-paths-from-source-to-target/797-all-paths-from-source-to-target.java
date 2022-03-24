class Solution {
public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Node> list = new ArrayList<>();
        for (int i = 0; i < graph.length; i++) {
            list.add(new Node(i));
        }
        for (int i = 0; i < graph.length; i++) {
            list.get(i).add(list, graph[i]);
        }

        List<List<Integer>> answer = new ArrayList<>();
        ArrayList<Integer> route = new ArrayList<>();
        route.add(0);

        dfs(list.get(0), list.size() - 1, answer, route);

        return answer;

    }

    private void dfs(Node current, int destination, List<List<Integer>> answer, ArrayList<Integer> route) {
        if (current.number == destination) {
            answer.add(new ArrayList<>(route));
        }
        List<Node> list = current.list;
        for (Node child : list) {
            route.add(child.number);
            dfs(child, destination, answer, route);
            route.remove(Integer.valueOf(child.number));
        }

    }

    class Node {
        int number;
        List<Node> list = new ArrayList<>();

        public Node(int number) {
            this.number = number;
        }

        public void add(List<Node> nodes, int[] ints) {
            for (int n : ints) {
                list.add(nodes.get(n));
            }
        }

        @Override
        public String toString() {
            return "Node{" +
                    "number=" + number +
                    ", list=" + list.stream().map(node -> node.number).collect(Collectors.toList()) +
                    '}';
        }
    }
}