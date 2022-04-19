class KthLargest {

    PriorityQueue<Integer> pq;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.offer(num);
        }
        while (pq.size() > k)
            pq.poll();
    }

    public int add(int val) {
        pq.offer(pq.size() < k ? val : Math.max(val, pq.poll()));
        return pq.peek();
    }
}
