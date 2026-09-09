// Last updated: 9/9/2026, 2:18:03 PM
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int num : nums) {
            if (num != val) 
            nums[k++] = num;
        }
        return k;
    }
}