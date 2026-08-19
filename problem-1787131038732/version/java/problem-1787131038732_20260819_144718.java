// Last updated: 8/19/2026, 2:47:18 PM
1class Solution {
2    public int maxNumberOfFamilies(int n, int[][] rs) {
3        HashMap<Integer, Integer> mp = new HashMap<>(); 
4        for(int[] r: rs) {
5            int row = r[0], seat = r[1]; 
6            mp.merge(row, 1 << (10 - seat), (a, b) -> a | b);
7        }
8        int ans = (n - mp.size()) * 2; 
9        int[] masks = {0b0111100000, 0b0000011110, 0b0001111000};
10        for(int x: mp.values()) {
11            for(int m: masks) {
12                if((m & x) == 0) {
13                    ans++; 
14                    x |= m; 
15                }
16            }
17        }
18        return ans; 
19    
20    }
21    public int maxNumberOfFamiliesUsingList(int n, int[][] rs) {
22        HashMap<Integer, List<Integer>> mp = new HashMap<>(); 
23        for(int[] r: rs) {
24            if(r[1] == 1 || r[1] == 10) continue; 
25            mp.computeIfAbsent(r[0], k -> new ArrayList<>()).add(r[1]); 
26        }
27        int sz = mp.size();  
28        int left = n - sz; 
29        int ans = 2 * left; 
30        for(Map.Entry<Integer, List<Integer>> entry : mp.entrySet()) {
31            List<Integer> value = entry.getValue();  
32            boolean block1 = true, block2 = true, block3 = true; 
33            for(Integer x: value) {
34                if(x >= 2 && x <= 5) block1 = false; 
35                if(x >= 4 && x <= 7) block2 = false; 
36                if(x >= 6 && x <= 9) block3 = false; 
37            }
38            if(block1 && block3) ans += 2; 
39            else if(block1 || block2 || block3) ans += 1; 
40        }; 
41        return ans; 
42    }
43}