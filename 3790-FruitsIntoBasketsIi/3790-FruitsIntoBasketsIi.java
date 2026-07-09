// Last updated: 7/9/2026, 9:49:19 AM
class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        boolean[] used = new boolean[n]; // tracks which baskets are used
        int unplaced = 0;

        for (int i = 0; i < n; i++) {
            boolean placed = false;
            for (int j = 0; j < n; j++) {
                if (!used[j] && baskets[j] >= fruits[i]) {
                    used[j] = true;
                    placed = true;
                    break;
                }
            }
            if (!placed) {
                unplaced++;
            }
        }

        return unplaced;
    }
}
