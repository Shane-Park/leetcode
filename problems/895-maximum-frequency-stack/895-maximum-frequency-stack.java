class FreqStack {
        Map<Integer, Integer> countMap = new HashMap<>();
        Map<Integer, Stack<Integer>> stackMap = new HashMap<>();
        int maxCount;

        public void push(int val) {
            int count = countMap.getOrDefault(val, 0) + 1;
            countMap.put(val, count);
            maxCount = Math.max(maxCount, count);
            stackMap.putIfAbsent(count, new Stack<>());
            Stack<Integer> stack = stackMap.get(count);
            stack.add(val);
        }

        public int pop() {
            Stack<Integer> maxStack = stackMap.get(maxCount);
            Integer val = maxStack.pop();
            countMap.put(val, maxCount - 1);
            if (maxStack.isEmpty())
                maxCount--;
            return val;
        }

    }