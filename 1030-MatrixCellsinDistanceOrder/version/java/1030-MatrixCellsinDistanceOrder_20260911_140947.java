// Last updated: 9/11/2026, 2:09:47 PM
1class Solution {
2    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
3        int[][] res = new int[R*C][2];
4        int idx = 0;
5        for(int i = 0; i < R; i++){
6            for(int j = 0; j < C; j++){
7                res[idx][0] = i;
8                res[idx][1] = j;
9                idx++;
10            }        
11        }    
12        
13        Arrays.sort(res,(o1,o2)->
14           Math.abs(o1[0]-r0)+Math.abs(o1[1]-c0) - (Math.abs(o2[0]-r0) + Math.abs(o2[1]-c0))
15        );
16        
17        return res;
18    }
19}