// Last updated: 9/9/2026, 2:02:59 PM
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