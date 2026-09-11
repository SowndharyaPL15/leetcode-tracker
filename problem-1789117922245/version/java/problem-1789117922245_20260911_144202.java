// Last updated: 9/11/2026, 2:42:02 PM
1class Solution {
2    public int maxCapacity(int[] costs, int[] capacity, int budget) {
3        long res = 0;
4        int n = costs.length;
5        int[] pref = new int[n];
6        int[][] stateMachine = new int[n][2];
7
8        for(int i=0; i<n; i++){
9            stateMachine[i][0] = costs[i];
10            stateMachine[i][1] = capacity[i];
11        }
12        Arrays.sort(stateMachine, (x, y) -> Integer.compare(x[0], y[0]));
13        
14        pref[0] = stateMachine[0][1];
15        for(int i=1; i<n; i++){
16            pref[i] = Math.max(pref[i - 1], stateMachine[i][1]);
17        }
18
19        for(int i=0; i<n; i++){
20            int cost = stateMachine[i][0];
21            int cap = stateMachine[i][1];
22            if(cost < budget){
23                res = Math.max(res, cap);
24            }
25            int remain = budget - cost;
26            int idx = search(stateMachine, i-1, remain);
27            if(idx != -1){
28                long pc = (long)cap + pref[idx];
29                res = Math.max(res, pc);
30            }
31        }
32        return (int)res;
33    }
34    
35    private int search(int[][] stateMachine, int right, int x){
36        int left = 0;
37        int res = -1;
38        while(left <= right){
39            int m = left + (right - left)/2;
40            if(stateMachine[m][0] < x){
41                res = m;
42                left = m + 1;
43            }
44            else {
45                right = m - 1;
46            }
47        }
48        return res;
49    }
50}