class Solution {
public boolean validMountainArray(int[] arr) {
        if (arr.length < 3)
            return false;
        if (arr[0] >= arr[1])
            return false;
        boolean increase = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (increase) {
                if (arr[i] == arr[i + 1]) {
                    return false;
                } else if (arr[i] > arr[i + 1])
                    increase = false;
            } else {
                if (arr[i] <= arr[i + 1])
                    return false;
            }

        }
        return !increase;
    }
}