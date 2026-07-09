// Last updated: 7/9/2026, 9:52:22 AM
class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String>set=new HashSet<>();
        int t=1<<k;
        for(int i=0;i<=s.length()-k;i++){
            String a=s.substring(i,i+k);
            set.add(a);
            if(set.size()==t) {
                return true;
            }
        }
        return set.size()==t;
    }
}