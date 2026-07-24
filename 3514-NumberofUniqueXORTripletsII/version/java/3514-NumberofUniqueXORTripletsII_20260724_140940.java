// Last updated: 7/24/2026, 2:09:40 PM
1class Solution {
2
3    public int uniqueXorTriplets(int[] nums) {
4        int n = nums.length;
5        int m = 0;
6        for (int v : nums) {
7            m = Math.max(m, v);
8        }
9        int u = 1;
10        while (u <= m) {
11            u <<= 1;
12        }
13        boolean[] s = new boolean[u];
14        for (int i = 0; i < n; i++) {
15            for (int j = i; j < n; j++) {
16                s[nums[i] ^ nums[j]] = true;
17            }
18        }
19        boolean[] t = new boolean[u];
20        for (int x = 0; x < u; x++) {
21            if (!s[x]) {
22                continue;
23            }
24            for (int v : nums) {
25                t[x ^ v] = true;
26            }
27        }
28        int ans = 0;
29        for (boolean b : t) {
30            if (b) {
31                ans++;
32            }
33        }
34        return ans;
35    }
36}