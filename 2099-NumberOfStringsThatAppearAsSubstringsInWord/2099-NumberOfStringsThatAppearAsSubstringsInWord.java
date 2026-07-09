// Last updated: 7/9/2026, 9:51:15 AM
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String s : patterns)
            if (word.indexOf(s) != -1) count++; 
        return count;
    }
}