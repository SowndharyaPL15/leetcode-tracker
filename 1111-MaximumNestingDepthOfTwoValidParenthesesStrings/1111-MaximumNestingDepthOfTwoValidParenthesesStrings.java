// Last updated: 9/9/2026, 2:07:10 PM
class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int[] result = new int[n];
        int depth = 0;
        for (int i = 0; i < n; i++) {
            if (seq.charAt(i) == '(') {
                result[i] = depth % 2;
                depth++;
            } else {
                depth--;
                result[i] = depth % 2;
            }
        }  
        return result;
    }
}
