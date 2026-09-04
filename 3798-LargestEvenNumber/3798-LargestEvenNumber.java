// Last updated: 9/4/2026, 10:39:07 AM
class Solution {
    public String largestEven(String s) {
        int i;
        for(i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='2'){
                break;
            }
        }
        return s.substring(0,i+1);
    }
}