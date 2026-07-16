// Last updated: 7/16/2026, 5:07:00 PM
1class Solution {
2    private int gcd(int a, int b) { return b == 0 ? a : gcd(b, a % b); }
3
4    public long gcdSum(int[] A) {
5        int max = 0;
6        for (int i = 0; i < A.length; i++) {
7            max = Math.max(max, A[i]);
8            A[i] = gcd(A[i], max);
9        }
10        Arrays.sort(A);
11        long res = 0;        
12        for (int i = 0, j = A.length - 1; i < j; i++, j--)
13            res += gcd(A[i], A[j]);
14        return res;
15    }
16}