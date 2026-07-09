// Last updated: 7/9/2026, 9:51:59 AM
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // StringBuilder sb1 = new StringBuilder();
        // StringBuilder sb2 = new StringBuilder();
        // for (String s : word1) {
        //     sb1.append(s);
        // }
        // for (String s : word1) {
        //     sb2.append(s);
        // }
        // return sb1.toString().equals(sb2.toString());
        int i1 = 0, j1 = 0; 
        int i2 = 0, j2 = 0; 
        while (i1 < word1.length && i2 < word2.length) {
            char c1 = word1[i1].charAt(j1);
            char c2 = word2[i2].charAt(j2);
            if (c1 != c2){
                 return false;
            }
            j1++;
            if (j1 == word1[i1].length()) {
                j1 = 0;
                i1++;
            }
            j2++;
            if (j2 == word2[i2].length()) {
                j2 = 0;
                i2++;
            }
        }
        return i1 == word1.length && i2 == word2.length;
    }
}