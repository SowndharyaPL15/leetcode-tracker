// Last updated: 7/26/2026, 1:59:53 PM
1class Solution {
2    public int maximumProduct(int[] nums) {
3        int n=nums.length;
4        Arrays.sort(nums);
5        int d=nums[n-1]*nums[n-2]*nums[n-3];
6        int b=nums[0]*nums[1]*nums[n-1];
7        return Math.max(d,b);
8    }
9}