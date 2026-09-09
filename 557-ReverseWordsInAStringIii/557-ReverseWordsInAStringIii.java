// Last updated: 9/9/2026, 2:10:01 PM
class Solution {
    public String reverseWords(String s) {
         String[] words=s.split(" ");
         StringBuilder result =new StringBuilder();
         for(String word:words){ 
            StringBuilder reverseWord =new StringBuilder(word);
            reverseWord.reverse();
            result.append(reverseWord).append(" ");
         }
         return result.toString().trim();
    }
}