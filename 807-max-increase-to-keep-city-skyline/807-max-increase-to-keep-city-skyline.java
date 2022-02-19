class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] maxX = new int[grid.length];
        int[] maxY = new int[grid.length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                maxX[j] = Math.max(maxX[j], grid[i][j]);
                maxY[i] = Math.max(maxY[i], grid[i][j]);
            }
        }

        int cnt = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                cnt += Math.min((maxX[j] - grid[i][j]), (maxY[i] - grid[i][j]));
            }
        }

        return cnt;

    }
}