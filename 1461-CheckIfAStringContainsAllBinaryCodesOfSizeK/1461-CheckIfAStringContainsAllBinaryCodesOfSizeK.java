// Last updated: 9/9/2026, 2:04:29 PM
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