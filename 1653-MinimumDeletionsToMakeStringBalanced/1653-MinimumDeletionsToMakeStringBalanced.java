// Last updated: 9/9/2026, 2:03:20 PM
class Solution {
    public int minimumDeletions(String s) {
        int b=0,d=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='b'){
                b++;
            }
            else{
                d=Math.min(d+1,b);
            }
        }
        return d;
    }
}