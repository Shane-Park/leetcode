class Solution {
     public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int[] answer = new int[k];
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int[] log : logs) {
            Set<Integer> set = map.getOrDefault(log[0], new HashSet<>());
            set.add(log[1]);
            map.putIfAbsent(log[0], set);
        }

        for (Set<Integer> set : map.values()) {
            answer[set.size() - 1]++;
        }

        return answer;

    }
}