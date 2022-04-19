class Solution {
       int[] maxSheet;
    int maxPoint;

    public int[] maximumBobPoints(int numArrows, int[] aliceArrows) {
        maxPoint = 0;
        bt(aliceArrows, new int[12], numArrows, 0, 0);
        return maxSheet;
    }

    private void bt(int[] aliceArrows, int[] bobArrows, int remainArrows, int i, int currentPoint) {
        if (i == 12 || remainArrows == 0) {
            if (currentPoint > maxPoint) {
                maxPoint = currentPoint;
                maxSheet = bobArrows.clone();
                maxSheet[0] += remainArrows;
            }
            return;
        }
        // getCurrentIndexScore
        int necessary = aliceArrows[i] + 1;
        if (remainArrows >= necessary) {
            bobArrows[i] = necessary;
            bt(aliceArrows, bobArrows, remainArrows - necessary, i + 1, currentPoint + i);
            bobArrows[i] = 0;
        }

        // skip
        bt(aliceArrows, bobArrows, remainArrows, i + 1, currentPoint);

    }
}