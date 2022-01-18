class Solution {
 public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int previous = 0;
        for (int i = 0; i < flowerbed.length && 0 < n; i++) {
            if (previous + flowerbed[i] + ((i < flowerbed.length - 1) ? flowerbed[i + 1] : 0) == 0) {
                n--;
                previous = 1;
            } else {
                previous = flowerbed[i];
            }
        }
        return n == 0;
    }
}