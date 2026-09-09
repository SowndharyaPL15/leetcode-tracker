// Last updated: 9/9/2026, 2:04:58 PM
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