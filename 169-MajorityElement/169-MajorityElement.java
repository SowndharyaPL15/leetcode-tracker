// Last updated: 9/9/2026, 2:14:06 PM
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int temp = 0;
        for(int num : nums){
            if(count == 0){
                temp = num;
            }
            count += (num == temp) ? 1: -1;
        }
        return temp;
    }
}