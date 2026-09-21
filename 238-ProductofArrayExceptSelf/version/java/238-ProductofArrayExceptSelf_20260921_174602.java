// Last updated: 9/21/2026, 5:46:02 PM
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int[] output = new int[nums.length];
4        for (int i = 0; i < nums.length; i++) {
5            output[i] = 1;
6        }
7        int left = 1;
8        for (int i = 0; i < nums.length; i++) {
9            output[i] *= left;
10            left *= nums[i];
11        }
12
13        int right = 1;
14        for (int i = nums.length - 1; i >= 0; i--) {
15            output[i] *= right;
16            right *= nums[i];
17        }
18
19        return output;        
20    }
21}