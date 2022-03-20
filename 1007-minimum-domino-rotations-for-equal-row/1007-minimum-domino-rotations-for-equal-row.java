class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int[] topCnt = new int[7];
        int[] bottomCnt = new int[7];
        int[] bothCnt = new int[7];
        for (int i = 0; i < tops.length; i++) {
            topCnt[tops[i]]++;
            bottomCnt[bottoms[i]]++;
            if (tops[i] == bottoms[i]) {
                bothCnt[tops[i]]++;
            }
        }

        for (int i = 1; i <= 6; i++) {
            if (topCnt[i] + bottomCnt[i] == tops.length + bothCnt[i]) {
                return Math.min(tops.length - topCnt[i], tops.length - bottomCnt[i]);
            }
        }

        return -1;
    }
}