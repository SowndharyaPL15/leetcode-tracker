// Last updated: 7/9/2026, 9:52:30 AM
class Solution {
    public int maxSatisfaction(int[] satisfaction) {
       Arrays.sort(satisfaction);
        int total = 0;
        int prefix = 0;
        int res = 0;
        for (int i = satisfaction.length - 1; i >= 0; i--) {
            prefix += satisfaction[i];
            if (prefix + res > res) {
                res += prefix;
            } else {
                break;
            }
        }
        return res;
    }
}