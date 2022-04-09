class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Number> map = new HashMap<>();
        for (int num : nums) {
            Number number = map.getOrDefault(num, new Number(num));
            number.count++;
            map.putIfAbsent(num, number);
        }
        List<Number> list = map.values().stream().sorted().collect(Collectors.toList());
        int[] answer = new int[k];

        for (int i = 0; i < k; i++) {
            answer[i] = list.get(i).number;
        }

        return answer;
    }

    class Number implements Comparable {
        int number;
        int count;

        public Number(int number) {
            this.number = number;
        }

        @Override
        public int compareTo(Object o) {
            return ((Number) o).count - count;
        }

        @Override
        public String toString() {
            return "Number{" +
                    "number=" + number +
                    ", count=" + count +
                    '}';
        }
    }
}