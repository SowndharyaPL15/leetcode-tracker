// Last updated: 8/1/2026, 1:20:25 PM
1class Solution {
2    public boolean predictTheWinner(int[] A) {
3        int n = A.length;
4        if ((n & 1) == 0) return true;
5        int[][] dp = new int[n][n];
6        for (int[] r : dp) 
7            Arrays.fill(r, -1);
8        return maxDiff(0, n - 1, A, dp) >= 0;
9    }
10    private int maxDiff(int i, int j, int[] A, int[][] dp) {
11        if (dp[i][j] != -1) return dp[i][j];        
12        if (i == j) return dp[i][j] = A[i];
13        return dp[i][j] = Math.max(
14            A[i] - maxDiff(i + 1, j, A, dp),
15            A[j] - maxDiff(i, j - 1, A, dp)
16        );
17    }
18}