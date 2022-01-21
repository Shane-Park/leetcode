class Solution {
 public static int canCompleteCircuit(int[] gas, int[] cost) {
        int temp = 0;
        for (int i = 0; i < gas.length; i++) {
            gas[i] -= cost[i];
            temp += gas[i];
        }

        if (temp < 0)
            return -1;

        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        int sum = 0;
        for (int i = 0; i < gas.length; i++) {
            sum += gas[i];
            if (sum < min) {
                min = sum;
                minIndex = i;
            }
        }

        return (minIndex + 1) % gas.length;

    }
}