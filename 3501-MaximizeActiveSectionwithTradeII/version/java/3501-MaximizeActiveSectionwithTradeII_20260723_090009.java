// Last updated: 7/23/2026, 9:00:09 AM
1class SegmentTree {
2    private int n;
3    private int[] arr;
4    private int[] seg;
5    private void build(int p, int l, int r) {
6        if (l == r) {
7            seg[p] = arr[l];
8            return;
9        }
10        int mid = (l + r) >> 1;
11        build(p << 1, l, mid);
12        build((p << 1) | 1, mid + 1, r);
13        seg[p] = Math.max(seg[p << 1], seg[(p << 1) | 1]);
14    }
15    private int _query(int p, int l, int r, int L, int R) {
16        if (L <= l && r <= R) {
17            return seg[p];
18        }
19        int mid = (l + r) >> 1;
20        int res = 0;
21        if (L <= mid) {
22            res = Math.max(res, _query(p << 1, l, mid, L, R));
23        }
24        if (R > mid) {
25            res = Math.max(res, _query((p << 1) | 1, mid + 1, r, L, R));
26        }
27        return res;
28    }
29    public SegmentTree(int[] arr) {
30        this.arr = arr;
31        this.n = arr.length;
32        this.seg = new int[n << 2];
33        build(1, 0, n - 1);
34    }
35    public int query(int L, int R) {
36        if (L > R) {
37            return 0;
38        }
39        return _query(1, 0, n - 1, L, R);
40    }
41}
42class Solution {
43    public List<Integer> maxActiveSectionsAfterTrade(
44        String s,
45        int[][] queries
46    ) {
47        int n = s.length();
48        int cnt1 = 0;
49        for (char c : s.toCharArray()) {
50            if (c == '1') {
51                cnt1++;
52            }
53        }
54        List<Integer> zeroBlocks = new ArrayList<>();
55        List<Integer> blockLeft = new ArrayList<>();
56        List<Integer> blockRight = new ArrayList<>();
57        int i = 0;
58        while (i < n) {
59            int st = i;
60            while (i < n && s.charAt(i) == s.charAt(st)) {
61                i += 1;
62            }
63            if (s.charAt(st) == '0') {
64                zeroBlocks.add(i - st);
65                blockLeft.add(st);
66                blockRight.add(i - 1);
67            }
68        }
69        int m = zeroBlocks.size();
70        if (m < 2) {
71            List<Integer> result = new ArrayList<>();
72            for (int q = 0; q < queries.length; q++) {
73                result.add(cnt1);
74            }
75            return result;
76        }
77        int[] tmpSum = new int[m - 1];
78        for (int k = 0; k < m - 1; k++) {
79            tmpSum[k] = zeroBlocks.get(k) + zeroBlocks.get(k + 1);
80        }
81        SegmentTree seg = new SegmentTree(tmpSum);
82        List<Integer> ans = new ArrayList<>();
83        for (int[] q : queries) {
84            int l = q[0],
85                r = q[1];
86            int idx = lowerBound(blockRight, l);
87            int jdx = upperBound(blockLeft, r) - 1;
88            if (idx > m - 1 || jdx < 0 || idx >= jdx) {
89                ans.add(cnt1);
90                continue;
91            }
92            int firstLen =
93                blockRight.get(idx) - Math.max(blockLeft.get(idx), l) + 1; 
94            int lastLen =
95                Math.min(blockRight.get(jdx), r) - blockLeft.get(jdx) + 1; 
96            if (idx + 1 == jdx) {
97                int bestGain = firstLen + lastLen;
98                ans.add(cnt1 + bestGain);
99                continue;
100            }
101            int val1 = firstLen + zeroBlocks.get(idx + 1);
102            int val2 = zeroBlocks.get(jdx - 1) + lastLen;
103            int val3 = seg.query(idx + 1, jdx - 2);
104            int bestGain = Math.max(Math.max(val1, val2), val3);
105            ans.add(cnt1 + bestGain);
106        }
107        return ans;
108    }
109    private int lowerBound(List<Integer> list, int target) {
110        int left = 0,
111            right = list.size();
112        while (left < right) {
113            int mid = left + (right - left) / 2;
114            if (list.get(mid) < target) {
115                left = mid + 1;
116            } else {
117                right = mid;
118            }
119        }
120        return left;
121    }
122    private int upperBound(List<Integer> list, int target) {
123        int left = 0,
124            right = list.size();
125        while (left < right) {
126            int mid = left + (right - left) / 2;
127            if (list.get(mid) <= target) {
128                left = mid + 1;
129            } else {
130                right = mid;
131            }
132        }
133        return left;
134    }
135}