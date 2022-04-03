class Solution {
 public int maximumCandies(int[] candies, long k) {
        double sum = 0;

        for (int candy : candies) {
            sum += candy;
        }

        int left = sum >= k ? 1 : 0;
        int right = (int) (sum / k);

        Arrays.sort(candies);

        while (left < right) {
            int mid = (left + right) / 2 + 1;
            if (valid(candies, mid, k)) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }

        return left;

    }

    private boolean valid(int[] candies, int min, long k) {
        if (min == 0)
            return true;

        long cnt = 0;
        for (int candy : candies) {
            cnt += candy / min;
            if (cnt >= k)
                return true;
        }
        return false;
    }
}