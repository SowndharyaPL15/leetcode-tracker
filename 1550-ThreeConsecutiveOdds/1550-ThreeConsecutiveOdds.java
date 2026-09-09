// Last updated: 9/9/2026, 2:06:22 PM
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count=0;
        for(int num:arr){
            if(num%2 != 0){
                count++;
                if(count==3){
                    return true;
                }
            }
            else{
                count=0;
            }
        }
        return false;
    }
}