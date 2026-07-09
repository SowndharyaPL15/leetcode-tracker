// Last updated: 7/9/2026, 9:50:59 AM
class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids); 
        long currentMass = mass; 
        for (int asteroid : asteroids) {
            if (currentMass < asteroid) {
                return false;
            }
            currentMass += asteroid;
        }
        return true;
    }
}