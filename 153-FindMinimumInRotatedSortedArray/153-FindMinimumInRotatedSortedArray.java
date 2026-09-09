// Last updated: 9/9/2026, 2:14:29 PM
class Solution {
    public int findMin(int[] nums) {
        int n = nums.length - 1;
        int l = nums[n];
        int lf = 0, r = n;
        while (lf < r) {
            int mid = (lf+ r) >> 1;
            if (nums[mid] > l) lf = mid + 1;
            else r = mid;
        }
        return nums[lf];
    }
}