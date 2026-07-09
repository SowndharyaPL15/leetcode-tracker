// Last updated: 7/9/2026, 9:51:05 AM
class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int res = 0; 
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (colors[i] != colors[j]) {
                    res = Math.max(res, j - i);
                }
            }
        }
        return res;
    }
}