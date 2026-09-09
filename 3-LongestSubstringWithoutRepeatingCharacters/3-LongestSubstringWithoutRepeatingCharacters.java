// Last updated: 9/9/2026, 2:19:11 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int maxlen=0;
        int left=0;
        Map<Character,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(s.charAt(i))){
                 left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i),i);
            maxlen=Math.max(maxlen,i-left+1);
        }
        return maxlen;
    }
}