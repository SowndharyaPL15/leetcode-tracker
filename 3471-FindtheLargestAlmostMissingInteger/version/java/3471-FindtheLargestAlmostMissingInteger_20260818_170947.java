// Last updated: 8/18/2026, 5:09:47 PM
1class Solution {
2    public int largestInteger(int[] nums, int k) {
3        int n=nums.length;
4        HashMap<Integer,Integer>map=new HashMap<>();
5        for(int i=0;i<=n-k;i++){
6            Set<Integer>set=new HashSet<>();
7            for(int j=i;j<i+k;j++){
8                set.add(nums[j]);
9            }
10            for(int num:set){
11                map.put(num,map.getOrDefault(num,0)+1);
12            }
13        }
14        int m=-1;
15        for(Map.Entry<Integer,Integer>e:map.entrySet()){
16            if(e.getValue()==1 && e.getKey()>m){
17                m=e.getKey();
18            }
19        }
20        return m;
21    }
22}