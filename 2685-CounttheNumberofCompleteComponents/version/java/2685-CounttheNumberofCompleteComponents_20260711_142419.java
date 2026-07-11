// Last updated: 7/11/2026, 2:24:19 PM
1public class Solution {
2    public int countCompleteComponents(int n, int[][] edges) {
3        List<Integer>[] graph = new ArrayList[n];
4        Map<List<Integer>, Integer> componentFreq = new HashMap<>();
5        for (int vertex = 0; vertex < n; vertex++) {
6            graph[vertex] = new ArrayList<>();
7            graph[vertex].add(vertex);
8        }
9        for (int[] edge : edges) {
10            graph[edge[0]].add(edge[1]);
11            graph[edge[1]].add(edge[0]);
12        }
13        for (int vertex = 0; vertex < n; vertex++) {
14            List<Integer> neighbors = graph[vertex];
15            Collections.sort(neighbors);
16            componentFreq.put(
17                neighbors,
18                componentFreq.getOrDefault(neighbors, 0) + 1
19            );
20        }
21        int completeCount = 0;
22        for (Map.Entry<
23            List<Integer>,
24            Integer
25        > entry : componentFreq.entrySet()) {
26            if (entry.getKey().size() == entry.getValue()) {
27                completeCount++;
28            }
29        }
30        return completeCount;
31    }
32}