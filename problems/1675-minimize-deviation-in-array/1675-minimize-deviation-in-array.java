class Solution {
   public int minimumDeviation(int[] nums) {
        PriorityQueue<Integer> q = new PriorityQueue<>((o1, o2) -> Integer.compare(o2, o1));
        int min = Integer.MAX_VALUE;
        int answer = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n % 2 == 1)
                n *= 2;
            q.add(n);
            min = Math.min(min, n);
        }

        while (true) {
            int max = q.poll();
            answer = Math.min(answer, max - min);
            if (max % 2 == 1) {
                break;
            }
            q.add(max / 2);
            min = Math.min(min, max / 2);
        }

        return answer;
    }
}