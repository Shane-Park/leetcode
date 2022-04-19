class Solution {
public boolean isSubsequence(String s, String t) {
        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            q.offer(s.charAt(i));
        }

        int index = 0;
        while (!q.isEmpty() && index < t.length()) {
            if (q.peek() == t.charAt(index)) {
                q.poll();
            }
            index++;
        }

        return q.isEmpty();

    }
}