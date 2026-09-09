// Last updated: 9/9/2026, 12:37:16 PM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int a[]=new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            a[i] +=nums[i];
            a[i+nums.length]+=nums[i];
        }
        return a;
    }
}