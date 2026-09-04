// Last updated: 9/4/2026, 10:48:11 AM
class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
            if(map.get(n)>2){
                return false;
            }
        }
        return true;
    }
}