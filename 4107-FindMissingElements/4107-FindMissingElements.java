// Last updated: 9/1/2026, 11:33:34 AM
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums);
        int c = nums[0];
        for(int i = 0 ; i < nums.length ; c++, i++){
            if(c < nums[i]){
                res.add(c);
                i--;
            }
        }
        return res;
    }
}