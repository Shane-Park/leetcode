class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);
        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);
        int cnt = 1;

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                String poll = q.poll();
                if (poll.equals(endWord)) {
                    return cnt;
                }
                set.remove(poll);
                for (int j = 0; j < beginWord.length(); j++) {
                    for (int k = 0; k < 26; k++) {
                        StringBuffer sb = new StringBuffer(poll);
                        sb.setCharAt(j, (char) ('a' + k));
                        if (set.contains(sb.toString())) {
                            q.offer(sb.toString());
                            set.remove(sb.toString());
                        }
                    }
                }
            }
            cnt++;
        }

        return 0;

    }
}