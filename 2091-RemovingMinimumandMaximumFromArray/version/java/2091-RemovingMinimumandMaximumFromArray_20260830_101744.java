// Last updated: 8/30/2026, 10:17:44 AM
1class Solution {
2    public int minimumDeletions(int[] nums) {
3        int n = nums.length;
4        int minidx = 0,
5            maxidx = 0;
6        for (int i = 0; i < n; i++) {
7            if (nums[i] < nums[minidx]) {
8                minidx = i;
9            }
10            if (nums[i] > nums[maxidx]) {
11                maxidx = i;
12            }
13        }
14        int l = Math.min(minidx, maxidx); 
15        int r = Math.max(minidx, maxidx); 
16        return Math.min(Math.min(r + 1, n - l), l + 1 + n - r);
17    }
18}