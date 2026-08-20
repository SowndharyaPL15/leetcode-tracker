// Last updated: 8/20/2026, 11:14:14 AM
1class Solution {
2    public int[] resultArray(int[] nums) {
3        List<Integer> arr1 = new ArrayList<>();
4        List<Integer> arr2 = new ArrayList<>();
5        arr1.add(nums[0]);
6        arr2.add(nums[1]);
7
8        for (int i = 2; i < nums.length; i++) {
9            int last1 = arr1.get(arr1.size() - 1);
10            int last2 = arr2.get(arr2.size() - 1);
11            if (last1 > last2) arr1.add(nums[i]);
12            else arr2.add(nums[i]);
13        }
14
15        int[] res = new int[nums.length];
16        int idx = 0;
17        for (int x : arr1) res[idx++] = x;
18        for (int x : arr2) res[idx++] = x;
19        return res;
20    }
21}