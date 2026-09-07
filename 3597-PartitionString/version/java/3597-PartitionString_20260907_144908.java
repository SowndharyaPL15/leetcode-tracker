// Last updated: 9/7/2026, 2:49:08 PM
1import java.util.*;
2
3class Solution {
4    public List<String> partitionString(String s) {
5        int n = s.length();
6        List<String> segments = new ArrayList<>();
7        Set<String> seen = new HashSet<>();
8        int i = 0;
9
10        while (i < n) {
11            boolean found = false;
12            StringBuilder cur = new StringBuilder();
13            for (int j = i; j < n; j++) {
14                cur.append(s.charAt(j));
15                if (!seen.contains(cur.toString())) {
16                    found = true;
17                    segments.add(cur.toString());
18                    seen.add(cur.toString());
19                    i = j + 1;
20                    break;
21                }
22            }
23            if (!found) break;
24        }
25
26        return segments;
27    }
28}