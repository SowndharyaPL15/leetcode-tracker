// Last updated: 8/4/2026, 6:14:58 PM
1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3        List<Integer> res = new ArrayList<>();
4        Arrays.sort(nums);
5        int c = nums[0];
6        for(int i = 0 ; i < nums.length ; c++, i++){
7            if(c < nums[i]){
8                res.add(c);
9                i--;
10            }
11        }
12        return res;
13    }
14}