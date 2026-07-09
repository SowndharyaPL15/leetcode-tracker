// Last updated: 7/9/2026, 9:51:30 AM
class Solution {
    public int countGoodSubstrings(String s) {
        char [] ch=s.toCharArray();
        int c=0;
        for(int i=0;i<ch.length-2;i++){
            char c1=ch[i];
            char c2=ch[i+1];
            char c3=ch[i+2];
            if(c1!=c2 && c1!=c3 && c2!=c3){
                c++;
            }
        }
        return c;
    }
}