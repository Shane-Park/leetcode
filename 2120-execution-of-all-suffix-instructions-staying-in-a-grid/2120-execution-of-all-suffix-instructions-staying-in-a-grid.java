class Solution {
 public int[] executeInstructions(int n, int[] startPos, String s) {
        int[] answer = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int cnt = 0;
            int y = startPos[0];
            int x = startPos[1];

            for (int j = i; j < s.length(); j++) {
                switch (s.charAt(j)) {
                    case 'R':
                        x++;
                        break;
                    case 'L':
                        x--;
                        break;
                    case 'D':
                        y++;
                        break;
                    case 'U':
                        y--;
                        break;
                }
                if (x < 0 || y < 0 || x >= n || y >= n) {
                    break;
                }
                cnt++;
            }
            answer[i] = cnt;
        }
        return answer;
    }
}