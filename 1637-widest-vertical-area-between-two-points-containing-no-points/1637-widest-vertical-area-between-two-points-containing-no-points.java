class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(o -> o[0]));
        int max = 0;
        for (int i = 0; i < points.length - 2; i++) {
            max = Math.max(max, points[i + 1][0] - points[i][0]);
        }
        return max;
    }
}