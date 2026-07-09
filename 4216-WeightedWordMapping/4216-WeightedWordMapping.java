// Last updated: 7/9/2026, 9:48:13 AM
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans = new StringBuilder(words.length);
        for (String word : words) {
            int s = 0;
            for (int i = 0; i < word.length(); i++) {
                s += weights[word.charAt(i) - 'a'];
            }
            ans.append((char) ('z' - (s % 26)));
        }
        return ans.toString();
    }
}