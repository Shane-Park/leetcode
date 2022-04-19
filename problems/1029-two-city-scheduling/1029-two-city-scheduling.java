class Solution {
public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (o1, o2) -> Integer.compare(Math.abs(o2[0] - o2[1]), Math.abs(o1[0] - o1[1])));
        int cost = 0;
        int cityA = 0;
        int cityB = 0;

        int i = 0;
        for (; cityA < costs.length / 2 && cityB < costs.length / 2; i++) {
            int[] person = costs[i];
            if (person[0] > person[1]) {
                cityB++;
                cost += person[1];
            } else {
                cityA++;
                cost += person[0];
            }
        }

        int j = (cityA == costs.length / 2 ? 1 : 0);
        for (; i < costs.length; i++) {
            cost += costs[i][j];
        }

        return cost;

    }
}