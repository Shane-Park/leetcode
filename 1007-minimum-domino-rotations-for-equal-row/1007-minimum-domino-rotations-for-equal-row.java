class Solution {
 public int minDominoRotations(int[] tops, int[] bottoms) {
        int[] cnt = new int[6];
        for (int top : tops) {
            cnt[top - 1]++;
        }
        for (int bottom : bottoms) {
            cnt[bottom - 1]++;
        }

        int n = -1;
        for (int i = 0; i < 6; i++) {
            if (cnt[i] >= tops.length) {
                n = i;
            }
        }
        if (n < 0) {
            return n;
        }

        n++;

        int topCnt = 0;
        for (int i = 0; i < tops.length; i++) {
            if (tops[i] == n && bottoms[i] != n) {
                topCnt++;
            } else if (bottoms[i] == n && tops[i] != n) {
                topCnt--;
            } else if (tops[i] != n && bottoms[i] != n) {
                return -1;
            }
        }

        int count = 0;
        int[] main = topCnt > 0 ? tops : bottoms;
        for (int i = 0; i < tops.length; i++) {
            if (main[i] != n) {
                count++;
            }
        }

        return count;
    }
}