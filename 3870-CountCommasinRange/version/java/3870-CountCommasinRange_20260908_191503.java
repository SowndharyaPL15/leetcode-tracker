// Last updated: 9/8/2026, 7:15:03 PM
1class Solution {
2    public int countCommas(int n) {
3        int count = 0;
4        for (int i = 1; i <= n; i++) {
5            if (i >= 1000) {
6                count++;
7            }
8        }
9        return count;
10    }
11}