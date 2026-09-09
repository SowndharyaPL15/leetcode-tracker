// Last updated: 9/9/2026, 2:04:41 PM
class Solution {
    public int numSteps(String s) {
        int st=0,c=0;
        for(int i=s.length()-1;i>0;i--) {
            int bit=s.charAt(i)&1;
            st+=1+(bit^c);
            c|=bit;
        }
        return st+c;
    }
}