// Last updated: 9/28/2026, 11:11:47 AM
1class Solution {
2    public int maxDepth(String s) {
3        int currentDepth = 0; 
4        int maxDepth = 0; 
5        for (char ch : s.toCharArray()) {
6            if (ch == '(') {
7                currentDepth++;
8                maxDepth = Math.max(maxDepth, currentDepth); 
9            } else if (ch == ')') {
10                currentDepth--; 
11            }
12        }
13        return maxDepth;
14    }
15}