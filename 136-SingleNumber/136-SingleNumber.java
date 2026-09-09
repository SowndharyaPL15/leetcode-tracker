// Last updated: 9/9/2026, 2:14:58 PM
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; 
        }
        return result;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {4, 1, 2, 1, 2}; 
        int result = solution.singleNumber(nums);
        System.out.println("The single number is: " + result);
    }
}
