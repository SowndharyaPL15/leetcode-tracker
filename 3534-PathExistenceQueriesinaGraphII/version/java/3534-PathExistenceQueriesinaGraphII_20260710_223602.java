// Last updated: 7/10/2026, 10:36:02 PM
1class Solution {
2    public int[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
3        int[][] newNums = new int[n][2];
4        for (int i = 0; i < n; i++) newNums[i] = new int[]{nums[i], i};
5        Arrays.sort(newNums, (a, b) -> a[0] - b[0]);
6        int[] getI = new int[n];
7        for (int i = 0; i < n; i++) getI[newNums[i][1]] = i;
8        int[][] st = new int[n][18];
9        int r = 0;
10        for (int i = 0; i < n; i++) {
11            if (r < i) r = i;
12            while (r + 1 < n &&
13                   newNums[r + 1][0] - newNums[r][0] <= maxDiff &&
14                   newNums[r + 1][0] - newNums[i][0] <= maxDiff)
15                r++;
16            st[i][0] = r;
17        }
18        for (int j = 1; j < 18; j++)
19            for (int i = 0; i < n; i++)
20                st[i][j] = st[st[i][j - 1]][j - 1];
21        int[] ans = new int[queries.length];
22        for (int i = 0; i < queries.length; i++) {
23            int a = getI[queries[i][0]], b = getI[queries[i][1]];
24            if (a > b) { int t = a; a = b; b = t; }
25            if (a == b) { ans[i] = 0; continue; }
26            int curr = a, steps = 0;
27            for (int j = 17; j >= 0; j--)
28                if (st[curr][j] < b) { curr = st[curr][j]; steps += (1 << j); }
29            ans[i] = (st[curr][0] >= b) ? steps + 1 : -1;
30        }
31        return ans;
32    }
33}