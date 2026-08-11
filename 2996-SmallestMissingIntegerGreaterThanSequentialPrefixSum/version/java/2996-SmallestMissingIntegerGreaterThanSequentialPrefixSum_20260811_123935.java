// Last updated: 8/11/2026, 12:39:35 PM
1class Solution {
2    public int missingInteger(int[] nums) {
3        int countSum = nums[0];
4        for (int i = 1; i < nums.length; i++) {
5            if (nums[i - 1] + 1 == nums[i]) countSum += nums[i];
6            else break;
7        }
8        Arrays.sort(nums);
9        for (int i = 0; i < nums.length; i++) {
10            if (countSum == nums[i]) {
11                countSum++;
12            }
13        }
14        return countSum;
15    }
16}