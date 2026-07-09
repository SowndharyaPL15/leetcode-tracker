// Last updated: 7/9/2026, 9:51:37 AM
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int ans = 0;
        for (int cost : costs) {
            if (cost > coins) break;
            ans++;
            coins -= cost;
        }
        return ans;
    }
}