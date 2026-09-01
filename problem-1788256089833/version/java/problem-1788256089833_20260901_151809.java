// Last updated: 9/1/2026, 3:18:09 PM
1class Solution {
2   public int minCut(String s) {
3        char[] c = s.toCharArray();
4        int n = c.length;
5        int[] cut = new int[n];
6        boolean[][] pal = new boolean[n][n];
7        
8        for(int i = 0; i < n; i++) {
9            int min = i;
10            for(int j = 0; j <= i; j++) {
11                if(c[j] == c[i] && (j + 1 > i - 1 || pal[j + 1][i - 1])) {
12                    pal[j][i] = true;  
13                    min = j == 0 ? 0 : Math.min(min, cut[j - 1] + 1);
14                }
15            }
16            cut[i] = min;
17        }
18        return cut[n - 1];
19    }
20}