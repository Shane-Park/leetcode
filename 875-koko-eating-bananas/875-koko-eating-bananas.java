class Solution {

 public static int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 1_000_000_000;
        int mid = (left + right) / 2;

        while (left < right) {
            mid = (left + right) / 2;
            if (checkOK(piles, mid, h)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;

    }

    public static boolean checkOK(int[] piles, int k, int h) {
        int temp = 0;
        for (int pile : piles) {
            temp += (pile - 1) / k + 1;
            if (temp > h)
                return false;
        }
        return true;
    }
}