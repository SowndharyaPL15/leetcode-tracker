// Last updated: 9/1/2026, 11:40:31 AM
class Solution {
    public boolean stoneGameIX(int[] stones) {
        int a = 0, b = 0, c = 0;
        for (int x : stones) {
            if (x % 3 == 0) {
                a++;
            } else if (x % 3 == 1) {
                b++;
            } else {
                c++;
            }
        }
        if (a % 2 == 0) {
            return b > 0 && c > 0;
        }
        return Math.abs(b - c) > 2;
    }
}