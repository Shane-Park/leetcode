class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(((o1, o2) -> o2 - o1));
        for (int stone : stones) {
            pq.add(stone);
        }
        while (pq.size() > 1) {
            Integer stone1 = pq.poll();
            Integer stone2 = pq.poll();
            if (stone1 != stone2) {
                pq.add(stone1 - stone2);
            }
        }
        return pq.isEmpty() ? 0 : pq.poll();
    }
}