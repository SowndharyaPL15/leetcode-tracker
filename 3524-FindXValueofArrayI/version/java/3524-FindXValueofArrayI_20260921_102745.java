// Last updated: 9/21/2026, 10:27:45 AM
1class Solution {
2    public long[] resultArray(int[] nums, int k) {
3        int n = nums.length;
4        long[] result = new long[k];
5        long[] dp = new long[k]; 
6        for (int i = 0; i < n; i++) {
7            long[] ndp = new long[k];
8            ndp[nums[i] % k]++;
9            for (int r = 0; r < k; r++) {
10                ndp[(int) (((long) r * nums[i]) % k)] += dp[r];
11            }
12            dp = ndp; 
13            for (int r = 0; r < k; r++) {
14                result[r] += dp[r];
15            }
16        }
17        return result;
18    }
19}