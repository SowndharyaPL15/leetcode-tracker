// Last updated: 9/9/2026, 2:09:30 PM
class Solution {
    public int countBinarySubstrings(String s) {
        int p=0,c=1,co=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                c++;
            }else{
                co+=Math.min(p,c);
                p=c;
                c=1;
            }
        }
        co+=Math.min(p,c);
        return co;
    }
}