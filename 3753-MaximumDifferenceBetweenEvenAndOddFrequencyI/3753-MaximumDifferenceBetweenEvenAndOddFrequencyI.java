// Last updated: 7/9/2026, 9:49:24 AM
class Solution {
    public int maxDifference(String s) {
        int[] frequency = new int[26]; 
        for (char c : s.toCharArray()) {
            frequency[c - 'a']++;
        }
        int maxOdd = 0; 
        int minEven = Integer.MAX_VALUE;
        for (int freq : frequency) {
            if (freq % 2 == 0 && freq > 0) {
                minEven = Math.min(minEven, freq);
            } else if (freq % 2 != 0) {
                maxOdd = Math.max(maxOdd, freq);
            }
        }
        return maxOdd - minEven;
    }
}