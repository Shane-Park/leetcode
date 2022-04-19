class Solution {
    public static int maxDistToClosest(int[] seats) {

        int maxLength = 0, maxStartIndex = 0, maxEndIndex = 0;
        int currentLength = 0, currentZeroCount = 0, currentStartIndex = 0;

        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 0) {
                currentZeroCount++;
                currentLength = (currentStartIndex == 0 || i == seats.length - 1) ? currentZeroCount : (currentZeroCount + 1) / 2;
                if (maxLength <= currentLength) {
                    maxLength = currentLength;
                    maxStartIndex = currentStartIndex;
                    maxEndIndex = i;
                }
            } else {
                currentZeroCount = 0;
                if (i < seats.length - 1 && seats[i + 1] == 0) {
                    currentStartIndex = i + 1;
                }
            }
        }

        if (maxLength == 1)
            return 1;

        return maxLength;
    }
}