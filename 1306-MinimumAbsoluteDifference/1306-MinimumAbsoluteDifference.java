// Last updated: 7/9/2026, 9:52:50 AM
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i] - arr[i - 1]);
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == min) {
                res.add(Arrays.asList(arr[i - 1], arr[i]));
            }
        }
        return res;
    }
}
