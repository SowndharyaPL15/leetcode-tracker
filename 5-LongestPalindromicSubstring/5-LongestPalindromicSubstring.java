// Last updated: 9/9/2026, 2:19:03 PM
class Solution {   
    public String longestPalindrome(String s){
        String longest = "";
        for(int i=0;i<s.length();i++){
            String odd = expand(s,i,i);
            String even = expand(s,i,i+1);
            if(odd.length()>longest.length()){
                 longest=odd;
            }
            if(even.length()>longest.length()){
                 longest=even;
            }
        }
        return longest;
    }
    
    static String expand(String s, int l, int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--; r++;
        }
        return s.substring(l+1,r);
    }
    

}
