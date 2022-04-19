class Solution {
 public int shortestPathLength(int[][] graph) {
        Queue<int[]> q = new LinkedList<>();
        Set<Status> set = new HashSet<>();
        int target = 0;
        for (int i = 0; i < graph.length; i++) {
            int status = 1 << (i + 1);
            target = target | (status);
            set.add(new Status(status, i));
            q.offer(new int[]{status, i});
        }

        int distance = 0;
        int num = q.size();
        int nextNum = 0;
        while (!q.isEmpty()) {
            int[] poll = q.poll();
            num--;
            if (poll[0] == target) {
                return distance;
            }
            for (int i = 0; i < graph[poll[1]].length; i++) {
                int next = graph[poll[1]][i];
                int nextStatus = poll[0] | (1 << (next + 1));
                Status status = new Status(nextStatus, next);
                if (set.contains(status))
                    continue;
                set.add(status);
                q.offer(new int[]{nextStatus, next});
                nextNum++;
            }

            if (num == 0) {
                num = nextNum;
                nextNum = 0;
                distance++;
            }
        }

        return -1;

    }
    
        class Status {
        int status;
        int node;

        public Status(int status, int node) {
            this.status = status;
            this.node = node;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Status status1 = (Status) o;
            return status == status1.status && node == status1.node;
        }

        @Override
        public int hashCode() {
            return Objects.hash(status, node);
        }
    }
}