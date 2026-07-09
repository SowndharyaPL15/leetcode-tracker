// Last updated: 7/9/2026, 9:51:53 AM
class Solution {
    public int minPartitions(String n) {
      int ans = 0;
        for (char c : n.toCharArray()) {
            ans = Math.max(ans, c - '0');
            if (ans == 9) break; 
        }
        return ans;   
    }
}