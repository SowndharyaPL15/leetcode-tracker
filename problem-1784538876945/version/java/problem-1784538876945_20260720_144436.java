// Last updated: 7/20/2026, 2:44:36 PM
1class Solution {
2    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
3        int m = grid.length;
4        int n = grid[0].length;
5        int total = m * n;
6        k %= total;
7        List<List<Integer>> ans = new ArrayList<>();
8        for (int i = 0; i < m; i++) {
9            List<Integer> row = new ArrayList<>();
10            for (int j = 0; j < n; j++)
11                row.add(0);
12            ans.add(row);
13        }
14        for (int i = 0; i < m; i++) {
15            for (int j = 0; j < n; j++) {
16                int oldIndex = i * n + j;
17                int newIndex = (oldIndex + k) % total;
18                int newRow = newIndex / n;
19                int newCol = newIndex % n;
20                ans.get(newRow).set(newCol, grid[i][j]);
21            }
22        }
23        return ans;
24    }
25}