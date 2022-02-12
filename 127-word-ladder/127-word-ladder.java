class Solution {
 public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Node> q = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        q.add(new Node(beginWord, 1));
        while (!q.isEmpty()) {
            Node poll = q.poll();
            String word = poll.word;
            if (word.equals(endWord)) {
                return poll.depth;
            }

            for (String s : wordList) {
                if (!visited.contains(s) && adjacent(word, s)) {
                    visited.add(s);
                    q.add(new Node(s, poll.depth + 1));
                }
            }
        }
        return 0;
    }

    public class Node {
        String word;
        int depth;

        public Node(String word, int depth) {
            this.word = word;
            this.depth = depth;
        }

    }


    private boolean adjacent(String word, String s) {
        int diff = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != s.charAt(i)) {
                diff++;
            }
            if (1 < diff) {
                return false;
            }
        }
        return diff == 1;
    }
}