// Last updated: 9/1/2026, 11:45:18 AM
public class Solution {
    static int[] nums = new int[5]; 
    public boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                increasing = false;  }
            if (nums[i] < nums[i + 1]) {
                decreasing = false; }
        }
        return increasing || decreasing;
    }
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.isMonotonic(nums)); 
    }
}
