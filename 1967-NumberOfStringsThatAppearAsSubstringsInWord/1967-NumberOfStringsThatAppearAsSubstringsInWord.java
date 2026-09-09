// Last updated: 9/9/2026, 12:37:13 PM
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String s : patterns)
            if (word.indexOf(s) != -1) count++; 
        return count;
    }
}