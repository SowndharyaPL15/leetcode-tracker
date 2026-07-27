// Last updated: 7/27/2026, 12:35:25 PM
1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3        Set<Integer> numSet = new HashSet<>();
4        for (int num : nums) {
5            numSet.add(num);
6        }
7        
8        List<Integer> result = new ArrayList<>();
9        for (int i = 1; i <= nums.length; i++) {
10            if (!numSet.contains(i)) {
11                result.add(i);
12            }
13        }
14        
15        return result;        
16    }
17}