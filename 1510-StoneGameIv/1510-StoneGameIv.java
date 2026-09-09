// Last updated: 9/9/2026, 2:04:15 PM
class Solution {
    static final int MAX = 100000;
    static final boolean[] dp = new boolean[MAX + 1];

    static {
        for (int i = 0; i <= MAX; i++) {
            if (dp[i]) continue;

            for (int j = 1; j * j <= MAX - i; j++)
                dp[i + j * j] = true;
        }
    }

    public boolean winnerSquareGame(int n) { return dp[n]; }
}