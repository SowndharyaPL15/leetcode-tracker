// Last updated: 9/9/2026, 2:13:04 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}