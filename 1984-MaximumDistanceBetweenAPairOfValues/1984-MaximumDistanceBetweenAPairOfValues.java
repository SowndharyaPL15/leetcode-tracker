// Last updated: 7/9/2026, 9:51:31 AM
class Solution {
    public int maxDistance(int[] A, int[] B) {
        int i, j;
        for (i = 0, j = 0; i < A.length && j < B.length; j++)
            if (A[i] > B[j])
                i++;
        return Math.max(0, j - i - 1);
    }
}