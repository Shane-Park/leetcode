class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int cnt = 0;
        int complete = 0;
        int water = capacity;

        while (complete < plants.length) {
            if (plants[complete] <= water) {
                water -= plants[complete++];
                cnt++;
            } else {
                cnt += 2 * complete;
                water = capacity;
            }
        }

        return cnt;
    }
}