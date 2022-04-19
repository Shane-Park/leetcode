class Solution {

    public int threeSumMulti(int[] arr, int target) {
        int[] counts = new int[101];
        for (int i : arr) {
            counts[i]++;
        }

        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (counts[i] == 0)
                continue;
            for (int j = i; j <= 100; j++) {
                if (counts[j] == 0)
                    continue;
                for (int k = j; k <= 100; k++) {
                    if (counts[k] == 0)
                        continue;
                    if (i + j + k == target) {
                        Map<Integer, Integer> pick = new HashMap<>();
                        pick.merge(i, 1, Integer::sum);
                        pick.merge(j, 1, Integer::sum);
                        pick.merge(k, 1, Integer::sum);
                        long possibility = 1;
                        for (Integer key : pick.keySet()) {
                            Integer value = pick.get(key);
                            // counts 에서 key를 value 개 뽑을 수 있는 경우의 수 곱하기.
                            possibility *= factorial(counts[key], counts[key] - value + 1) / (factorial(value, 1));
                        }
                        sum = (int) ((sum + possibility) % (1_000_000_000 + 7));
                    }

                }
            }
        }

        return sum;
    }

    private long factorial(int from, int to) {

        long l = 1;
        while (from >= to) {
            l = (l * from--);
        }
        return l;
    }
}