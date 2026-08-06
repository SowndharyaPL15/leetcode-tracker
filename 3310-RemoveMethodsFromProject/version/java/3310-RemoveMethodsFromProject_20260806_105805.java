// Last updated: 8/6/2026, 10:58:05 AM
1class Solution {
2
3    void dfs(int node, HashMap<Integer, ArrayList<Integer>> invoke, int[] vis) {
4        vis[node] = 1;
5
6        if (!invoke.containsKey(node))
7            return;
8
9        for (int it : invoke.get(node)) {
10            if (vis[it] == 0) {
11                dfs(it, invoke, vis);
12            }
13        }
14    }
15
16    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
17        HashMap<Integer, ArrayList<Integer>> invoke = new HashMap<>();
18
19        for (int[] it : invocations) {
20            int u = it[0];
21            int v = it[1];
22
23            invoke.computeIfAbsent(u, x -> new ArrayList<>()).add(v);
24        }
25
26        int[] vis = new int[n];
27        dfs(k, invoke, vis);
28
29        List<Integer> rem = new ArrayList<>();
30
31        for (int[] it : invocations) {
32            int u = it[0];
33            int v = it[1];
34
35            if (vis[u] == 0 && vis[v] == 1) {
36                for (int i = 0; i < n; i++)
37                    rem.add(i);
38                return rem;
39            }
40        }
41
42        for (int i = 0; i < n; i++) {
43            if (vis[i] == 0)
44                rem.add(i);
45        }
46
47        return rem;
48    }
49}