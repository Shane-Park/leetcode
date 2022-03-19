 class FreqStack {

        PriorityQueue<Num> pq;
        Map<Integer, Num> map;
        int pushCount;

        public FreqStack() {
            this.pq = new PriorityQueue<>((o1, o2) -> {
                int size1 = o1.pushIndex.size();
                int size2 = o2.pushIndex.size();
                if (size1 == size2) {
                    return o2.pushIndex.peek() - o1.pushIndex.peek();
                }
                return size2 - size1;
            });
            this.map = new HashMap<>();
            this.pushCount = 0;
        }

        public void push(int val) {
            Num num = map.get(val);
            if (num == null) {
                num = new Num(val);
                map.put(val, num);
            }

            if (pq.contains(num))
                pq.remove(num);

            num.pushIndex.push(pushCount++);
            pq.offer(num);
        }

        public int pop() {
            Num num = pq.poll();
            num.pushIndex.pop();
            if (!num.pushIndex.isEmpty())
                pq.offer(num);
            return num.val;
        }

        class Num {
            int val;
            Stack<Integer> pushIndex;

            public Num(int number) {
                this.val = number;
                this.pushIndex = new Stack<>();
            }

            @Override
            public String toString() {
                return "Num{" +
                        "val=" + val +
                        ", pushIndex=" + pushIndex +
                        '}';
            }
        }
    }

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */