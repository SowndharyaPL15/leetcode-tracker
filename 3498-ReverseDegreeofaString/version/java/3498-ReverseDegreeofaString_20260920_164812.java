// Last updated: 9/20/2026, 4:48:12 PM
1class Solution {
2    public int reverseDegree(String s) {
3        int ans = 0, idx = 1;
4        for (char ch : s.toCharArray()) {
5            ans += (123 - (int) ch) * idx;
6            idx++;}
7        return ans;}
8}