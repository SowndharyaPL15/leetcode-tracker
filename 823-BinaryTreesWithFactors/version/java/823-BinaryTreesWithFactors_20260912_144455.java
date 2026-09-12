// Last updated: 9/12/2026, 2:44:55 PM
1class Solution {
2        public int numFactoredBinaryTrees(int[] A) {
3        long res = 0L, mod = (long)1e9 + 7;
4        Arrays.sort(A);
5        HashMap<Integer, Long> dp = new HashMap<>();
6        for (int i = 0; i < A.length; ++i) {
7            dp.put(A[i], 1L);
8            for (int j = 0; j < i; ++j)
9                if (A[i] % A[j] == 0)
10                    dp.put(A[i], (dp.get(A[i]) + dp.get(A[j]) * dp.getOrDefault(A[i] / A[j], 0L)) % mod);
11            res = (res + dp.get(A[i])) % mod;
12        }
13        return (int) res;
14    }
15}