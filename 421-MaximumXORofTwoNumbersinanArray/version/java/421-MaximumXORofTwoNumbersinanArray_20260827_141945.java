// Last updated: 8/27/2026, 2:19:45 PM
1class Solution {
2    public int findMaximumXOR(int[] nums) {
3        int n=0,m=0;
4        for(int i=31;i>=0;i--){
5            m=m | (1 <<i);
6            Set<Integer>set=new HashSet<>();  
7            for(int num:nums){
8                set.add(num & m);
9            } 
10            int tmp=n | (1<< i);
11            for(int p:set){
12                if(set.contains(tmp^p)){
13                    n=tmp;
14                    break;
15                }
16            }
17        }
18        return n;
19    }
20}