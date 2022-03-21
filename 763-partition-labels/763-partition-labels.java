class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character, Integer> lastIndex = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            lastIndex.put(s.charAt(i), i);
        }
        int cur = 0;
        int before = 0;
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            cur = Math.max(cur, lastIndex.get(s.charAt(i)));
            if (i == cur) {
                answer.add(i - before + 1);
                before = i + 1;
            }
        }

        return answer;
    }
}