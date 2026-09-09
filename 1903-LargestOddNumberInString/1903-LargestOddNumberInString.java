// Last updated: 9/9/2026, 12:37:28 PM
class Solution {
    public String largestOddNumber(String num) {
        int c=0;
        for(int i=num.length()-1;i>=0;i--){
            c=num.charAt(i)-'0';
            if(c%2==1){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}