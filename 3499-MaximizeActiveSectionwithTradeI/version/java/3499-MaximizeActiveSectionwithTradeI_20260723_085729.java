// Last updated: 7/23/2026, 8:57:29 AM
1class Solution {
2    public int maxActiveSectionsAfterTrade(String s) {
3        int n = s.length();
4        int cnt1 = 0;
5        for (char c : s.toCharArray()) {
6            if (c == '1') cnt1++;
7        }
8        List<Integer> zeroBlocks = new ArrayList<>();
9        int i = 0;
10        while (i < n) {
11            int start = i;
12            while (i < n && s.charAt(i) == s.charAt(start)) {
13                i++;
14            }
15            if (s.charAt(start) == '0') {
16                zeroBlocks.add(i - start);
17            }
18        }
19        int m = zeroBlocks.size();
20        if (m < 2) {
21            return cnt1;
22        }
23        int bestGain = 0; 
24        for (int j = 0; j < m - 1; j++) {
25            bestGain = Math.max(
26                bestGain,
27                zeroBlocks.get(j) + zeroBlocks.get(j + 1)
28            );
29        }
30        return cnt1 + bestGain;
31    }
32}