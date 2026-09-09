// Last updated: 9/9/2026, 2:10:23 PM
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String a=s+s;
        return a.substring(1,a.length()-1).contains(s);
    }
}