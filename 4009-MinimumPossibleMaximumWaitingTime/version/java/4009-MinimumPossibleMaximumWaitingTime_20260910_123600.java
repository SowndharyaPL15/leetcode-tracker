// Last updated: 9/10/2026, 12:36:00 PM
1class Solution {
2    Map<String, int[]> memo = new HashMap<>();
3    int n;
4    int[] demand;
5
6    int[] dfs(int i, int f0, int f1, int w0, int w1) {
7        String key = i + "," + f0 + "," + f1 + "," + w0 + "," + w1;
8        if (memo.containsKey(key)) return memo.get(key);
9
10        int[] res = new int[]{-i, 0};
11        if (i == n) return res;
12
13        int d = demand[i];
14        if (f0 >= d) {
15            int[] nxt = dfs(i + 1, f0 - d, f1, d, Math.max(0, w1 - w0));
16            int[] cand = new int[]{nxt[0], Math.max(nxt[1], w0)};
17            if (cand[0] < res[0] || (cand[0] == res[0] && cand[1] < res[1])) {
18                res = cand;
19            }
20        }
21        if (f1 >= d) {
22            int[] nxt = dfs(i + 1, f0, f1 - d, Math.max(0, w0 - w1), d);
23            int[] cand = new int[]{nxt[0], Math.max(nxt[1], w1)};
24            if (cand[0] < res[0] || (cand[0] == res[0] && cand[1] < res[1])) {
25                res = cand;
26            }
27        }
28
29        memo.put(key, res);
30        return res;
31    }
32
33    public int minMaxWaitingTime(int[] demand, int[] fuel) {
34        this.n = demand.length;
35        this.demand = demand;
36        int[] result = dfs(0, fuel[0], fuel[1], 0, 0);
37        return result[0] != 0 ? result[1] : -1;
38    }
39}