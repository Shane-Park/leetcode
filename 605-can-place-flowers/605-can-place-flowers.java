class Solution {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int previous = 0;
        for (int i = 0; i < flowerbed.length && 0 < n; i++) {
            int current = flowerbed[i];
            int next = (i < flowerbed.length - 1) ? flowerbed[i + 1] : 0;
            if (previous + current + next == 0) {
                n--;
                current=1;
            }
            previous = current;
        }
        return n == 0;
    }
}