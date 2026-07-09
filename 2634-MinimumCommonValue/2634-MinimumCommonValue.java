// Last updated: 7/9/2026, 9:50:38 AM
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            if (set1.contains(num)) {
                return num;
            }
        }
        return -1;
    }
}