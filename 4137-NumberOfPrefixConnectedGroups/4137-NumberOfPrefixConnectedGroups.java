// Last updated: 7/9/2026, 9:48:12 AM
class Solution {
    public int prefixConnected(String[] words, int k) {
        Set<String>r=new HashSet<>();
        Set<String>s=new HashSet<>();
        for(String w:words){
            if(w.length()<k){
                continue;
            }
            String p = w.substring(0,k);
            if(!s.add(p)){
                r.add(p);
            }
        }
        return r.size();
    }
}

