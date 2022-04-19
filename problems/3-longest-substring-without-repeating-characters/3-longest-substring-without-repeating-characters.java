class Solution {
    public int lengthOfLongestSubstring(String s) {
        Queue<Character> q = new LinkedList<>();
        int max = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (q.contains(arr[i])) {
                max = Math.max(max, q.size());
                while (!q.isEmpty() && q.poll() != arr[i]) {
                }
            }
            q.offer(arr[i]);
        }
        return Math.max(max, q.size());
    }
}