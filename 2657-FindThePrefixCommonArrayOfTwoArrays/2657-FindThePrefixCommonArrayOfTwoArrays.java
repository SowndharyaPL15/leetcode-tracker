// Last updated: 9/9/2026, 12:35:23 PM
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] prefixCommonArray = new int[n];
        for (int currentIndex = 0; currentIndex < n; ++currentIndex) {
            int commonCount = 0;
            for (int aIndex = 0; aIndex <= currentIndex; ++aIndex) {
                for (int bIndex = 0; bIndex <= currentIndex; ++bIndex) {
                    if (A[aIndex] == B[bIndex]) {
                        ++commonCount;
                        break; 
                    }
                }
            }
            prefixCommonArray[currentIndex] = commonCount;
        }
        return prefixCommonArray;
    }
}