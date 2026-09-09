// Last updated: 9/9/2026, 2:16:35 PM
class Solution {
    public int mySqrt(int x) {
       int left = 1,right = x, res = 0;
       if(x == 0){
         return x;
       }
       while(left <= right){
        int mid = left + ( right - left) /2;
        if((long)mid*mid <= x){
            left = mid +1;
            res = mid;
        }
        else{
            right=mid -1;
        }
       }
       return res;
    }
}