// Last updated: 9/9/2026, 2:17:14 PM
class Solution {
    public int maxSubArray(int[] nums) {
        int Sum=nums[0];
        int max=nums[0];
        for (int i=1; i<nums.length;i++) {
            Sum = Math.max(nums[i],Sum+nums[i]);
            max=Math.max(max,Sum);
        }
        return max;
    }
}
