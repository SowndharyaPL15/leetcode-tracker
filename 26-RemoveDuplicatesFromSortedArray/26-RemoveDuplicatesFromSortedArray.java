// Last updated: 9/9/2026, 2:18:07 PM
class Solution {
    public int removeDuplicates(int[]a) {
        int k = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1]) {
                a[k++] = a[i];
            }
        }
        return k;
    }
}