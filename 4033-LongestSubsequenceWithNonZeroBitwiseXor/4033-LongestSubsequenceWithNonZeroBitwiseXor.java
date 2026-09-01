// Last updated: 9/1/2026, 11:34:02 AM
class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int totalXor = 0;
        boolean allZero = true;
        for (int x : nums) {
            totalXor ^= x;
            if (x > 0) {
                allZero = false;
            }
        }
        if (totalXor > 0) {
            return n;
        }
        return allZero ? 0 : n - 1;
    }
}