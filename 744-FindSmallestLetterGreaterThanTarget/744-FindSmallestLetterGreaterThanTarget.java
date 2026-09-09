// Last updated: 9/9/2026, 2:09:19 PM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(char a:letters){
            if(a>target){
                return a;
            }
        }
        return letters[0];
    }
}