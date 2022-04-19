class Solution {

    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int cnt = 0;
        for (int i = 0, j = people.length - 1; i <= j; j--, cnt++) {
            if (limit - people[j] >= people[i]) {
                i++;
            }
        }
        return cnt;
    }
}