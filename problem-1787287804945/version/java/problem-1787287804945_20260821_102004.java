// Last updated: 8/21/2026, 10:20:04 AM
1class Solution {
2
3    public long findKthSmallest(int[] coins, int k) {
4        Arrays.sort(coins);
5        int n = coins.length;
6        int m = 1 << n;
7
8        long l = k;
9        long r = (long) coins[0] * k + 1;
10
11        int[] bitCount = new int[m];
12        long[] lcm = new long[m];
13
14        for (int mask = 1; mask < m; mask++) {
15            long curLcm = 1;
16            for (int i = 0; i < n; i++) {
17                if (((mask >> i) & 1) == 1) {
18                    long g = gcd(curLcm, coins[i]);
19                    long tmp = curLcm / g;
20
21                    if (tmp <= r / coins[i]) {
22                        curLcm = tmp * coins[i];
23                    } else {
24                        curLcm = r + 1;
25                        break;
26                    }
27                    bitCount[mask]++;
28                }
29            }
30            lcm[mask] = curLcm;
31        }
32
33        while (l < r) {
34            long x = l + (r - l) / 2;
35            if (count(x, m, lcm, bitCount) >= k) {
36                r = x;
37            } else {
38                l = x + 1;
39            }
40        }
41        return l;
42    }
43
44    private long count(long x, int m, long[] lcm, int[] bitCount) {
45        long res = 0;
46        for (int mask = 1; mask < m; mask++) {
47            if (lcm[mask] > x) continue;
48
49            if ((bitCount[mask] & 1) == 1) {
50                res += x / lcm[mask];
51            } else {
52                res -= x / lcm[mask];
53            }
54        }
55        return res;
56    }
57
58    private long gcd(long a, long b) {
59        while (b != 0) {
60            long t = b;
61            b = a % b;
62            a = t;
63        }
64        return a;
65    }
66}