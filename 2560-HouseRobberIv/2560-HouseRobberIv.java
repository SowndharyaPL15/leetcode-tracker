// Last updated: 9/9/2026, 12:35:36 PM
public class Solution {
    public int minCapability(int[] nums, int k) {
        int left = 0, right = 0;
        for (int num : nums) {
            right = Math.max(right, num);
        }
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canRob(nums, mid, k)) {
                right = mid; 
            } else {
                left = mid + 1; 
            }
        }
        return left; 
    }
    private boolean canRob(int[] nums, int capability, int k) {
        int count = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] <= capability) {
                count++; 
                i++; 
            }
            i++; 
        }
        return count >= k; 
    }
}