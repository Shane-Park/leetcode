class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        Deque<Integer> dq = new ArrayDeque<>();
        for (int person : people) {
            dq.offer(person);
        }

        int cnt = 0;
        while (!dq.isEmpty()) {
            int capacity = limit - dq.pollLast();
            int peopleCount = 1;
            while (peopleCount < 2 && !dq.isEmpty() && capacity >= dq.peekFirst()) {
                capacity -= dq.pollFirst();
                peopleCount++;
            }
            cnt++;
        }

        return cnt;
    }
}