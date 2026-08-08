// Last updated: 8/8/2026, 2:45:32 PM
1class Solution {
2    public int[] validSequence(String word1, String word2) {
3        char[] s = word1.toCharArray();
4        char[] t = word2.toCharArray();
5        int n = s.length;
6        int m = t.length;
7        int[] suffix = new int[n + 1];
8        int j = m - 1;
9        int matched = 0;
10        for (int i = n - 1; i >= 0; i--) {
11            if (j >= 0 && s[i] == t[j]) {
12                matched++;
13                j--;
14            }
15            suffix[i] = matched;
16        }
17        int[] ans = new int[m];
18        int i = 0;
19        j = 0;
20        while (i < n && j < m) {
21            if (s[i] == t[j]) {
22                ans[j] = i;
23                j++;
24            } else {
25                if (suffix[i + 1] >= m - j - 1) {
26                    ans[j] = i;
27                    j++;
28                    i++;
29                    break;
30                }
31            }
32            i++;
33        }
34        if (j < m && i == n)
35            return new int[0];
36        while (i < n && j < m) {
37            if (s[i] == t[j]) {
38                ans[j] = i;
39                j++;
40            }
41            i++;
42        }
43        if (j != m)
44            return new int[0];
45        return ans;
46    }
47}