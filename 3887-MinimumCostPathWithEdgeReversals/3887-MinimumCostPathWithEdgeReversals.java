// Last updated: 7/9/2026, 9:49:08 AM
// class Solution {
//     public int minCost(int n, int[][] edges) {
        
//     }
// }

class Solution {
    public int minCost(int n, int[][] edges) {
        List<int[]>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();
        for (int[] e : edges) {
            int u = e[0], v = e[1], w = e[2];
            graph[u].add(new int[]{v, w});
            graph[v].add(new int[]{u, 2 * w});
        }
        long[] dist = new long[n];
        Arrays.fill(dist, Long.MAX_VALUE);
        dist[0] = 0;
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(0);
        while (!dq.isEmpty()) {
            int node = dq.pollFirst();
            for (int[] nxt : graph[node]) {
                int next = nxt[0];
                long cost = nxt[1];
                if (dist[node] + cost < dist[next]) {
                    dist[next] = dist[node] + cost;
                    if (cost % 2 == 0)
                        dq.addLast(next);
                    else
                        dq.addFirst(next);
                }
            }
        }
        return dist[n - 1] == Long.MAX_VALUE ? -1 : (int) dist[n - 1];
    }
}