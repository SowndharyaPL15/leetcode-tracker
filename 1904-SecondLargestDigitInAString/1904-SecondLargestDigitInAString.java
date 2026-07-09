// Last updated: 7/9/2026, 9:51:44 AM
class Solution {
    public int secondHighest(String s) {
        int sec=-1,max=-1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='0' && ch<='9'){
               int d= ch-'0';
               if(d>max){
                sec=max;
                max=d;
               }
               else if(d<max && d>sec){
                sec=d;
               }
            }
        }
        return sec;
    }
}