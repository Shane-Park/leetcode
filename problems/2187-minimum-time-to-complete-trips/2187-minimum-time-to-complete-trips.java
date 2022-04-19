class Solution {

    public long minimumTime(int[] time, int totalTrips) {

        if (time == null || totalTrips <= 0)
            return 0;

        if (time.length == 1) {
            return (long) time[0] * totalTrips;
        }

        long left = 0;
        long right = Integer.MAX_VALUE * (long) Math.pow(10, 7);

        while (left < right) {
            long mid = (left + right) / 2;
            if (calcTrips(time, mid) >= totalTrips) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private double calcTrips(int[] time, long n) {
        double cnt = 0;
        for (int i : time) {
            cnt += n / i;
        }
        return cnt;
    }
}