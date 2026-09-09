// Last updated: 9/9/2026, 2:15:16 PM
class Solution {
    public boolean isPalindrome(String s) {
    StringBuilder sb=new StringBuilder();
   for(char ch:s.toCharArray()){
    if(Character.isLetterOrDigit(ch)){
        sb.append(Character.toLowerCase(ch));
    }
    }
    String c=sb.toString();
    String d=sb.reverse().toString();
    return c.equals(d);
    }
}