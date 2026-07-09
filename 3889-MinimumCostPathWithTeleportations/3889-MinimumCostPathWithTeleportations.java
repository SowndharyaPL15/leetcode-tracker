// Last updated: 7/9/2026, 9:49:07 AM
class Solution {
    public int minCost(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int INF = 1_000_000_000;
        int maxVal = 0;
        for (int[] row : grid)
            for (int v : row)
                maxVal = Math.max(maxVal, v);
        int[][] dp = new int[m][n];
        for (int[] row : dp) Arrays.fill(row, INF);
        dp[0][0] = 0;
        int[] best = new int[maxVal + 2];
        Arrays.fill(best, INF);
        for (int t = 0; t <= k; t++) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0 && j == 0) continue;
                    int fromUp = i > 0 ? dp[i - 1][j] : INF;
                    int fromLeft = j > 0 ? dp[i][j - 1] : INF;
                    dp[i][j] = Math.min(dp[i][j], Math.min(fromUp, fromLeft) + grid[i][j]);
                }
            }
            Arrays.fill(best, INF);
            for (int i = 0; i < m; i++)
                for (int j = 0; j < n; j++)
                    best[grid[i][j]] = Math.min(best[grid[i][j]], dp[i][j]);
            for (int v = maxVal - 1; v >= 0; v--)
                best[v] = Math.min(best[v], best[v + 1]);
            if (t < k) {
                for (int i = 0; i < m; i++)
                    for (int j = 0; j < n; j++)
                        dp[i][j] = Math.min(dp[i][j], best[grid[i][j]]);
            }
        }
        return dp[m - 1][n - 1];
    }
}
