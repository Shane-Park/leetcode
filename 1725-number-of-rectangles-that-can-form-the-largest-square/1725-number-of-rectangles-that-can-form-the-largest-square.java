class Solution {

    public int countGoodRectangles(int[][] rectangles) {
        int max = 0;
        int cnt = 0;
        for (int[] rectangle : rectangles) {
            int length = Math.min(rectangle[0], rectangle[1]);
            if (length > max) {
                cnt = 1;
                max = length;
            } else if (length == max) {
                cnt++;
            }
        }
        return cnt;
    }
}