// Last updated: 9/9/2026, 2:11:22 PM
class Solution {
    public int firstUniqChar(String s) {
        int[] charCount=new int[26];
        for(char c:s.toCharArray()) {
            charCount[c-'a']++;
        }
        for(int i=0;i<s.length();i++) {
            if(charCount[s.charAt(i)-'a']==1) {
                return i;
            }
        }
        return -1;
    }
}