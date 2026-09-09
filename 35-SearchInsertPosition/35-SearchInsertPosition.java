// Last updated: 9/9/2026, 2:17:38 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;   
        while (left <= right) {
            int mid = left + (right - left) / 2;   
            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return left;
    }
}
