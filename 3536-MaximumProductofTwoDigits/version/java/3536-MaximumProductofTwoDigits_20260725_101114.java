// Last updated: 7/25/2026, 10:11:14 AM
1class Solution {
2    public int maxProduct(int n) {
3        int max1 = 0, max2 = 0;
4        for (; n != 0; n /= 10) {
5            int d = n % 10;
6            if (d >= max1) {
7                max2 = max1;
8                max1 = d;
9            } else if (d > max2) 
10                max2 = d;
11        }
12
13        return max1 * max2;
14    }
15}