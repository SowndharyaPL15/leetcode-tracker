// Last updated: 9/9/2026, 2:10:26 PM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!numSet.contains(i)) {
                result.add(i);
            }
        }
        
        return result;        
    }
}