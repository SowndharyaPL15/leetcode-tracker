// Last updated: 9/9/2026, 2:05:59 PM
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
       

