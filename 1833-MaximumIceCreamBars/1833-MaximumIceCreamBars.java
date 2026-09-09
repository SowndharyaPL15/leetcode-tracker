// Last updated: 9/9/2026, 2:01:56 PM
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