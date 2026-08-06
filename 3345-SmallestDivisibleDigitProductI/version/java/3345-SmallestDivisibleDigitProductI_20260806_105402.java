// Last updated: 8/6/2026, 10:54:02 AM
1class Solution {
2    public int smallestNumber(int n, int t) {
3        while (true) {
4            int product = 1;
5            int x = n;
6            while (x > 0) {
7                product *= (x % 10);
8                x /= 10;
9            }
10            if (product % t == 0)
11                return n;
12            n++;
13        }
14    }
15}