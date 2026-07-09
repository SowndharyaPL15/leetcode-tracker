// Last updated: 7/9/2026, 9:50:08 AM
class Solution {
    public long minimumCost(String source, String target, String[] original, String[] changed, int[] cost) {
        Map<String, Integer> map = new HashMap<>();
        int id = 0;
        for (int i = 0; i < original.length; i++) {
            if (!map.containsKey(original[i])) map.put(original[i], id++);
            if (!map.containsKey(changed[i])) map.put(changed[i], id++);
        }
        int n = map.size();
        long INF = (long) 1e15;
        long[][] dist = new long[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], INF);
            dist[i][i] = 0;
        }
        for (int i = 0; i < original.length; i++) {
            int u = map.get(original[i]);
            int v = map.get(changed[i]);
            dist[u][v] = Math.min(dist[u][v], cost[i]);
        }
        for (int k = 0; k < n; k++)
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
        Set<Integer> lens = new HashSet<>();
        for (String s : original) lens.add(s.length());
        int L = source.length();
        long[] dp = new long[L + 1];
        Arrays.fill(dp, INF);
        dp[L] = 0;
        for (int i = L - 1; i >= 0; i--) {
            if (source.charAt(i) == target.charAt(i))
                dp[i] = dp[i + 1];
            for (int len : lens) {
                if (i + len > L) continue;
                String s1 = source.substring(i, i + len);
                String s2 = target.substring(i, i + len);
                if (map.containsKey(s1) && map.containsKey(s2)) {
                    long c = dist[map.get(s1)][map.get(s2)];
                    if (c < INF)
                        dp[i] = Math.min(dp[i], c + dp[i + len]);
                }
            }
        }
        return dp[0] >= INF ? -1 : dp[0];
    }
}
