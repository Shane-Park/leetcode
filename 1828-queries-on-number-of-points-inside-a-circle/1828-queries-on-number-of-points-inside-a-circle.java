class Solution {
    public static int[] countPoints(int[][] points, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < points.length; j++) {
                boolean flag = Math.pow(points[j][0] - queries[i][0], 2) + Math.pow(points[j][1] - queries[i][1], 2) <= Math.pow(queries[i][2], 2);
                if (flag) {
                    answer[i]++;
                }
            }
        }
        return answer;
    }
}