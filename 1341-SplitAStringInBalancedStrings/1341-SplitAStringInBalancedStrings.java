// Last updated: 7/9/2026, 9:52:48 AM
class Solution {
    public int balancedStringSplit(String s) {
        int b=0;
        int c=0;
        for(char ch:s.toCharArray()){
            if(ch=='R'){
                b++;
            }
            else{
                b--;
            }
            if(b==0){
                c++;
            }
        }
        return c;
    }
}
       

