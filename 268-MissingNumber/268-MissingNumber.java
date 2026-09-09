// Last updated: 9/9/2026, 2:12:32 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expected = n * (n + 1) / 2;
        int actual = 0;
        for(int num : nums){
            actual += num;
        } 
        return expected - actual;
    }
}