// Last updated: 7/9/2026, 9:50:02 AM
class Solution {
    public String triangleType(int[] nums) {
       int a=nums[0],b=nums[1],c=nums[2];
       if(a+b<=c || a+c<=b || b+c<=a){
        return "none";
       }
       if(a==b && b==c){
        return "equilateral";
       }
       if(a==b || b==c || c==a){
        return "isosceles";
       }
       return "scalene";
    }
}