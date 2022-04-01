class Solution {
  public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[][] answer = new int[n][image.length];
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                answer[i][j] = image[i][n - 1 - j] == 0 ? 1 : 0;
            }
        }
        return answer;
    }
}