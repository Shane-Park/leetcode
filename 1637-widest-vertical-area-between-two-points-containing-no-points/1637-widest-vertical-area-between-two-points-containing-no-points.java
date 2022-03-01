class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int[] point : points) {
            q.offer(point[0]);
        }
        int maxGap = 0;
        int before = q.poll();
        while (!q.isEmpty()) {
            Integer poll = q.poll();
            maxGap = Math.max(maxGap, poll - before);
            before = poll;
        }
        return maxGap;
    }
}