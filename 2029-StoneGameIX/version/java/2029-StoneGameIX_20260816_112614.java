// Last updated: 8/16/2026, 11:26:14 AM
1class Solution {
2    public boolean stoneGameIX(int[] stones) {
3        int a = 0, b = 0, c = 0;
4        for (int x : stones) {
5            if (x % 3 == 0) {
6                a++;
7            } else if (x % 3 == 1) {
8                b++;
9            } else {
10                c++;
11            }
12        }
13        if (a % 2 == 0) {
14            return b > 0 && c > 0;
15        }
16        return Math.abs(b - c) > 2;
17    }
18}